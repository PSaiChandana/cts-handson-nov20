package com.cognizant.RetailBankingRewards;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com")
@EnableJpaRepositories
public class RetailBankingRewardsApplication {

	public static void main(String[] args) {
		SpringApplication.run(RetailBankingRewardsApplication.class, args);
	}

}
