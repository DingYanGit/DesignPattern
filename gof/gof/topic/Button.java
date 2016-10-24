package gof.topic;

public class Button extends Widget{
	public Button(Button button, Topic topic) {
		super(button, topic);
	}
	public void HandleHelp() {
		if(this.HasHelp()) {
			//TODO offer help
		} else {
			this.successor.HandleHelp();
		}
	}
}
