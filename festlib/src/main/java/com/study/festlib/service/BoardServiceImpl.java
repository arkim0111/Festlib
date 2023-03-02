package com.study.festlib.service;

import com.study.festlib.domain.Board;
import com.study.festlib.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BoardServiceImpl implements BoardService{


    @Autowired
    private BoardRepository boardRepository;

    private static Map<Long, Board> store =new HashMap<>();
    private static long sequence = 0L; // 자동으로 0,1,2... 생성해줌


    @Override
    public void insertBoard(Board board) throws Exception {
        board.setBoard_idx(++sequence); // board_idx에 sequence 부여

        store.put(board.getBoard_idx(), board); // BOARD IDX에 board 추가해줌
        boardRepository.insertOneBoard(board);
    }

    @Override
    public Board selectOneBoard(String fno, String bno) throws Exception {
        return boardRepository.selectOneBoard(fno, bno);
    }

    @Override
    public List<Board> deleteAllBoard() throws Exception {
        return boardRepository.deleteAllBoard();
    }

    @Override
    public int getCountBoard() throws Exception {
        return boardRepository.getCountBoard();
    }
}
