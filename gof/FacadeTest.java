import java.util.ArrayList;
import java.util.List;

import gof.Equipment.Assemble;

public class FacadeTest {
	public static void main(String[] args) {
		Assemble assemble = new Assemble();
		assemble.Standard();
		System.out.println("netprice of standard choice is: " + assemble.NetPrice());
		assemble = new Assemble();
		assemble.StandardMainFrame();
		assemble.NetPrice();
		System.out.println("netprice of standardmainframe choice is: " + assemble.NetPrice());
		assemble = new Assemble();
		List<String> ls = new ArrayList<String>();
		ls.add("mouse");
		ls.add("keyboard");
		assemble.Choiceable(ls);
		System.out.println("netprice of mouse and keyboard choice is: " + assemble.NetPrice());
	}
}
