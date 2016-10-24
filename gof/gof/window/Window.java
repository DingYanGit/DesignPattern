package gof.window;

public abstract class Window {
	protected WindowImp windowImp;
	public void DrawRect() {
		this.windowImp.DeviceRect();
	};
}
