package gof.command;

import org.springframework.beans.factory.annotation.Autowired;

public class PasteCommand {
	@Autowired
	protected Document document;
	public PasteCommand(Document document) {
		this.document = document;
	}
	public void Execute() {
		this.document.Paste();
	}
}
