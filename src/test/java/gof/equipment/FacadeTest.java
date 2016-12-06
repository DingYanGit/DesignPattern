package gof.equipment;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=FacadeConfig.class,loader=AnnotationConfigContextLoader.class)
public class FacadeTest {
	@Rule()
	public final StandardOutputStreamLog log = new StandardOutputStreamLog();
	@Autowired
	protected ApplicationContext context;
	@Test
	public void standard() {
		Assemble assemble = this.context.getBean(Assemble.class);
		assemble.Standard();
		double price = assemble.NetPrice();
		assertTrue(price == 2268);
	}
	@Test
	public void standardframe() {
		Assemble assemble = this.context.getBean(Assemble.class);
		assemble.StandardMainFrame();
		double price = assemble.NetPrice();
		assertTrue(price == 1198);
	}
	@Test
	public void choiceable() {
		List<String> ls = new ArrayList<String>();
		ls.add("mouse");
		ls.add("keyboard");
		Assemble assemble = this.context.getBean(Assemble.class);
		assemble.Choiceable(ls);
		double price = assemble.NetPrice();
		assertTrue(price == 70);
	}
}
