package gof.drawingeditor;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class BorderDecorator extends Decorator{
	protected int width;
	public BorderDecorator(VisualComponent visualComponent, int borderWidth) {
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
