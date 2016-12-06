package gof.maze;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Wall extends MapSite{
	public void Enter() {		
	}
	public Wall clone() {
		return new Wall();
	}
}
