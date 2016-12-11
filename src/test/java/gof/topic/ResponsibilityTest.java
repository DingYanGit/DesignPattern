package gof.topic;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;

public class ResponsibilityTest {
	@Rule()
	public final StandardOutputStreamLog log = new StandardOutputStreamLog();
	@Test
	public void testButton() {
		Application application = new Application(Topic.APPLICATION_TOPIC);
		Dialog dialog = new Dialog(application, Topic.PRINT_TOPIC);
		Button button = new Button(dialog, Topic.PAPER_ORIENTATION_TOPIC);
		button.HandleHelp();
		assertEquals("help abount Button", this.log.getLog().trim());
	}
	@Test
	public void testDialog() {
		Application application = new Application(Topic.APPLICATION_TOPIC);
		Dialog dialog = new Dialog(application, Topic.PRINT_TOPIC);
		Button button = new Button(dialog, Topic.NO_HELP_TOPIC);
		button.HandleHelp();
		assertEquals("help about Dialog", this.log.getLog().trim());
	}
	@Test
	public void testApplication() {
		Application application = new Application(Topic.APPLICATION_TOPIC);
		Dialog dialog = new Dialog(application, Topic.NO_HELP_TOPIC);
		Button button = new Button(dialog, Topic.NO_HELP_TOPIC);
		button.HandleHelp();
		assertEquals("help abount Application", this.log.getLog().trim());
	}
}
