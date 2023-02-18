package com.study.festlib.repository;

import com.study.festlib.domain.Festival;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FestRepository {

    Festival selectOneFest(String FESTA_ID);
}
