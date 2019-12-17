package com.graphqlexample.starterproject.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.graphqlexample.starterproject.model.AccountDetails;
import com.graphqlexample.starterproject.repository.AccountDetailsRepository;

@Service
public class AccountDetailsService {

	@Autowired
	AccountDetailsRepository accountDetailsRepository;
	@Transactional(readOnly = true)
	public List<AccountDetails> getAllAccountDetails(int count) {
		return accountDetailsRepository.findAll().stream().limit(count).collect(Collectors.toList());
	}
	@Transactional(readOnly = true)
	public Optional<AccountDetails> getAccountDetail(int id) {
		return accountDetailsRepository.findById(id);
	}
	@Transactional
	public AccountDetails createAccountDetail(String productDesc, String accountOwner, String taxID,
			String issueDate) {
		final AccountDetails accDetails=new AccountDetails();
		accDetails.setProductDesc(productDesc);
		accDetails.setAccountOwner(accountOwner);
		accDetails.setTaxID(taxID);
		accDetails.setIssueDate(LocalDate.parse(issueDate));
		return accountDetailsRepository.save(accDetails);
	}

}
