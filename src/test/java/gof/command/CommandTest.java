package gof.command;
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
@ContextConfiguration(classes=CommandConfig.class,loader=AnnotationConfigContextLoader.class)
public class CommandTest {
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
	@Qualifier("opencommand")
	private OpenCommand opencmd;
	private PasteCommand pstcmd;
	@Autowired
	public void SetPasteCommand() {
		String s = new String("test");
		Document doc = (Document) this.context.getBean("document", s);
		this.pstcmd = new PasteCommand(doc);
	} 
	@Test
	public void testOpenCommand() {
		this.opencmd.Execute();
		assertEquals("input file name test to open" + this.newLineMark
				+ "new documnet is added" + this.newLineMark, this.log.getLog());
	}
	@Test
	public void testPasteCommand() {
		this.pstcmd.Execute();
		assertEquals("document test is pasted" + this.newLineMark, this.log.getLog());
	}
}
