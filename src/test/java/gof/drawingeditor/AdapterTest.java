package gof.drawingeditor;

import static org.junit.Assert.*;

import java.awt.Point;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@ContextConfiguration(classes=AdapterConfig.class,loader=AnnotationConfigContextLoader.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class AdapterTest {
	@Rule
	public final StandardOutputStreamLog log = new StandardOutputStreamLog();
	@Autowired
	protected ApplicationContext context;
	@Autowired
	protected TextShape textShape;
	@Test
	public void textShape() {
		Point bottomLeft = new Point();
        Point topRight = new Point();
        this.textShape.BoundingBox(bottomLeft, topRight);
        assertTrue(bottomLeft.x == 10);
        assertTrue(bottomLeft.y == 10);
        assertTrue(topRight.x == 20);
        assertTrue(topRight.y == 20);
	}
}
