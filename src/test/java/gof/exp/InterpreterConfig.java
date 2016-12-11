package gof.exp;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class InterpreterConfig {
	@Bean
	@Qualifier("variableX")
	public VariableExp variableX() {
		return new VariableExp("X");
	}
	@Bean
	@Qualifier("variableY")
	public VariableExp variableY() {
		return new VariableExp("Y");
	}
	@Bean
	@Qualifier("variableZ")
	public VariableExp variableZ() {
		return new VariableExp("Z");
	}
	@Bean
	@Qualifier("constantTrue")
	public Constant constantTrue() {
		return new Constant(true);
	}
	@Bean
	@Qualifier("constantFalse")
	public Constant constantFalse() {
		return new Constant(false);
	}
	@Bean
	public Context context() {
		return new Context();
	}
}
