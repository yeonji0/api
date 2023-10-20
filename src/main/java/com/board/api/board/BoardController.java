package com.board.api.board;

import com.board.api.board.Board;
import com.board.api.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.text.SimpleDateFormat;

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
        System.out.println(boardList);

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

}
