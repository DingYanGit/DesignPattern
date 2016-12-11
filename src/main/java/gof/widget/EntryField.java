package gof.widget;

public class EntryField extends Widget{
	private String font;
	public void setText(String font) {
		this.font = font;		
		System.out.println("the text font is set to " + this.font);
	}
	public String getText() {
		return this.font;
	}
}
