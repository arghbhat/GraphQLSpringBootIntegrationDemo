package com.graphqlexample.starterproject.graphql.query;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.graphqlexample.starterproject.model.AccountDetails;
import com.graphqlexample.starterproject.service.AccountDetailsService;

@Component
public class AccountDetailsQuery implements GraphQLQueryResolver{
	@Autowired
	private AccountDetailsService accountDetailsService;
	
	public List<AccountDetails> getAccountDetails(final int count){
		return accountDetailsService.getAllAccountDetails(count);
	}
	
	public Optional<AccountDetails> getAccountDetail(final int id){
		return accountDetailsService.getAccountDetail(id);
	}
}
