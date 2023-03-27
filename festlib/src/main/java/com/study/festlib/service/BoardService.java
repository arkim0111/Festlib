package com.study.festlib.service;

import com.study.festlib.domain.Board;
import java.util.List;

public interface BoardService {

    // 게시글 작성 기능
    void insertBoard(Board board) throws Exception;

    // 게시글 상세 보기
    Board selectOneBoard(String fno, String bno) ;

    // 전체 게시글 리스트 삭제
    void deleteAllBoard() ;

    // 전체 게시글 개수 조회
    int getCountBoard() ;

    // 전체 게시글 리스트 보기
    List<Board> selectBoardList(String fno);
}
