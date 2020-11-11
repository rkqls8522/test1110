package com.gabin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.gabin.VO.Account;
import com.gabin.mapper.DAWMapper;
import com.gabin.mapper.LoanMapper;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class AccountServiceImpl implements AccountService {

	@Setter(onMethod_= @Autowired)
	protected DAWMapper dawMapper;
	@Setter(onMethod_= @Autowired)
	protected LoanMapper loanMapper;
	
	
	@Override
	public Account check(Account account) {
		return dawMapper.check(account);
	}

	@Override
	public void deposit(Account account) {
		dawMapper.deposit(account);
	}

	@Override
	public void withdrawal(Account account) {
		dawMapper.withdrawal(account);
	}

	@Override
	public Account loan(Account account) {
		return loanMapper.loan(account);
	}

	@Override
	public void loanwithdrawal(Account account) {
		loanMapper.loanwithdrawal(account);
	}

}
