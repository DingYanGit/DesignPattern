package gof.command;

import java.util.ArrayList;
import java.util.List;
public class Application {
	protected List<Document> documents = new ArrayList<Document>();
	public void Add(Document document) {
		this.documents.add(document);
	}
}
