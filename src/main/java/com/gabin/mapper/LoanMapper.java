package com.gabin.mapper;

import java.util.List;

import com.gabin.VO.Account;

public interface LoanMapper {
	public Account loan(Account account); //대출정보 불러오기
	public void loanwithdrawal(Account account); //대출하기
	
}
