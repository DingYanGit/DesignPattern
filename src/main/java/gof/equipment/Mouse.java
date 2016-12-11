package gof.equipment;

public class Mouse extends Equipment{
	public Mouse() {
		this.SetNetPrice(20);
	}
	void Accept(EquipmentVisitor visitor) {
		visitor.visitMouse(this);
	}
}
