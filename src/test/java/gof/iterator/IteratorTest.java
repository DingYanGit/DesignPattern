package gof.iterator;
import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=IteratorConfig.class,loader=AnnotationConfigContextLoader.class)
public class IteratorTest {
	@Rule()
	public final StandardOutputStreamLog log = new StandardOutputStreamLog();
	@Autowired
	protected ApplicationContext context;
	protected String newLineMark;
	@Autowired
	public void setNewLineMark() {
		this.newLineMark = System.getProperty("line.separator");
	}
	@Autowired
	@Qualifier("testIterator")
	protected ListIterator<String> iterator;
	
	@Test
	public void iterate() throws Exception {
		for (this.iterator.First(); !this.iterator.IsDone(); this.iterator.Next()) {
			System.out.println((this.iterator.CurrentItem()));
		}
		assertEquals("one" + this.newLineMark
				+ "two" + this.newLineMark
				+ "three" + this.newLineMark, this.log.getLog());
	} 
}
