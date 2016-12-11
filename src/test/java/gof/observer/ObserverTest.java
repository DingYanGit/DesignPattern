package gof.observer;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@ContextConfiguration(classes=ObserverConfig.class,loader=AnnotationConfigContextLoader.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class ObserverTest {
	@Rule
	public final StandardOutputStreamLog log = new StandardOutputStreamLog();
	@Autowired
	protected ApplicationContext context;
	@Autowired
	protected SubjectTimerTask task;
	@Autowired
	protected AnalogClock aclock;
	@Autowired
	protected DigitalClock dclock;
	protected String newLineMark;
	@Autowired
	public void setNewLineMark() {
		this.newLineMark = System.getProperty("line.separator");
	}
	@Test
	public void draw() {
		this.task.run();
		String out1 = "draw in AnalogClock" + this.newLineMark
				+ "draw in Digital Clock" + this.newLineMark;
		String out2 = "draw in Digital Clock" + this.newLineMark
				+ "draw in AnalogClock" + this.newLineMark;
		assertTrue(out1.equals(this.log.getLog())||out2.equals(this.log.getLog()));
	}
}
