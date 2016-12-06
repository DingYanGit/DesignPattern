package gof.composition;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("simpleCompositor")
public class SimpleCompositor extends Compositor {
	@Override
	public void Compose() {
		System.out.println("compose in SimpleCompositor");
	}
}
