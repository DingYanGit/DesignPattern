package gof.equipment;

public class MainBoard extends Equipment{
	public MainBoard() {
		this.SetNetPrice(600);
	}
	void Accept(EquipmentVisitor visitor) {
		visitor.visitMainBoard(this);
	}
}
