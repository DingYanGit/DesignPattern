package gof.graphic;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ImageProxy extends Graphic{
	private String fileName;
	private Image image = null;
	public ImageProxy(String s) {
		this.fileName = s;
	}
	public void Draw() {
		if(null == this.image) {
			this.image = new Image(this.fileName);
			System.out.println("Image is initialized in proxy, doing stuff before draw");
		}
		this.image.Draw();
		System.out.println("Image is initialized in proxy, doning stuff after draw");
	}
	public void Move() {
		if(null == this.image) {
			this.image = new Image(this.fileName);
			System.out.println("Image is initialized in proxy, doing stuff after move");
		}
		this.image.Move();
		System.out.println("Image is initialized in proxy, doning stuff after move");
	}
}