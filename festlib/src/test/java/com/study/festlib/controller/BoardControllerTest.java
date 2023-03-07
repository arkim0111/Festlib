package com.study.festlib.controller;

import com.study.festlib.domain.Board;
import com.study.festlib.service.BoardServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.filter.CharacterEncodingFilter;

import java.time.LocalDateTime;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.willReturn;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@WebMvcTest(BoardController.class)
public class BoardControllerTest {
    private MockMvc mvc;
    @MockBean
    private BoardServiceImpl boardService;

    @BeforeEach
    public void setUp() {
        mvc =
                MockMvcBuilders.standaloneSetup(new BoardController(boardService))
                        .addFilters(new CharacterEncodingFilter("UTF-8", true)) // utf-8 필터 추가
                        .build();
    }

    @Test
    @DisplayName("게시글 등록 테스트")
    void 게시글등록() throws Exception {
        // given
        final LocalDateTime now = LocalDateTime.now();
        given(boardService.insertBoard(Board board);))
                .willReturn(
                        Board.builder()
                                .BOARD_IDX(1L)
                                .BOARD_MEM_ID("mem11")
                                .BOARD_TITLE("제목11")
                                .BOARD_CONTENT("내용11")
                                .BOARD_FESTA_ID("sjf1")
                                .BOARD_DATE(now)
                                .build());

        // when
        final ResultActions actions =
                mvc.perform(
                        post("/sjf/board/put")
                                .contentType(MediaType.APPLICATION_JSON)
                                .accept(MediaType.APPLICATION_JSON)
                                .characterEncoding("UTF-8")
                                .content(
                                        "{"
                                                + "  \"BOARD_MEM_ID\" : \"mem1\", "
                                                + "  \"BOARD_TITLE\" : \"제목1\", "
                                                + "  \"BOARD_CONTENT\": \"내용1\", "
                                                + "  \"BOARD_FESTA_ID\": \"sjf\", "
                                                + "}"));


        // then
        actions
                .andExpect(status().isCreated())
                .andExpect(jsonPath("BOARD_MEM_ID").value("mem1"))
                .andExpect(jsonPath("BOARD_TITLE").value("제목1"))
                .andExpect(jsonPath("BOARD_CONTENT").value("내용1"))
                .andExpect(jsonPath("BOARD_FESTA_ID").value("sjf"));
    }
}

