package com.gabin.service;

import com.gabin.VO.Account;

public interface AccountService {
	
	public Account check(Account account); //이름과 패스워드 확인하여 계좌정보 불러오기
	public Account loan(Account account); //대출정보 불러오기
	public void deposit(Account account); //입금하기
	public void withdrawal(Account account); //출금하기
	public void loanwithdrawal(Account account); //대출하기
	
}
