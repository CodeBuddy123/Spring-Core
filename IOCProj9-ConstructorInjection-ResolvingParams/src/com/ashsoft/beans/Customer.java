package com.ashsoft.beans;

public class Customer {
	
	private int custNo;
	private String custName;
	private String custAdd;
	
	@Override
	public String toString() {
		return "Customer [custNo=" + custNo + ", custName=" + custName + ", custAdd=" + custAdd + "]";
	}

	public Customer(int custNo, String custName, String custAdd) {
		this.custNo = custNo;
		this.custName = custName;
		this.custAdd = custAdd;
	}
	
	
}
