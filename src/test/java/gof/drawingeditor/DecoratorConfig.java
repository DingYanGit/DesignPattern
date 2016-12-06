package gof.drawingeditor;
import java.awt.Point;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan
public class DecoratorConfig {
	@Bean
	public TextView testone() {
		Point origion = new Point(100, 100);
        double weight = 20;
        double height = 80;
        return new TextView(origion, weight, height);
	}
}
