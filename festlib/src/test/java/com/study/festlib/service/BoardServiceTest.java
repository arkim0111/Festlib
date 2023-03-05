package com.study.festlib.service;

import com.study.festlib.domain.Board;
import com.study.festlib.repository.BoardRepository;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
@Slf4j
public class BoardServiceTest {

    BoardService boardService;

    @BeforeEach
    public void 초기셋팅() {

    }

/*    @AfterEach
    public void 초기화()  {
        // 테스트 끝나면 전체 게시글 삭제
        boardService.deleteAllBoard();
    }*/

    @Test
    @DisplayName("게시글 작성 테스트")
    void 게시글작성() throws Exception {
        // given
        Board board = new Board();
        // board_idx, date는 자동 생성
        board.setBoard_mem_id("mem1");
        board.setBoard_festa_id("sjf");
        board.setBoard_title("제목1");
        board.setBoard_content("내용1");
        board.setBoard_date(LocalDate.now());
        board.setBoard_idx(1L);

        //when
        boardService.insertBoard(board);
        log.info("test : " + board.getBoard_mem_id() + "게시글 등록 완료");

        // then
        assertThat(boardService.getCountBoard()).isEqualTo(1);
    }
}
