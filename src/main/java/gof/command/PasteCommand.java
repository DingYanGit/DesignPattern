package gof.command;

public class PasteCommand {
	protected Document document;
	public PasteCommand(Document document) {
		this.document = document;
	}
	public void Execute() {
		this.document.Paste();
	}
}
