package com.example.api.controller;

import com.example.api.dto.MemberDto;
import com.example.api.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {
    private final MemberService service;
    @GetMapping("/info")
    public List<MemberDto> getMember(){
        return service.getMember();
    }
}
