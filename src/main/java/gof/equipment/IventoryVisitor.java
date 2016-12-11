package gof.equipment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class IventoryVisitor extends EquipmentVisitor{
	@Autowired
	private Iventory iventory;
	public void visitCpu(CPU cpu) {
		this.iventory.Accumulate(cpu);
	}
	public void visitComputerCase(ComputerCase computerCase) {
		this.iventory.Accumulate(computerCase);
	}
	public void visitKeyBoard(KeyBoard keyBoard) {
		this.iventory.Accumulate(keyBoard);
	}
	public void visitMainBoard(MainBoard mainBoard) {
		this.iventory.Accumulate(mainBoard);
	}
	public void visitMonitor(Monitor monitor) {
		this.iventory.Accumulate(monitor);
	}
	public void visitMouse(Mouse mouse) {
		this.iventory.Accumulate(mouse);
	}
	public void visitPowerSupplier(PowerSupplier powerSupplier) {
		this.iventory.Accumulate(powerSupplier);
	}
}
