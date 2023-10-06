package com.board.api.board.mapper;

import com.board.api.board.Board;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface BoardMapper {
    @Select("SELECT * FROM board")
    Board findByName(@Param("name") String name);

//    List<Map<String, Object>> getBoardList();

    @Select("SELECT * FROM board")
    void getNum(@Param("num") Long num);
//    Board getBoard(int num);
}