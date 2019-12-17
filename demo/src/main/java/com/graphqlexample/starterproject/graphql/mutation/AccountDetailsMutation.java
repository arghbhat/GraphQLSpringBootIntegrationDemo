package com.graphqlexample.starterproject.graphql.mutation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.graphqlexample.starterproject.model.AccountDetails;
import com.graphqlexample.starterproject.service.AccountDetailsService;

@Component
public class AccountDetailsMutation implements GraphQLMutationResolver{
	
	@Autowired
    private AccountDetailsService accountDetailsService;
    public AccountDetails createAccountDetail(final String productDesc, final String accountOwner, final String taxID, final String issueDate) {
        return this.accountDetailsService.createAccountDetail(productDesc, accountOwner, taxID, issueDate);
    }
}
