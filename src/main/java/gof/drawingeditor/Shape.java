package gof.drawingeditor;

import java.awt.Point;

public abstract class Shape {
	public Shape() {
	}
	public abstract void BoundingBox(Point bottomleft, Point topRight);
		
}
