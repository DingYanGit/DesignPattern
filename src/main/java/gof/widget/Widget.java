package gof.widget;

import org.springframework.beans.factory.annotation.Autowired;

abstract public class Widget {
	public void Changed() {
		this.director.widgetChanged(this);
	}
	@Autowired
	private DialogDirector director;
}
