package com.example.api.service;

import com.example.api.dto.MemberDto;
import com.example.api.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;
    public List<MemberDto> getMember() {
        return memberRepository.getMember();
    }
}
