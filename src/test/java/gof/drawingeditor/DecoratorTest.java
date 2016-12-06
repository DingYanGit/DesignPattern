package gof.drawingeditor;

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

@ContextConfiguration(classes=DecoratorConfig.class,loader=AnnotationConfigContextLoader.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class DecoratorTest {
	@Rule
	public final StandardOutputStreamLog log = new StandardOutputStreamLog();
	@Autowired
	protected ApplicationContext context;
	@Autowired
	protected TextView textView;
	@Test
	public void border() {
		Decorator decorator = (Decorator) this.context.getBean("borderDecorator", this.textView, 20);
		decorator.Draw();
		assertEquals("drawing use border mode", this.log.getLog().trim());
	}
	@Test
	public void scroll() {
		Decorator decorator = (Decorator) this.context.getBean("scrollDecorator", this.textView);
		decorator.Draw();
		assertEquals("drawing use scroll mode", this.log.getLog().trim());
	}
}
