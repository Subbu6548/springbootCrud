package com.weareforyou.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table
public class Details {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String name;
	
	@Column(name = "email")
	private String email;
	
	private long phnumber;
	
	private long amount;
	
	private String type;
	
	@Column(name = "cardn",nullable = false)
	private long cardn;
	
	private LocalDate exp;
	
	@Column(nullable = false)
	private long cvv;

	
	@Override
	public String toString() {
		return "Details [id=" + id + ", name=" + name + ", email=" + email + ", phnumber=" + phnumber + ", amount="
				+ amount + ", type=" + type + ", cardn=" + cardn + ", exp=" + exp + ", cvv=" + cvv + "]";
	}
	



	public Details(long id, String name, String email, long phnumber, long amount, String type, long cardn,
			LocalDate exp, long cvv) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phnumber = phnumber;
		this.amount = amount;
		this.type = type;
		this.cardn = cardn;
		this.exp = exp;
		this.cvv = cvv;
	}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public long getPhnumber() {
		return phnumber;
	}



	public void setPhnumber(long phnumber) {
		this.phnumber = phnumber;
	}



	public long getAmount() {
		return amount;
	}



	public void setAmount(long amount) {
		this.amount = amount;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public long getCardn() {
		return cardn;
	}



	public void setCardn(long cardn) {
		this.cardn = cardn;
	}



	public LocalDate getExp() {
		return exp;
	}



	public void setExp(LocalDate exp) {
		this.exp = exp;
	}



	public long getCvv() {
		return cvv;
	}



	public void setCvv(long cvv) {
		this.cvv = cvv;
	}


	public Details() {
		super();
	}

}
