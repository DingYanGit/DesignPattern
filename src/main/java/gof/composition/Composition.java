package gof.composition;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Composition {
	public Compositor compositor;
	public Composition(Compositor compositor) {
		this.compositor = compositor;
	}
	public void Repair() {
		this.compositor.Compose();
	}
}
