package com.study.festlib.service;

import com.study.festlib.domain.Board;
import com.study.festlib.repository.BoardRepository;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
@Slf4j
@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BoardServiceTest {

    @Autowired
    BoardServiceImpl boardService;

    @BeforeEach
    public void 초기셋팅() {
    }

    @AfterEach
    public void 초기화()  {
        // 테스트 끝나면 전체 게시글 삭제
        boardService.deleteAllBoard();
    }

    @Order(1)
    @Test
    @DisplayName("게시글 작성 테스트")
    void 게시글작성() throws Exception {
        // given
        Board board = new Board();
        // board_idx, date는 자동 생성
        board.setBOARD_MEM_ID("mem1");
        board.setBOARD_FESTA_ID("sjf");
        board.setBOARD_TITLE("제목1");
        board.setBOARD_CONTENT("내용1");

        //when
        boardService.insertBoard(board);
        log.info("test : " + board.getBOARD_MEM_ID() + " 게시글 등록 완료");

        // then
        assertThat(boardService.getCountBoard()).isEqualTo(1);
    }
    @Order(2)
    @Test
    @DisplayName("게시글 리스트 보기")
    void 게시글리스트보기() throws Exception {
        // given
        Board board = new Board();
        // board_idx, date는 자동 생성
        board.setBOARD_MEM_ID("mem1");
        board.setBOARD_FESTA_ID("sjf");
        board.setBOARD_TITLE("제목1");
        board.setBOARD_CONTENT("내용1");

        //when
        boardService.insertBoard(board);
        log.info("test 1 : " + board.getBOARD_MEM_ID() + " 게시글 등록 완료");
        log.info("test 2 : " + "fno = sjf인 게시글리스트 보기 " + boardService.selectBoardList("sjf"));

        // then
        assertThat(boardService.getCountBoard()).isEqualTo(1);
    }
}
