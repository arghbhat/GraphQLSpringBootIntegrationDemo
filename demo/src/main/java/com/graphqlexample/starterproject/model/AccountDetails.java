package com.graphqlexample.starterproject.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode
public class AccountDetails implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="ID",nullable=false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="ProductDesc" , nullable=false)
	private String productDesc;
	
	@Column(name="AccountOwner" , nullable=false)
	private String accountOwner;
	
	@Column(name="TaxID" , nullable=false)
	private String taxID;
	
	@Column(name="IssueDate" , nullable=false)
	private LocalDate issueDate;
	
	private transient String  formattedDate;
	
	public String getFormattedDate() {
		return getIssueDate().toString();
	}
}
