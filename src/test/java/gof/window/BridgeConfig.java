package gof.window;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class BridgeConfig {
	  @Bean
	  @Qualifier("xwindow")
	  public Window xwindowimp() {
	    return new IconWindow(new XWindowImp());
	  }
	  @Bean
	  @Qualifier("pmwindow")
	  public Window pmwindowimp() {
		  return new IconWindow(new PMWindowImp());
	  }
}
