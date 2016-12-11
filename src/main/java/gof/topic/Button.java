package gof.topic;

public class Button extends Widget{
	public Button(HelpHandler h, Topic topic) {
		super(h, topic);
	}
	public void HandleHelp() {
		if(this.HasHelp()) {
			System.out.println("help abount Button");
		} else {
			this.successor.HandleHelp();
		}
	}
}
