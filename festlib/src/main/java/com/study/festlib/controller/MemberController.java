package com.study.festlib.controller;

import com.study.festlib.domain.Member;
import com.study.festlib.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequestMapping("/Festlib")
@RestController
public class MemberController {

    @Autowired
    MemberService memberService;

    //회원가입
    //아이디 중복 확인
    @GetMapping(value = "/confirmID/{id}")
    public String confirmID(@PathVariable("id") String id)throws Exception{

        String idCheck = String.valueOf(memberService.selectOneMembyID(id));

        System.out.println(idCheck);
        return idCheck; //1: 중복, 0:중복없음
    }

    //이메일인증 - 이건 나중에 찾아보고


    //회원가입 성공
    @PostMapping(value = "/join")
    public void join(@RequestBody Member member) throws Exception {
        memberService.insertOneMem(member);
    }



    //마이페이지
    //회원정보수정
    @PutMapping(value = "/mypage/{idx}")
    public void memModify(@PathVariable("idx") Integer MEM_IDX, @RequestBody Member member) throws Exception{
        memberService.memModify(MEM_IDX,member);
    }

    //회원정보
    @GetMapping(value = "/mypage/{idx}")
    Member memDetail(@PathVariable("idx") Integer MEM_IDX) throws Exception{
        Member member = memberService.selectOneMem(MEM_IDX);
        return member;
    }

    //회원탈퇴
    @PostMapping(value = "/mypage/{idx}/delete")
    public void memDelete(@PathVariable("idx") Integer MEM_IDX) throws Exception{
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
