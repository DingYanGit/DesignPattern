package gof.drawingeditor;

import java.awt.Point;
public class TextView extends VisualComponent{
	private Point origin;
	private Double weight, height;
	public TextView(Point origion, double weight, double height) {
		this.origin = origion;
		this.weight = weight;
		this.height = height;
	}
	public Point GetOrigin() {
		return this.origin;
	}
	public double[] GetExtent() {
		double []extent = new double[2];
		extent[0] = this.weight;
		extent[1] = this.height;
		return extent;
	}
	public void Draw() {
		
	}
}
