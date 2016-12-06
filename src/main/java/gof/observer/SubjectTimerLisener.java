package gof.observer;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

public class SubjectTimerLisener {
	@Pointcut("execution(* gof.observer.SubjectTimerTask.run(..))")
	public void inRun() {
		System.out.println("listen catch, subject timer run");
	}
	@Before("execution(* gof.observer.SubjectTimerTask.run(..))")
	public void beforeRun() {
		System.out.println("listen catch, before subject timer run");
	}
	@AfterReturning("execution(* gof.observer.SubjectTimerTask.run(..))")
	public void afterRun() {
		System.out.println("listen catch, after subject timer run");
	}
}
