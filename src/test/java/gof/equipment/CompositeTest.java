package gof.equipment;
import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CompositeConfig.class,loader=AnnotationConfigContextLoader.class)
public class CompositeTest {
	@Rule()
	public final StandardOutputStreamLog log = new StandardOutputStreamLog();
	@Autowired
	@Qualifier("mainframe")
	private Equipment frame;
	@Autowired
	@Qualifier("monitor")
	private Equipment monitor;	
	@Test
	public void frame() {
		double price = this.frame.NetPrice();
		assertTrue(price == 1198);
	}
	@Test
	public void monitor() {
		double price = this.monitor.NetPrice();
		assertTrue(price == 1000);
	}
}
