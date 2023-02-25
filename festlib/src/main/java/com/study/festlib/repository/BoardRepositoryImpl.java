package com.study.festlib.repository;

import com.study.festlib.domain.Board;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BoardRepositoryImpl implements BoardRepository {

    private static Map<Long, Board> store =new HashMap<>();
    private static long sequence = 0L; // 자동으로 0,1,2... 생성해줌

    @Override
    public List<Board> getFestBoardList() {
        return null;
    }
    @Override
    public List<Board> getAllBoardList() {
        return null;
    }
    @Override
    public void insertBoard(Board board) {
        board.setBoard_idx(++sequence); // board_idx에 sequence 부여

        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        board.setBoard_date(date.format(formatter)); // 현재 날짜를 board_date에 추가

        store.put(board.getBoard_idx(), board); // BOARD IDX에 board 추가해줌

    }

    @Override
    public void updateBoard(Board board) {

    }
}
