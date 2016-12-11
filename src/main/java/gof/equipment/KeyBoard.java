package gof.equipment;

public class KeyBoard extends Equipment{
	public KeyBoard() {
		this.SetNetPrice(50);
	}

	void Accept(EquipmentVisitor visitor) {
		visitor.visitKeyBoard(this);
	}
}
