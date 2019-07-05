package org.atm.client;

import org.atm.model.Account;
import org.atm.worker.AccountHolder;

public class Test {
public static void main(String[] args) {
	
	Account account = new Account();
	AccountHolder accountHolder = new AccountHolder(account);
	
			Thread t1 = new Thread(accountHolder);
			Thread t2 = new Thread(accountHolder);
			t1.setName("Sonali");
			t2.setName("Akash");
			t1.start();
			t2.start();
	
}
}
