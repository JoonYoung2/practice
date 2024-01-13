package com.example.api.repository;

import com.example.api.dto.MemberDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberRepository {
    public List<MemberDto> getMember();
}
