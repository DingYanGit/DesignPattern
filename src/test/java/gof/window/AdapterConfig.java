package gof.window;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class AdapterConfig {
	  @Bean
	  public XWindowImp xwindowimp() {
	    return new XWindowImp();
	  }
	  @Bean
	  public PMWindowImp pmwindowimp() {
		  return new PMWindowImp();
	  }
	  @Bean
	  @Qualifier("iconx")
	  public IconWindow iconx() {
		  return new IconWindow(xwindowimp());
	  }
	  @Bean
	  @Qualifier("iconpm")
	  public IconWindow iconpm() {
		  return new IconWindow(pmwindowimp());
	  }
}
