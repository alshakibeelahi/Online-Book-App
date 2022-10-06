package classes;

import java.lang.*;
import interfaces.ITransactions;

public class Account implements ITransactions
{	
	private int accountNumber;
    private String accountHolderName;
	private double balance;
	private int pinNo;

	public Account(){}
	public Account(int accountNumber, String accountHolderName, int pinNo)
	{
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.pinNo = pinNo;
	}
		
	public void setAccountNumber(int accountNumber){this.accountNumber = accountNumber;}
	public void setAccountHolderName(String accountHolderName){this.accountHolderName = accountHolderName;}
	public void setBalance(double balance){this.balance = balance;}
	public void setPinNo(int pinNo){this.pinNo = pinNo;}
	
	public int getAccountNumber(){return accountNumber; }
	public String getAccountHolderName(){return accountHolderName;}
	public double getBalance(){ return balance;}
	public int getPinNo(){ return pinNo;}
	
	public void showDetails()
	{
		System.out.println("Account Number      : " + accountNumber);
		System.out.println("Account Holder Name : " + accountHolderName);
		System.out.println("Balance             : " + balance);
	}
	
	public boolean cashIn(double amount){
		if(amount>0){
			balance = balance + amount;
			return true;
		}
		else{
			return false;
		}
	}
	public boolean cashOut(double amount){
		boolean flag = false;
		if(amount>0 && amount<=balance){
			balance = balance - amount;
			flag = true;
		}
		return flag;
	}
}

