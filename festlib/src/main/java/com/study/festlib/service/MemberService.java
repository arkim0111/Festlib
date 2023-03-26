package com.study.festlib.service;


import com.study.festlib.domain.Member;
import com.study.festlib.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {
    @Autowired
    MemberRepository memberRepository;

    //회원정보 select by id
    public Member selectOneMembyID(String MEM_ID) throws Exception{
        return memberRepository.selectOneMembyID(MEM_ID);
    }

    //회원정보 select by idx
    public Member selectOneMem(Integer MEM_IDX) throws Exception{
        return memberRepository.selectOneMem(MEM_IDX);
    }

    //회원정보 insert
    public void insertOneMem(Member member) throws Exception{
        memberRepository.insertOneMem(member);
    }

    //회원수정 update
    public void memModify(Integer mem_idx, Member updatemember) throws Exception{

        Member member = memberRepository.selectOneMem(mem_idx);

        member.setMEM_PW(updatemember.getMEM_PW());
        member.setMEM_PHONE(updatemember.getMEM_PHONE());

        memberRepository.updateOneMem(member);
    }

    //회원정지 or 탈퇴 update
    public void memDelete(Integer MEM_IDX) throws Exception{
        memberRepository.deleteOneMem(MEM_IDX);
    }

    //회원 리스트
    public List<Member> memList() throws Exception{
        return memberRepository.selectMemList();
    }
}
