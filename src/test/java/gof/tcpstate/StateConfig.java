package gof.tcpstate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class StateConfig {
	@Bean
	public TCPConnection conn() {
		return new TCPConnection();
	}
	@Bean
	public TCPOctetStream stream() {
		return new TCPOctetStream();
	}
}
