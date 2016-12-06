package gof.tcpstate;

import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@ContextConfiguration(classes = StateConfig.class, loader = AnnotationConfigContextLoader.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class StateTest {
	@Rule()
	public final StandardOutputStreamLog log = new StandardOutputStreamLog();
	protected String newLineMark;

	@Autowired
	public void setNewLineMark() {
		this.newLineMark = System.getProperty("line.separator");
	}

	@Test
	public void tcpLife() {
		TCPConnection conn = new TCPConnection();
		conn.PassiveOpen();
		conn.Synchronize();
		conn.Acknowlege();
		conn.ProcessOctect(new TCPOctetStream());
		conn.Close();
		assertEquals(
				"listen" + this.newLineMark + "receive a syn" + this.newLineMark + "send back a syn plus ack"
						+ this.newLineMark + "receive a ack" + this.newLineMark + "connection is established"
						+ this.newLineMark + "transmit data" + this.newLineMark + "receive fin" + this.newLineMark
						+ "send ack" + this.newLineMark + "send fin" + this.newLineMark + "2MSL expired"
						+ this.newLineMark + "tcp closed, now listen for a new connection" + this.newLineMark,
				this.log.getLog());
	}
}
