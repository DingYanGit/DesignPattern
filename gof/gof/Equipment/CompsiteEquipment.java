package gof.Equipment;

import java.util.ArrayList;
import java.util.List;

public class CompsiteEquipment extends Equipment implements EquipmentContainer{
	private List<Equipment> equipments = new ArrayList<Equipment>();
	public double NetPrice() {
		double price = 0.0;
		for (int i = 0; i < this.equipments.size(); i++) {
			price += this.equipments.get(i).NetPrice();
		}
		return price;
	}
	public void Add(Equipment equipment) {
		this.equipments.add(equipment);
	}
}
