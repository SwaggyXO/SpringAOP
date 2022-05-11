package org.ncu.Spring_AOP;

import org.ncu.SpringAOP.DAO.AccountDAOImpl;
import org.ncu.Spring_AOP.Entity.Account;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy(proxyTargetClass=true)
@ComponentScan("org.ncu.Spring_AOP")
public class Config 
{
	@Bean("account")
	public Account getAccount() 
	{
		return new Account();
	}
	
	@Bean("accountDAOImpl")
	
	public AccountDAOImpl getAccountDAOImpl()
	{
		return new AccountDAOImpl();
	}
}