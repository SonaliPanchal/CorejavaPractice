package org.atm.model;

public class Account {

	private int balance = 6000;

	public int getBalance() {
		return balance;
	}
	
	public void withDraw(int amount)
	{
		if(balance >= amount)
		{
			/*System.out.println("withdraw succefully");*/
		}
		balance =  balance - amount;
	}
}
