package com.study.festlib.repository;

import com.study.festlib.domain.Board;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface BoardRepository {

    List<Board> getFestBoardList(); // 게시글 리스트 조회

    List<Board> getAllBoardList(); // (관리자 페이지) 모든 게시글 리스트 조회

    void insertOneBoard(Board board) throws Exception ; // 게시글 작성 기능

    void updateOneBoard(Board board) throws Exception ; // 게시글 수정 기능

}
