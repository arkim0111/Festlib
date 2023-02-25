package com.study.festlib.service;

import com.study.festlib.domain.Board;
import com.study.festlib.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;

    public List<Board> getFestBoardList() { // 게시글 리스트 조회
        return boardRepository.getFestBoardList();
    }

    public List<Board> getAllBoardList() { // 게시글 리스트 조회
        return boardRepository.getAllBoardList();
    }

    public void insertBoard(Board board) throws Exception  { // 게시글 작성 기능
        boardRepository.insertOneBoard(board);
    }

    public void modifyBoard(Board board) throws Exception  { // 게시글 수정 기능
        boardRepository.updateOneBoard(board);
    }



}
