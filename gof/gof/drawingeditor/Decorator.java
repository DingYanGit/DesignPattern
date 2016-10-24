package gof.drawingeditor;

public class Decorator extends VisualComponent{
	protected VisualComponent visualComponent;
	public Decorator(VisualComponent visualComponent) {
		this.visualComponent = visualComponent;
	}
	public void Draw() {
		this.visualComponent.Draw();
	}
}
