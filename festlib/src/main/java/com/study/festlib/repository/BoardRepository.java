package com.study.festlib.repository;

import com.study.festlib.domain.Board;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface BoardRepository {
    int insertOneBoard(Board board) throws Exception; // 게시글 작성 기능
    Board selectOneBoard(String fno, String bno)  ; // 게시글 상세 보기
    int deleteAllBoard() ; // 전체 게시글 리스트 삭제
    int getCountBoard() ; // 전체 게시글 개수 조회
    List<Board> getFestBoardList(String fno); // 게시글 리스트 조회
    Board updateOneBoard(String fno, Long bno); // 게시글 수정 기능
    List<Board> getAllBoardList(); // (관리자 페이지) 모든 게시글 리스트 조회
    List<Board> getMyBoard(String id); // (마이 페이지) 내가 쓴 게시글 조회
}
