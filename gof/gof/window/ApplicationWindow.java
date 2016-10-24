package gof.window;

public class ApplicationWindow extends Window{
	protected View view = new View();
	public void DrawRect() {
		this.view.DrawRectOn(this);
	}
}
