package com.hjcompany.server.service;

import org.springframework.stereotype.Service;

import com.hjcompany.server.dto.Users;

import jakarta.servlet.http.HttpServletRequest;

@Service
public interface UserService {
   
    // 회원 등록
    public int insert(Users user) throws Exception;

    // 회원 조회
    public Users select(int userNo) throws Exception;

    // 로그인
    public void login(Users user, HttpServletRequest requset) throws Exception;

    // 회원 수정
    public int update(Users user) throws Exception;

    // 회원 삭제
    public int delete(String userId) throws Exception;
    
}
