package gof.equipment;

public class CPU extends Equipment{
	public CPU() {
		this.SetNetPrice(199);
	}

	void Accept(EquipmentVisitor visitor) {
		visitor.visitCpu(this);
	}
}
