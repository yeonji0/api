package com.board.api.board.mapper;

import com.board.api.board.Board;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.List;
import java.util.Map;

@Mapper
public interface BoardMapper {
    @Select("select * from board")
    List<Board> getBoardList();
    @Select("SELECT name FROM board")
    List<Board> getBoardName();

}
