package gof.composition;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("arrayCompositor")
public class ArrayCompositor extends Compositor {
	@Override
	public void Compose() {
		System.out.println("compse in ArrayCompositor");
	}
}
