package gof.composition;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("texCompositor")
public class TeXCompositor extends Compositor {
	@Override
	public void Compose() {
		System.out.println("compse in TeXCompositor");
	}
}
