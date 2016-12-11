package gof.command;
public class Document {
	protected String name;
	public Document(String string) {
		this.name = string;
	}
	public void Paste() {
		System.out.println("document " + this.name + " is pasted");
	}
}
