package gof.topic;

public class Dialog extends Widget{
	public Dialog(HelpHandler h, Topic topic) {
		super(h, topic);
	}
	public void HandleHelp() {
		if (this.HasHelp()) {
			System.out.println("help about Dialog");
		} else {
			this.successor.HandleHelp();
		}
	}
}
