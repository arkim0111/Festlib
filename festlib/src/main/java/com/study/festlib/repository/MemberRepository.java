package com.study.festlib.repository;

import com.study.festlib.domain.Member;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberRepository {

    //회원정보 by ID
    public Member selectOneMembyID(String MEM_ID);

    //회원정보 by IDX
    public Member selectOneMem(Integer MEM_IDX);

    //회원정보 insert
    public void insertOneMem(Member member);

    //회원수정 update
    public void updateOneMem(Member member);

    //회원정지 or 탈퇴 update
    public void deleteOneMem(Integer MEM_IDX);

    //회원 리스트
    public List<Member> selectMemList();
}
