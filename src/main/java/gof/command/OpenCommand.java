package gof.command;

import org.springframework.beans.factory.annotation.Autowired;

public class OpenCommand {
	@Autowired
	protected Application application;
	public void Execute() {
		final String name = this.AskUser();
		if (null != name) {
			Document document = new Document(name);
			this.application.Add(document);
		}
	}
	protected String AskUser() {
		System.out.println("input file name test to open");
		return "test";
	}
}
