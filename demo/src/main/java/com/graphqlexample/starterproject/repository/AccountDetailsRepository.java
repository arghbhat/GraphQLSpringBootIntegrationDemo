package com.graphqlexample.starterproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.graphqlexample.starterproject.model.AccountDetails;

@Repository
public interface AccountDetailsRepository extends JpaRepository<AccountDetails, Integer>{

}
