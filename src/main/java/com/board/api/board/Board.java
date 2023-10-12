package com.board.api.board;

//import jakarta.persistence.*;
import lombok.*;
//import org.springframework.data.annotation.CreatedDate;
//import org.springframework.data.annotation.LastModifiedDate;
import java.util.Date;
import java.time.LocalDateTime;
@Data
@Getter
@Setter
//@EqualsAndHashCode(callSuper = false)
public class Board {

    private Long num;
    private String name;
    private String title;
    private String content;
    private Date createdDate;
    private Date modifiedDate;

//    public Board(){};
//    public Board(Long num,String name, String title,String content,Date createdDate,Date modifiedDate){
//        super();
//        this.num=num;
//        this.name=name;
//        this.title=title;
//        this.content=content;
//        this.createdDate=createdDate;
//        this.modifiedDate=modifiedDate;
//    };

}