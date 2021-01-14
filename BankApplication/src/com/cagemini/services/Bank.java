package com.cagemini.services;

public interface Bank {
	public String createAccount(int accountNumber,int amount);
	public String balanceAmount(int amount);
	public int withdrawAmount(int accountNumber,int amount);
	public int depositAmount(int accountNumber,int amount);
	public int fundTransfer(int senderAccount,int recieverAccount,int amount);

}
