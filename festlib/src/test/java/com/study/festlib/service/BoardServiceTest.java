package com.study.festlib.service;

import com.study.festlib.domain.Board;
import com.study.festlib.repository.BoardRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.servlet.ServletException;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


@Slf4j
public class BoardServiceTest {

    private BoardService boardService;
    private BoardRepository boardRepository;

    @BeforeEach
    void 초기셋팅() {
        Board board = null;
    }

    @AfterEach
    void 초기화() throws Exception {
        // 테스트 끝나면 전체 게시글 삭제
        boardService.deleteAllBoard();
    }

    @Test
    @DisplayName("게시글 작성 테스트")
    void 게시글작성() throws  Exception {
        // given
        Board board = new Board();
        // board_idx, date는 자동 생성
        board.setBoard_mem_id("mem1");
        board.setBoard_festa_id("sjf");
        board.setBoard_title("제목1");
        board.setBoard_content("내용1");

        //when
        boardService.insertBoard(board);

        // then
        assertThat(boardService.getCountBoard()).isEqualTo(1);
    }
}
