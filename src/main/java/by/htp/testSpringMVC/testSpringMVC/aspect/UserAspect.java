package by.htp.testSpringMVC.testSpringMVC.aspect;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class UserAspect {
	
	private static final Logger logger = LogManager.getLogger();
	
	//@Before("execution(* by.htp.testSpringMVC.testSpringMVC.web.action.UserController.listUser())")
	
	
//	@Before("execution(* by.htp.testSpringMVC.testSpringMVC.service.impl.*.get*)")
	
//	@Before("execution(* by.htp.testSpringMVC.testSpringMVC.service.UserService.getUsers(..))")
//	public void doSmth2() {
//		System.out.println("-------------------");
//		System.out.println("Service method getUser()");
//	}
//	
//	@Before("execution(* by.htp.testSpringMVC.testSpringMVC.service.UserService.getUsers(..))")
//	public void doSmth() {
//		System.out.println("-------------------------------");
//		System.out.println("Service method getCars() called");
//	}
//	
//	@Pointcut("execution(* transfer(..))")// the pointcut expression
//	private void anyOldTransfer() {}// the pointcut signature
//
//	@Before("execution(* by.htp.testSpringMVC.testSpringMVC.service.UserService.getUsers(..))")
//	public void doSmth(JoinPoint point) {
//		logger.info(point.getSignature().getDeclaringTypeName() + " " + point.getSignature().getName() + " called.");
//		System.out.println("_________________");
//		System.out.println("Service method (BEFORE) class called");
//	}
//	
//	@AfterReturning(
//		    pointcut="by.htp.testSpringMVC.testSpringMVC.service.UserService.getUsers(..)",
//		    returning="retVal")
//		  public void doAccessCheck(Object retVal) {
//		
//		
//		System.out.println("_________________");
//		System.out.println("Service method (AFTER Retuning) class called retval (количество машин)=" +retVal);
//		  }
//	
//	
//	@AfterThrowing(
//		    pointcut="by.htp.testSpringMVC.testSpringMVC.web.action.UserController.*(..)",
//		    throwing="ex")
//		  public void doRecoveryActions(Exception ex) {
//			System.out.println("_________________");
//			System.out.println("Service method (AFTER Throwing) class called exception =" +ex);
//		  }
//	
//	//after finally
//	@After("by.htp.testSpringMVC.testSpringMVC.service.UserService.getUsers(..)")
//	  public void doReleaseAfter() {
//		
//		System.out.println("_________________");
//		System.out.println("Service method (AFTER FINALLY) class called");
//	  }
//	
//	@Around("by.htp.testSpringMVC.testSpringMVC.service.UserService.*(..)")
//	  public Object doBasicProfiling(ProceedingJoinPoint pjp) throws Throwable {
//	    // start stopwatch
//	    Object retVal = pjp.proceed();
//	    // stop stopwatch
//	    
//	    System.out.println("_________________");
//		System.out.println("Service method (Around) class called"+ pjp.getArgs());
//		return retVal;
//	  }

	
	
	
	
}
