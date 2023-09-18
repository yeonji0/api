package com.board.api.board.mapper;

import com.board.api.board.Board;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;
@Mapper
public interface BoardMapper {
    Board getBoard(int num);
    List<Board> getBoardList();

    int createBoard(Board board);

    int updateBoard(Board board);

}