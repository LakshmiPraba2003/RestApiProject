package com.example.demo.Model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Customer")
public class Customer {
	@Id
    public int custId;
    public String custName;
    public String custMobile;
    public String custAddr;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn
    private ShoppingCart sc;
	public Customer() {
		super();
	}
	public Customer(int custId, String custName, String custMobile, String custAddr) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custMobile = custMobile;
		this.custAddr = custAddr;
		
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustMobile() {
		return custMobile;
	}
	public void setCustMobile(String custMobile) {
		this.custMobile = custMobile;
	}
	public String getCustAddr() {
		return custAddr;
	}
	public void setCustAddr(String custAddr) {
		this.custAddr = custAddr;
	}
	public ShoppingCart getSc() {
		return sc;
	}
	public void setSc(ShoppingCart sc) {
		this.sc = sc;
	}
	
	
}
