package com.study.festlib.service;

import com.study.festlib.domain.Board;
import com.study.festlib.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService{

    private BoardRepository boardRepository;
    @Autowired
    public BoardServiceImpl(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    @Override
    public void insertBoard(Board board) throws Exception {
        boardRepository.insertOneBoard(board);
    }

    @Override
    public Board selectOneBoard(String fno, String bno) {
        return boardRepository.selectOneBoard(fno, bno);
    }

    @Override
    public void deleteAllBoard() {
        boardRepository.deleteAllBoard();
    }

    @Override
    public int getCountBoard() {
        return boardRepository.getCountBoard();
    }

    @Override
    public List<Board> selectBoardList(String fno) {
        return boardRepository.getFestBoardList(fno);
    }
}
