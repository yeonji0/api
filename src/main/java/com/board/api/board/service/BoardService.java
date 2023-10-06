package com.board.api.board.service;

import com.board.api.board.Board;
import com.board.api.board.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class BoardService {
    private BoardMapper boardMapper;
    @Autowired
    public BoardService(BoardMapper boardMapper) {
        this.boardMapper = boardMapper;
    }

    //    public static List<Board> getBoardList() {
//        return this.boardMapper.getBoardList();
//    }
}
