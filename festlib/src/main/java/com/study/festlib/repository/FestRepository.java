package com.study.festlib.repository;

import com.study.festlib.domain.Festival;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FestRepository {

    Festival selectOneFest(String FESTA_ID);

    public List<Festival> selectFestivals();
}
