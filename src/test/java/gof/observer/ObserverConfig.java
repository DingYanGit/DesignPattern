package gof.observer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan
public class ObserverConfig {
	@Bean
	public Subject subject() {
		return new Subject();
	}
	@Bean
	public SubjectTimerTask subjectTimerTask(Subject subject) {
		return new SubjectTimerTask(subject);
	}
	@Bean
	public AnalogClock analogClock(SubjectTimerTask timerSubject) {
		return new AnalogClock(timerSubject);
	}
	@Bean
	public DigitalClock digitalClock(SubjectTimerTask timerSubject) {
		return new DigitalClock(timerSubject);
	}
}
