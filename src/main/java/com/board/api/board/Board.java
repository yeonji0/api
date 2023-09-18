package com.board.api.board;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Board {

    private Long num;
    private String name;
    private String title;
    private String content;

    @Data
    @EqualsAndHashCode(callSuper = false)
    public static class BoardUser {
        private Long name;
    }
}
