package gof.drawingeditor;

import java.awt.Point;
public class TextShape extends Shape {
	private TextView textView;
	public TextShape(TextView textView) {		
		super();
		this.textView = textView;
	}
	public void BoundingBox(Point bottomLeft, Point topRight) {
		bottomLeft.setLocation(textView.GetOrigin());	
		double right = textView.GetOrigin().getX() + textView.GetExtent()[0];
		double top = textView.GetOrigin().getY() + textView.GetExtent()[1];
		topRight.setLocation(right, top);
	}
}
