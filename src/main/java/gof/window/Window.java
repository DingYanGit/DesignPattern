package gof.window;
public abstract class Window {
	protected WindowImp windowImp;
	public Window(WindowImp imp) {
		this.windowImp = imp;
	}
	public void DrawRect() {
		this.windowImp.DeviceRect();
	};
}
