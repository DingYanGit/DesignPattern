package gof.graphic;

public class ImageProxy extends Graphic{
	private String fileName;
	private Image image = null;
	public ImageProxy(String s) {
		this.fileName = s;
	}
	public void Draw() {
		if(null == this.image) {
			this.image = new Image(this.fileName);
			System.out.println("Image is initialized in proxy");
		}
		this.image.Draw();
	}
	public void Move() {
		if(null == this.image) {
			this.image = new Image(this.fileName);
			System.out.println("Image is initialized in proxy");
		}
		this.image.Move();
	}
}