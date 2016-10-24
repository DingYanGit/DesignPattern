package gof.observer;

public class AnalogClock extends Observer{
	protected SubjectTimerTask timerSubject;
	public AnalogClock(SubjectTimerTask subject) {
		this.timerSubject = subject;
		this.timerSubject.subject.Attach(this);
	}
	protected void finalize() {
		this.timerSubject.subject.Detach(this);
	}
	public void Update(Subject theChangedSubject) {
		if(this.timerSubject.equals(theChangedSubject)) {
			this.Draw();
		}
	}
	public void Draw() {
		
	}
}
