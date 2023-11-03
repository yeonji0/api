package com.board.api.board.service;

import com.board.api.board.Board;
import com.board.api.board.Pagination;
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

    public int getBoardList() {
        return boardMapper.getBoardList();
    }

    @Transactional
    public void insertBoard(Board board) throws Exception {
        boardMapper.insertBoard(board);
    }

    public Board boardView(Long num) {
        return boardMapper.getBoard(num);
    }

    @Transactional
    public void updateBoard(Board board) {
        boardMapper.updateBoard(board);
    }

    @Transactional
    public void deleteBoard(Long num) throws Exception {
        boardMapper.deleteBoard(num);
    }

    public List<Board> getListWithPaging(Pagination pagination) {
        int start = (pagination.getCurPage() - 1) * pagination.getPageSize();
        return boardMapper.getBoardsWithPaging(start, pagination.getPageSize());
    }
}
