package gof.Equipment;

public class MainFrame extends CompsiteEquipment{
	public MainFrame() {
		this.Add(new MainBoard());
		this.Add(new PowerSupplier());
		this.Add(new ComputerCase());
		this.Add(new CPU());
	}
}
