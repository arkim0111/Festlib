package com.study.festlib.service;

import com.study.festlib.domain.Board;
import com.study.festlib.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public interface BoardService {

    // 게시글 작성 기능
    void insertBoard(Board board) throws Exception;

    // 게시글 상세 보기
    Board selectOneBoard(String fno, String bno) throws Exception ;

    // 전체 게시글 리스트 삭제
    List<Board> deleteAllBoard() throws Exception;

    // 전체 게시글 개수 조회
    int getCountBoard() throws Exception;
}
