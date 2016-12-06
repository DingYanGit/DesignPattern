package gof.topic;

public class Dialog extends Widget{
	public Dialog(Dialog dialog, Topic topic) {
		super(dialog, topic);
	}
	public void HandleHelp() {
		if (this.HasHelp()) {
			//TODO offer help
		} else {
			this.successor.HandleHelp();
		}
	}
}
