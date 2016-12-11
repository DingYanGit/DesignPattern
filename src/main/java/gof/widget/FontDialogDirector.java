package gof.widget;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class FontDialogDirector extends DialogDirector{
	@Autowired
	@Qualifier("buttonok")
	Button ok;
	@Autowired
	@Qualifier("buttoncancel")
	Button cancel;
	@Autowired
	@Qualifier("listbox")
	ListBox fontList;
	@Autowired
	@Qualifier("entryfield")
	EntryField fontName;
	public void widgetChanged(Widget widget) {
		if(this.fontList == widget) {
			System.out.println("font is selected, now set the fontname");
			this.fontName.setText("font");
			return;
		}
		if(this.ok == widget) {
			System.out.println("apply font and dismiss dialog");
			return;
		}
		if(this.cancel == widget) {
			System.out.println("cancel clicked dismiss dialog");
		}
	}
}
