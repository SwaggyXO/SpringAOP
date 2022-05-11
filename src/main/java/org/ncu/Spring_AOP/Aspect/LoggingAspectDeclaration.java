package org.ncu.Spring_AOP.Aspect;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.ncu.Spring_AOP.Entity.Account;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspectDeclaration {
	
	  @Pointcut("execution(* org.ncu.Spring_AOP.*.get*(..))") private void 
	  uselessAdvice() {}
	
	  @Pointcut("execution(* org.ncu.Spring_AOP.*.get*(..))") private void
	  getter() {}
	  
	  @Pointcut("execution(boolean org.ncu.Spring_AOP.*.*(..))") private void 
	  bool(){}
	  
	  @Pointcut("(getter() && !bool())") private void 
	  exclude() {}
	  
	  @Pointcut("execution(* org.ncu.Spring_AOP.*.throw*(..))") private void 
	  throwingSmth() {}
	  
	  @After("exclude()") void afterAddAccount()
	  {
		  System.out.println("=> Executing @After advice!");
	  }
	  
	  @Before("exclude()") void beforeAddAccount()
	  {
		  System.out.println("=====>> Executing @Before advice!");
	  }
	  
	  @AfterThrowing("throwingSmth()") void AfterThrowingAddAccount()
	  {
		  System.out.println("=> Executing @AfterThrowing");
	  }
	  
	  @AfterReturning("exclude()") void AfterReturning()
	  {
		  System.out.println("=> Executing @AfterReturning");
	  }
	  
	  

}
