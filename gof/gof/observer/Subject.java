package gof.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class Subject {
	protected List<Observer> observers = new ArrayList<Observer>();
	public void Attach(Observer observer) {
		this.observers.add(observer);
	}
	public void Detach(Observer observer) {
		Iterator<Observer> iterator = this.observers.iterator();
		if (iterator.hasNext()) {
			Observer next = iterator.next();
			if (next.equals(observer)) {
				iterator.remove();
			}
		}
	}
	public void Notify(Observer observer) {
		Iterator<Observer> iterator = this.observers.iterator();
		while(iterator.hasNext()) {
			iterator.next().Update(this);
		}
	}
}
