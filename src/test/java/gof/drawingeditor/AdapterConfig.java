package gof.drawingeditor;
import java.awt.Point;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan
public class AdapterConfig {
	@Bean
	public TextView textView() {
		Point origion = new Point(10, 10);
        double weight = 10;
        double height = 10;
        return new TextView(origion, weight, height);
	}
	@Bean 
	public TextShape textShape(TextView textView) {
		return new TextShape(textView);
	}
}
