package gof.Equipment;

import java.util.List;
public class Assemble {
	private CompsiteEquipment compsiteEquipment = new CompsiteEquipment();
	public void Standard() {
		this.compsiteEquipment.Add(new MainFrame());
		this.compsiteEquipment.Add(new Monitor());
		this.compsiteEquipment.Add(new Mouse());
		this.compsiteEquipment.Add(new KeyBoard());
	}
	public void StandardMainFrame() {
		this.compsiteEquipment.Add(new MainFrame());
	}
	public void Choiceable(List<String> ls) {
		for (int i = 0; i < ls.size(); i++) {
			switch(ls.get(i)) {
				case "mainframe":
					this.compsiteEquipment.Add(new MainFrame());
					break;
				case "monitor":
					this.compsiteEquipment.Add(new Monitor());
					break;
				case "mouse":
					this.compsiteEquipment.Add(new Mouse());
					break;
				case "keyboard":
					this.compsiteEquipment.Add(new KeyBoard());
					break;
			}
		}
	}
	public double NetPrice() {
		return this.compsiteEquipment.NetPrice();
	}
}
