package com.qa.bank.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.bank.data.domain.Account;
import com.qa.bank.services.AccountService;

@RestController
@RequestMapping("/account")
public class AccountController {
	private AccountService service;

	public AccountController(AccountService service) {
		super();
		this.service = service;
	}

	@PostMapping("/create")
	public Account create(@RequestBody Account account) {
		return this.service.create(account);
	}

}
