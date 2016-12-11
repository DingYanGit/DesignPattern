package gof.equipment;

public class ComputerCase extends Equipment{
	public ComputerCase() {
		this.SetNetPrice(199);
	}

	void Accept(EquipmentVisitor visitor) {
		visitor.visitComputerCase(this);
	}
}
