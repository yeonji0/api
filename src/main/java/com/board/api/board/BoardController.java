package com.board.api.board;

import com.board.api.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;
import java.util.List;

@Controller
public class BoardController {
    private BoardService boardService;

    @Autowired
    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @GetMapping("/")
    public String index(Model model) {
        List<Board> boardList = boardService.getBoardList();
        model.addAttribute("boardList", boardList);

        int pageCount = boardList.size();
        model.addAttribute("count",pageCount);

        return "index";
    }

    @GetMapping("/post")
    public String openBoardPost() throws Exception {
        return "post";
    }

    @PostMapping("/post")
    public String insertBoard(@ModelAttribute Board board) throws Exception {
        board.setCreatedDate(LocalDate.now());
        boardService.insertBoard(board);
        return "redirect:/";
    }
    @GetMapping("/view")
    public String boardView(Model model, @RequestParam Long num) {
        model.addAttribute("board", boardService.boardView(num));
        return "view";
    }
    @PutMapping("/update")
    public String updateBoard(@ModelAttribute Board board) {
        boardService.updateBoard(board);
        return "redirect:/";
    }

}
