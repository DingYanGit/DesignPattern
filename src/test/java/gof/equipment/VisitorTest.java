package gof.equipment;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
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
@ContextConfiguration(classes=FacadeConfig.class,loader=AnnotationConfigContextLoader.class)
public class VisitorTest {
	@Rule()
	public final StandardOutputStreamLog log = new StandardOutputStreamLog();
	@Autowired
	protected ApplicationContext context;
	@Autowired
	@Qualifier("mainframe")
	private Equipment frame;
	@Autowired
	@Qualifier("monitor")
	private Equipment monitor;	
	@Autowired
	private IventoryVisitor visitor;
	@Autowired
	private Iventory iventory;
	protected String newLineMark;
	@Autowired
	public void setNewLineMark() {
		this.newLineMark = System.getProperty("line.separator");
	}
	@Before
	public void	initIventory() {
		this.iventory.clear();
	}
	@Test
	public void visitorMonitor() throws Exception {
		this.monitor.Accept(visitor);
		this.iventory.showSortEquipements();
		assertEquals("gof.equipment.Monitor", this.log.getLog().trim());
	}
	@Test
	public void visitorFrame() throws Exception {
		this.frame.Accept(visitor);
		this.iventory.showSortEquipements();
		assertEquals("gof.equipment.CPU" + this.newLineMark
		+ "gof.equipment.ComputerCase" + this.newLineMark
		+ "gof.equipment.MainBoard" + this.newLineMark
		+ "gof.equipment.PowerSupplier" + this.newLineMark, this.log.getLog());
	}	
}
