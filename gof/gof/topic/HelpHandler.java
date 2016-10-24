package gof.topic;

public abstract class HelpHandler {
	protected HelpHandler successor;
	protected Topic topic;
	public HelpHandler(HelpHandler helpHandler, Topic topic) {
		this.successor = helpHandler;
		this.topic = topic;
	}
	public boolean HasHelp() {
		return this.topic != Topic.NO_HELP_TOPIC;
	}
	public void HandleHelp() {
		if (null != this.successor) {
			this.successor.HandleHelp();
		}
	}
}
