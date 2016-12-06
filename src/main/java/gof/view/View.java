package gof.view;

public abstract class View {
	public void setFocus() {
		System.out.println("execute set focus");
	}
	public void resetFocus() {
		System.out.println("execute reset focus");
	}
	public abstract void doDisplay();
	public void display() {
		this.setFocus();
		this.doDisplay();
		this.resetFocus();
	}
}
