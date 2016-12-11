package gof.widget;

import static org.junit.Assert.assertEquals;

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
@ContextConfiguration(classes=MediatorConfig.class,loader=AnnotationConfigContextLoader.class)
public class MediatorTest {
	@Autowired
	@Qualifier("buttonok")
	Button ok;
	@Autowired
	@Qualifier("buttoncancel")
	Button cancel;
	@Autowired
	@Qualifier("listbox")
	ListBox fontList;
	@Rule()
	public final StandardOutputStreamLog log = new StandardOutputStreamLog();
	protected String newLineMark;
	@Autowired
	public void setNewLineMark() {
		this.newLineMark = System.getProperty("line.separator");
	}
	@Test
	public void ok() {
		this.fontList.Changed();
		this.ok.Changed();
		assertEquals("font is selected, now set the fontname" + this.newLineMark
				+ "the text font is set to font" + this.newLineMark
				+ "apply font and dismiss dialog" + this.newLineMark, log.getLog());
	}
	@Test
	public void cancel() {
		this.cancel.Changed();
		assertEquals("cancel clicked dismiss dialog" + this.newLineMark, log.getLog());
	}
}
