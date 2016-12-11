package gof.equipment;

public class PowerSupplier extends Equipment{
	public PowerSupplier() {
		this.SetNetPrice(200);
	}

	void Accept(EquipmentVisitor visitor) {
		visitor.visitPowerSupplier(this);
	}
}
