package com.study.festlib.repository;

import com.study.festlib.domain.Board;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardRepository {

    List<Board> getBoardList();
}
