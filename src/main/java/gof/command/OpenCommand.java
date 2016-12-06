package gof.command;

public class OpenCommand {
	protected Application application;
	public OpenCommand(Application application) {
		this.application = application;
	}
	public void Execute() {
		final String name = this.AskUser();
		if (null != name) {
			Document document = new Document(name);
			this.application.Add(document);
		}
	}
	protected String AskUser() {
		System.out.println("input file name to open");
		return System.in.toString();
	}
}
