package gof.observer;

public class SubjectTimerTask {
	Subject subject;
	public SubjectTimerTask(Subject subject) {
		this.subject = subject;
	}
	public void run() {
		this.subject.Notify();
	}
}
