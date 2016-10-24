import gof.Equipment.Equipment;
import gof.Equipment.MainFrame;
import gof.Equipment.Monitor;

public class CompositeTest {
		public static void main(String[] args) {
			Equipment equipment = new MainFrame();
			double netPrice = equipment.NetPrice();
			System.out.println("netPrice of mainboard is " + netPrice);
			equipment = new Monitor();
			netPrice = equipment.NetPrice();
			System.out.println("netPrice of monitor is " + netPrice);
		}
}
