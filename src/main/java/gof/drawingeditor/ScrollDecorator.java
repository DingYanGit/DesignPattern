package gof.drawingeditor;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ScrollDecorator extends Decorator{
	public ScrollDecorator(VisualComponent visualComponent) {
		super(visualComponent);
	}
	public void Draw() {
		this.visualComponent.Draw();
		this.DrawScroll();
	}
	public void DrawScroll() {
		System.out.println("drawing use scroll mode");
	}

}
