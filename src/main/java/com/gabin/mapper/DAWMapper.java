package com.gabin.mapper;

import java.util.List;

import com.gabin.VO.Account;

public interface DAWMapper {
	public Account check(Account account); //이름과 패스워드 확인하여 계좌정보 불러오기
	public void deposit(Account account); //입금하기
	public void withdrawal(Account account); //출금하기
	
}
