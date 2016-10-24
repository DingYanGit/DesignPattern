package gof.Equipment;

public class Monitor extends Equipment{
	public Monitor() {
		this.SetNetPrice(1000);
	}
	public double NetPrice() {
		return super.NetPrice();
	}
}
