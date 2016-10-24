import java.awt.Point;

import gof.drawingeditor.TextShape;
import gof.drawingeditor.TextView;

public class AdapterTest {
		public static void main(String[] args) {
			Point origin = new Point(10, 10);
			TextView textView = new TextView(origin, 10, 10);
			TextShape textShape = new TextShape(textView);
			Point bottomLeft = new Point();
			Point topRight = new Point();
			textShape.BoundingBox(bottomLeft, topRight);
			System.out.println(bottomLeft.toString());
		}
}
