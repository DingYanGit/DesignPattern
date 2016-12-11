package gof.topic;

public class Application extends HelpHandler{
	public Application(Topic topic) {
		this(null, topic);
	}
	public Application(HelpHandler helpHandler, Topic topic) {
		super(helpHandler, topic);
	}
	public void HandleHelp() {
		if(this.HasHelp()) {
			System.out.println("help abount Application");
		} else {
			this.successor.HandleHelp();
		}
	}
}
