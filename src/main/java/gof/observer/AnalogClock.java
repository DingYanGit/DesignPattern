package gof.observer;
public class AnalogClock extends Observer{
	protected SubjectTimerTask timerSubject;
	public AnalogClock(SubjectTimerTask timerSubject) {
		this.timerSubject = timerSubject;
		this.timerSubject.subject.Attach(this);
	}
	protected void finalize() {
		this.timerSubject.subject.Detach(this);
	}
	public void Update(Subject theChangedSubject) {
		if(this.timerSubject.subject.equals(theChangedSubject)) {
			this.Draw();
		}
	}
	public void Draw() {
		System.out.println("draw in AnalogClock");
	}
}
