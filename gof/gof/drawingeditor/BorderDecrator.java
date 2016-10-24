package gof.drawingeditor;

public class BorderDecrator extends Decorator{
	protected int width;
	public BorderDecrator(VisualComponent visualComponent, int borderWidth) {
		super(visualComponent);
		this.width = borderWidth;
	}
	public void Draw() {
		this.visualComponent.Draw();
		this.DrawBorder();
	}
	public void DrawBorder() {
		System.out.println("drawing use border mode");
	}
}
