package com.board.api.board;

//import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;
//import org.springframework.data.annotation.CreatedDate;
//import org.springframework.data.annotation.LastModifiedDate;
import java.time.LocalDate;
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
    private LocalDate createdDate;
    private LocalDate modifiedDate;

}