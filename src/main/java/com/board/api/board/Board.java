package com.board.api.board;

//import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
//import org.springframework.data.annotation.CreatedDate;
//import org.springframework.data.annotation.LastModifiedDate;
import java.util.Date;
import java.time.LocalDateTime;
@Data
@EqualsAndHashCode(callSuper = false)
public class Board {

    private Long num;
    private String name;
    private String title;
    private String content;

    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;
    public Board(){}
    public Board(Long num, String name, String title, String content) {
        this.num = num;
        this.name = name;
        this.title = title;
        this.content = content;
    }

}
