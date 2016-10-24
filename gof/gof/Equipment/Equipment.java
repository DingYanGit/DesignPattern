package gof.Equipment;

public abstract class Equipment {
	protected double netPrice;
	public void SetNetPrice(double netPrice) {
		this.netPrice = netPrice;
	}
	public double NetPrice() {
		return this.netPrice;
	};
}
