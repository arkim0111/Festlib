/*
package com.study.festlib.repository;

import com.study.festlib.domain.Board;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;

public class BoardRepositoryTest {

    @Autowired
    BoardRepository boardRepository;

    @Test
    public int insertOneBoard() throws Exception {
        Board board = new Board();
        board.setBoard_mem_id("mem1");
        board.setBoard_festa_id("sjf");
        board.setBoard_title("제목1");
        board.setBoard_content("내용1");
        board.setBoard_date(LocalDate.now());
        board.setBoard_idx(1L);

        return boardRepository.insertOneBoard(board);

    }

}
*/
