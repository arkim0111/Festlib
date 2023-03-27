package com.study.festlib.service;

import com.study.festlib.domain.Board;
import java.util.List;

public interface BoardService {

    void insertBoard(Board board) throws Exception; // 게시글 작성 기능
    Board selectOneBoard(String fno, String bno) ;  // 게시글 상세 보기
    void deleteAllBoard() ; // 전체 게시글 리스트 삭제
    int getCountBoard() ;  // 전체 게시글 개수 조회
    List<Board> selectBoardList(String fno); // 전체 게시글 리스트 보기
    Board updateOneBoard(String fno, Long bno); // 게시글 수정 기능
    List<Board> selectAllBoardList(); // (관리자 페이지) 모든 게시글 리스트 조회
    List<Board> selectMyBoard(String id); // (마이 페이지) 내가 쓴 게시글 조회
}
