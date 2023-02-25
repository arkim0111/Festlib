package com.study.festlib.repository;

import com.study.festlib.domain.Board;
import org.junit.jupiter.api.Test;

public class BoardRepositoryTest {

    BoardRepositoryImpl repository = new BoardRepositoryImpl();

    @Test
    public void insertOneBoard() {
        Board board = new Board();
        board.setBoard_festa_id("sjf");
        board.setBoard_mem_id("mem1");
        board.setBoard_title("title1");
        board.setBoard_content("content1");

        repository.insertBoard(board);

        System.out.println(board);
    }
}
