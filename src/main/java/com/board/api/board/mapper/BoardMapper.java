package com.board.api.board.mapper;

import com.board.api.board.Board;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface BoardMapper {
    @Select("select @rownum:=@rownum+1 as rownum, T.* from board T,(select @rownum := 0)tmp order by num DESC")
    List<Board> getBoardList();
    @Select("select * from board where num=#{board}")
    Board getBoard(@Param("board") Long board);
    @Insert("insert into board (name, title, content, created_date, modified_date) " +
            "values (#{name}, #{title}, #{content}, #{createdDate}, #{modifiedDate})"
    )
    void insertBoard(Board board);
    @Select("UPDATE board SET title=#{title}, content=#{content} WHERE num=#{num}")
    void updateBoard(Board board);


}