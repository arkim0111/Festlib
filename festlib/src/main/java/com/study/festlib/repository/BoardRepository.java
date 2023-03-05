package com.study.festlib.repository;

import com.study.festlib.domain.Board;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardRepository {
    int insertOneBoard(Board board) throws Exception; // 게시글 작성 기능
    Board selectOneBoard(String board_festa_id, String board_idx)  ; // 게시글 상세 보기
    List<Board> deleteAllBoard() ; // 전체 게시글 리스트 삭제
    int getCountBoard() ; // 전체 게시글 개수 조회
}
