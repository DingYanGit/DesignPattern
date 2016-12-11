package gof.exp;
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
@ContextConfiguration(classes=InterpreterConfig.class,loader=AnnotationConfigContextLoader.class)
public class InterpreterTest {
	@Rule()
	public final StandardOutputStreamLog log = new StandardOutputStreamLog();
	@Autowired
	protected Context context;
	protected String newLineMark;
	@Autowired
	public void setNewLineMark() {
		this.newLineMark = System.getProperty("line.separator");
	}
	@Autowired
	@Qualifier("variableX")
	private VariableExp viriablex;
	@Autowired
	@Qualifier("variableY")
	private VariableExp viriabley;	
	@Autowired
	@Qualifier("variableZ")
	private VariableExp viriablez;	
	private BooleanExp exp;
	@Autowired
	@Qualifier("constantFalse")
	private Constant constantFalse;
	@Autowired
	@Qualifier("constantTrue")
	private Constant constantTrue;
	@Autowired
	public void setExp() {
		this.exp = new OrExp(
				new AndExp(this.constantTrue, this.viriablex),
				new AndExp(this.viriabley, new NotExp(this.viriablex))
				);
	}
	@Test
	public void test() {
		this.context.Assign(this.viriablex, false);
		this.context.Assign(this.viriabley, true);
		assertTrue(this.exp.Evaluate(this.context));
	}
}
