package gof.graphic;
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
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=ProxyConfig.class,loader=AnnotationConfigContextLoader.class)
public class ProxyTest {
	@Rule()
	public final StandardOutputStreamLog log = new StandardOutputStreamLog();
	@Autowired
	protected ApplicationContext context;
	protected String newLineMark;
	@Autowired
	public void setNewLineMark() {
		this.newLineMark = System.getProperty("line.separator");
	}
	@Test
	public void proxyDraw() {
		ImageProxy proxy = (ImageProxy) this.context.getBean("imageProxy", "image");
		proxy.Draw();
		assertEquals("Image is initialized in proxy, doing stuff before draw" + this.newLineMark
		+ "draw image in image" + this.newLineMark
		+ "Image is initialized in proxy, doning stuff after draw" + this.newLineMark, this.log.getLog());
	}
	@Test
	public void proxyMove() {
		ImageProxy proxy = (ImageProxy) this.context.getBean("imageProxy", "image");
		proxy.Move();
		assertEquals("Image is initialized in proxy, doing stuff after move" + this.newLineMark
		+ "move image in image" + this.newLineMark
		+ "Image is initialized in proxy, doning stuff after move" + this.newLineMark, this.log.getLog());
	}	
}
