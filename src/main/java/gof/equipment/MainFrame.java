package gof.equipment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("mainframe")
public class MainFrame extends CompsiteEquipment{
	public MainFrame() {
		this.Add(new MainBoard());
		this.Add(new PowerSupplier());
		this.Add(new ComputerCase());
		this.Add(new CPU());
	}
}
