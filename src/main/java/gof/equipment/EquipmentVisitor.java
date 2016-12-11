package gof.equipment;

public abstract class EquipmentVisitor {
	abstract public void visitCpu(CPU cpu);
	abstract public void visitComputerCase(ComputerCase computerCase);
	abstract public void visitKeyBoard(KeyBoard keyBoard);
	abstract public void visitMainBoard(MainBoard mainBoard);
	abstract public void visitMonitor(Monitor monitor);
	abstract public void visitMouse(Mouse mouse);
	abstract public void visitPowerSupplier(PowerSupplier powerSupplier);
}
