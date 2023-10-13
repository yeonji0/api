package com.board.api.board.service;

import com.board.api.board.Board;
import com.board.api.board.mapper.BoardMapper;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;

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
    public List<Board> getBoardName() {
        return boardMapper.getBoardName();
    }

}

