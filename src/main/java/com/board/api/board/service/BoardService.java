package com.board.api.board.service;

import com.board.api.board.Board;
import com.board.api.board.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BoardService {
    private BoardMapper boardMapper;

    @Autowired
    public BoardService(BoardMapper boardMapper) {
        this.boardMapper = boardMapper;
    }

    public List<Board> getBoardList() {
        return boardMapper.getBoardList();
    }
    @Transactional
    public void insertBoard(Board board) throws Exception {
        boardMapper.insertBoard(board);
    }
}
