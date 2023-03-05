package com.study.festlib.service;

import com.study.festlib.domain.Festival;
import com.study.festlib.repository.FestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FestService{

    @Autowired
    private FestRepository festRepository;


    //페스티벌 정보 select
    public Festival selectOneFest(String festa_id) {
        return festRepository.selectOneFest(festa_id);
    }


    //페스티벌 등록 요청 insert
    public void requestFest(Festival festival){
        festRepository.insertFestival(festival);
    }

    //관리자
    //등록된 페스티벌 리스트 select
    public List<Festival> festList(){
        List<Festival> festivalList = festRepository.selectFestList();
        return festivalList;
    }

    //등록요청받은 페스티벌 리스트
    public List<Festival> requestFestList(){
        List<Festival> festivalList = festRepository.selectReqFestList();
        return festivalList;
    }

    //페스티벌 정보 수정
    public void festivalModify(Festival festival){
        festRepository.updateFestival(festival);
    }

    //페스티벌 등록
    public void festivalRegister(String fest_id){
        festRepository.updateFestivalReg(fest_id);
    }
}
