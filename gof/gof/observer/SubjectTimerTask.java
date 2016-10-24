package gof.observer;

import java.util.TimerTask;
//use Timer to invoke TimerTask
public class SubjectTimerTask extends TimerTask{
	Subject subject;
	public SubjectTimerTask(Subject subject) {
		this.subject = subject;
	}
	public void run() {
		this.subject.notify();
	}
}
