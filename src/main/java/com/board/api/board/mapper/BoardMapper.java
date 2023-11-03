package com.board.api.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.*;
import com.board.api.board.Board;


@Mapper
public interface BoardMapper {
    int getBoardList();

    Board getBoard(@Param("board") Long board);

    void insertBoard(Board board);

    void updateBoard(Board board);

    void deleteBoard(Long num) throws Exception;

    List<Board> getBoardsWithPaging(@Param("offset") int offset, @Param("amount") int amount);

}