package com.example.api.controller;

import com.example.api.dto.MemberDto;
import com.example.api.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/member")
public class MemberController {
    private final MemberService memberService;
    @GetMapping("/list")
    public List<MemberDto> getMember(){
        List<MemberDto> memberInfoList = memberService.getMember();
        return memberInfoList;
    }

    @PostMapping("/register")
    public MemberDto saveMember(@RequestBody MemberDto memberDtoRequest){
        MemberDto memberDtoResponse = memberService.saveMember(memberDtoRequest);
        return memberDtoResponse;
    }

    @DeleteMapping("/delete/{id}")
    public String deleteMember(@PathVariable("id") Long id){
        memberService.deleteMemberById(id);
        return "삭제 완료";
    }

    @PutMapping("/update")
    public MemberDto updateMember(@RequestBody MemberDto memberDtoRequest){
        MemberDto memberDtoResponse = memberService.updateMember(memberDtoRequest);
        return memberDtoResponse;
    }
}
