package org.atm.worker;

import org.atm.model.Account;

public class AccountHolder implements Runnable {

	private Account account;
	
	public AccountHolder(Account account) {
		super();
		this.account = account;
	}

	@Override
	public void run() {
		for (int i = 1; i < 5; i++)
		{
			makeWithdrawal(2000);
			if(account.getBalance()<0)
			{
				System.out.println("No balance available");
			}
		}
		
	}

	private synchronized void makeWithdrawal(int withDrawAmmount) {
		if(account.getBalance()>=withDrawAmmount)
		{
			System.out.println(Thread.currentThread().getName()+" is going to withdraw : "+withDrawAmmount);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		account.withDraw(withDrawAmmount);
		System.out.println(Thread.currentThread().getName()+"Completed withdraw : "+withDrawAmmount);
		}
		else
		{
			System.out.println("Not enough amount for "+Thread.currentThread().getName()+" to withdraw  :" +account.getBalance());
		}
	}
	}


