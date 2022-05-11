package org.ncu.Spring_AOP;

import org.ncu.SpringAOP.DAO.AccountDAO;
import org.ncu.SpringAOP.DAO.AccountDAOImpl;
import org.ncu.Spring_AOP.Entity.Account;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
    	
    	AccountDAO dao = context.getBean("accountDAOImpl", AccountDAOImpl.class);
    	
    	Account account = context.getBean("account", Account.class);
    	
    	dao.addAccount();
    	
    	dao.addAccount(account, true);
    	
    	dao.doStuff();
    	
    	dao.addAccount(account);
    	
    	dao.getAccountName();
    	
    	dao.getAccountNo();

    	context.close();
    }
}
