package gof.iterator;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class IteratorConfig {
	@Bean
	@Qualifier("testIterator")
	public ListIterator<String> testIterator() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		return new ListIterator<String>((List<String>)list);
	}
}
