package com.cts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.model.Account;
import com.cts.service.AccountService;

@RestController
@RequestMapping("/account")
public class AccountController {

	@Autowired
	private AccountService accountService;
	
	@GetMapping("/{accountnumber}")
	public Account fetchAccountById(@PathVariable("accountnumber") long accountNumber) {
		return accountService.fetchAccountByID(accountNumber);
	}
	
	@GetMapping("/hai")
	public String test() {
		return "hai";
	}
}
