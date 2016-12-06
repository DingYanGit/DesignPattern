package gof.view;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=ViewConfig.class,loader=AnnotationConfigContextLoader.class)
public class ViewTest {
	@Autowired
	View view;
	protected String newLineMark;
	@Autowired
	public void setNewLineMark() {
		this.newLineMark = System.getProperty("line.separator");
	}
	@Rule()
	public final StandardOutputStreamLog log = new StandardOutputStreamLog();
	@Test
	public void view() {
		this.view.display();
		assertEquals("execute set focus" + this.newLineMark
		+ "display in MyView" + this.newLineMark
		+ "execute reset focus" + this.newLineMark, this.log.getLog());
	}
}
