package gof.composition;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import gof.composition.ArrayCompositor;
import gof.composition.Composition;
import gof.composition.SimpleCompositor;
import gof.composition.TeXCompositor;

@ContextConfiguration(classes=CompositionConfig.class,loader=AnnotationConfigContextLoader.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class CompositionTest {
	@Rule
	public final StandardOutputStreamLog log = new StandardOutputStreamLog();
	@Autowired
	protected ApplicationContext context;
	@Autowired
	protected ArrayCompositor arrCompositor;
	@Autowired
	protected SimpleCompositor simpCompositor;	
	@Autowired
	protected TeXCompositor texCompositor;
	@Test
	public void testArrayCom() {
		Composition comp = (Composition) this.context.getBean("composition", this.arrCompositor);
		comp.Repair();
	}
	@Test
	public void testSimpComp() {
		Composition comp = (Composition) this.context.getBean("composition", this.simpCompositor);
		comp.Repair();		
	}
	@Test
	public void testTexComp() {
		Composition comp = (Composition) this.context.getBean("composition", this.texCompositor);
		comp.Repair();		
	}
}
