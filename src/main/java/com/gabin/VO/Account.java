package com.gabin.VO;

import lombok.Data;

@Data
public class Account {
	
	int free_id;
	String free_name;
	String free_password;
	String free_serial;
	float deposit;
	float withdrawal;
	float amount;
	String yn;
	
	int id;
	float loansum;
	float loanwithdrawal;
	float loanamount;
	
	
	
}
