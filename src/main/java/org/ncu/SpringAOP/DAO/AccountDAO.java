package org.ncu.SpringAOP.DAO;

import org.ncu.Spring_AOP.Entity.Account;

public interface AccountDAO {
	
	public void addAccount();
	
	public void addAccount(Account account);
	
	public void addAccount(Account account, boolean vipFlag);
	
	public boolean doStuff();
	
	public String throwSmth();
	
	public String getAccountName();
	
	public int getAccountNo();

}
