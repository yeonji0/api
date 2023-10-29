package com.board.api.board;


import lombok.*;
import java.time.LocalDate;
@Data
@Getter
@Setter
public class Board {

    private Long num;
    private Long rownum;
    private String name;
    private String title;
    private String content;
    private LocalDate createdDate;
    private LocalDate modifiedDate;


}
