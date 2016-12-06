package gof.equipment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("monitor")
public class Monitor extends Equipment{
	public Monitor() {
		this.SetNetPrice(1000);
	}
	public double NetPrice() {
		return super.NetPrice();
	}
}
