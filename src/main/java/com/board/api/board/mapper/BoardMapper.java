package com.board.api.board.mapper;

import com.board.api.board.Board;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface BoardMapper {
    @Select("select * from board")
    List<Board> getBoardList();
    @Insert("insert into board (name, title, content, created_date, modified_date) " +
            "values (#{name}, #{title}, #{content}, #{createdDate}, #{modifiedDate})"
    )
    void insertBoard(Board board);


}