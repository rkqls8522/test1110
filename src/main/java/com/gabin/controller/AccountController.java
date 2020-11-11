package com.gabin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gabin.VO.Account;
import com.gabin.service.AccountService;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("/account")
public class AccountController {

	@Setter(onMethod_= @Autowired)
	private AccountService service;
	private final String MODULE = "account";
	
	//이름과 패스워드 체크하러 가기
	@GetMapping("/check")
	public String check(Model model) {
		//model에 데이터를 담으면 request에 데이터가 담기게 된다.
		//jsp에서 꺼내 쓸때는 ${list} == ${requestScope.list}
		System.out.println("accountcontroller_get_check");
		return MODULE + "/check";
	}
	
	//이름과 패스워드 체크 완료. 계좌정보 불러오기
	@PostMapping("/check")
	public String checkok(Model model, Account account) {
		model.addAttribute("daw",service.check(account));
		model.addAttribute("loan",service.loan(account));
		System.out.println(service.check(account));
		System.out.println(service.loan(account));
		return MODULE + "/checkok"; 
	}
	//추가
	@PostMapping("/deposit")
	public String deposit(Account account) {
		service.deposit(account);
		return "redirect:checkok";
	}
	@PostMapping("/withdrawal")
	public String withdrawal(Account account) {
		service.withdrawal(account);
		return "redirect:checkok";
	}
	@PostMapping("/loanwithdrawal")
	public String loanwithdrawal(Account account) {
		System.out.println(account.getFree_name());
		System.out.println(account.getWithdrawal());
		service.loanwithdrawal(account);
		return "redirect:check";
	}
	
	
}
