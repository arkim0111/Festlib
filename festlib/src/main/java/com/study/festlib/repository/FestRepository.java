package com.study.festlib.repository;

import com.study.festlib.domain.Festival;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FestRepository {

    //페스티벌 상세보기
    Festival selectOneFest(String FESTA_ID);

    //페스티벌 요청
    public void insertFestival(Festival festival);

    //관리자
    //모든 페스티벌 리스트
    List<Festival> selectFestivals();

}
