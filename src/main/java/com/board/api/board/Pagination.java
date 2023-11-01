package com.board.api.board;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class Pagination {
    private int curPage; // 현재 페이지
    private int listCnt; // 총 게시물 수
    private int pageSize; // 한 페이지당 보여줄 게시물 수
    private int rangeSize; // 한 블럭(range)당 페이지 수
    private int pageCnt; // 총 페이지 수
    private int rangeCnt; // 총 블럭(range) 수
    private int startPage; // 시작 페이지
    private int endPage; // 마지막 페이지
    private int prevPage; // 이전 페이지
    private int nextPage; // 다음 페이지
    public Pagination(int listCnt, int curPage, int pageSize, int rangeSize) {
        this.listCnt = listCnt;
        this.curPage = curPage;
        this.pageSize = pageSize;
        this.rangeSize = rangeSize;

        rangeSetting(curPage); //현재 페이지 기준 페이지 범위 설정
    }
    public void setPageCnt(int listCnt) { // 총 페이지 수를 계산하는 메서드
        this.pageCnt = (int) Math.ceil((double) listCnt / pageSize);
    }
    public void rangeSetting(int curPage) { //페이지 범위 메서드
        setPageCnt(listCnt);
        //setRangeCnt();
        // 현재 페이지를 기반으로 시작 페이지 및 끝 페이지 설정
        this.startPage = Math.max(1, curPage - (rangeSize / 2));
        this.endPage = Math.min(pageCnt, startPage + rangeSize - 1);

        // 이전 페이지 및 다음 페이지 설정
        this.prevPage = Math.max(1, curPage - 1);
        this.nextPage = Math.min(pageCnt, curPage + 1);
    }
}
