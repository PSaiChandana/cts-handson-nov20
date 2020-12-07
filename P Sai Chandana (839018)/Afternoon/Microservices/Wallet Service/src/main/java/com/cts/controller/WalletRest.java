package com.cts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cts.model.Wallet;
import com.cts.service.WalletService;

@RestController
@RequestMapping("/wallet")
public class WalletRest {

	@Autowired
	private WalletService walletService;
	
	@GetMapping("/{num}")
	public Wallet addAmountToWalletFromAccount(@PathVariable long num) {
		return walletService.addAmountToWallet(num);
	}
}
