import java.awt.Point;

import gof.drawingeditor.BorderDecrator;
import gof.drawingeditor.Decorator;
import gof.drawingeditor.ScrollDecorator;
import gof.drawingeditor.TextView;

public class DecoratorTest {
	public static void main(String[] args) {
		Point origion = new Point(100, 100);
		double weight = 20;
		double height = 80;
		TextView textView = new TextView(origion, weight, height);
		Decorator decorator = new ScrollDecorator(textView);
		decorator.Draw();
		decorator = new BorderDecrator(textView, 20);
		decorator.Draw();
	}
}
