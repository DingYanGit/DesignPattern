package gof.command;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
@Configuration
public class CommandConfig {
	@Bean
	public Application application() {
		return new Application();
	}
	@Bean
	@Qualifier("opencommand")
	public OpenCommand openCommand() {
		return new OpenCommand();
	}
	@Bean
	@Scope("prototype")
	public Document document(String s) {
		return new Document(s);
	}
}
