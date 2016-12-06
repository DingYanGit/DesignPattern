package gof.window;
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
@ContextConfiguration(classes=BridgeConfig.class,loader=AnnotationConfigContextLoader.class)
public class BridgeTest {
	@Autowired
	@Qualifier("xwindow")
	Window xwindow;
	@Autowired
	@Qualifier("pmwindow")
	Window pmwindow;
	@Rule()
	public final StandardOutputStreamLog log = new StandardOutputStreamLog();
	
	@Test
	public void drawXIcon() {
		this.xwindow.DrawRect();
		assertEquals("deviceRect using XWindowImp", log.getLog().trim());
	}
	@Test
	public void drawPMIcon() {
		this.pmwindow.DrawRect();
		assertEquals("deviceRect using PMWindowImp", log.getLog().trim());
	}
}
