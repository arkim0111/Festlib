package com.study.festlib.controller;

import com.study.festlib.domain.Member;
import com.study.festlib.service.FestService;
import com.study.festlib.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RequestMapping("/Festlib")
@RestController
public class MemberController {

    @Autowired
    MemberService memberService;

    //회원가입
    //아이디 중복 확인
    @GetMapping(value = "/confirmID")
    public String confirmID(Member member)throws Exception{
        System.out.println(member.getMEM_ID());

        String idCheck = String.valueOf(memberService.selectOneMem(member.getMEM_ID()));

        System.out.println(idCheck);
        return idCheck; //1: 중복, 0:중복없음
    }

    //회원가입 성공
    @PostMapping(value = "/joinSuccess")
    public void joinSuccess(Member member) throws Exception {
        memberService.insertOneMem(member);
    }



    //마이페이지
    //회원정보수정
    @PostMapping(value = "/mypage/memModify")
    public void memModify(Member member) throws Exception{
        memberService.memModify(member);
    }

    //회원정보
    @GetMapping(value = "/mypage/memDetail")
    Member memDetail(String MEM_ID) throws Exception{
        Member member = memberService.selectOneMem(MEM_ID);
        return member;
    }

    //회원탈퇴
    @PostMapping(value = "/mypage/memDelete")
    public void memDelete(Integer MEM_IDX) throws Exception{
        memberService.memDelete(MEM_IDX);
    }


    //관리자
    //회원 리스트 조회
    @GetMapping(value = "/memList")
    List<Member> memList() throws Exception{
        List<Member> memberList = memberService.memList();
        return memberList;
    }

}
