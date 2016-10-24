import gof.window.ApplicationWindow;
import gof.window.PMWindow;
import gof.window.Window;
import gof.window.XWindow;

public class BridgeTest {	
	public static void main(String[] args) {
		Window window = new ApplicationWindow();
		window.DrawRect();
		window = new XWindow();
		window.DrawRect();
		window = new PMWindow();
		window.DrawRect();
	}
}
