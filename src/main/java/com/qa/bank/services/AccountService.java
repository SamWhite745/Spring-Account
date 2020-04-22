package com.qa.bank.services;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.stereotype.Service;

import com.qa.bank.data.domain.Account;
import com.qa.bank.data.repo.AccountRepo;

@Service
public class AccountService {

	private AccountRepo repo;

	public AccountService(AccountRepo repo) {
		this.repo = repo;
	}

	public Account create(Account account) {
		account.setAccountNumber(getRandomAccount());
		return this.repo.save(account);
	}

	private String getRandomAccount() {
		String accountNum = IntStream.rangeClosed(1, (int) ((Math.random() * 2) + 3) * 2)
				.map(num -> (int) ((Math.random() * 9))).boxed().map(num -> num.toString())
				.collect(Collectors.joining(""));
		accountNum = Character.toString((char) (97 + (int) ((Math.random() * 2)))) + accountNum;
		return accountNum;
	}
}
