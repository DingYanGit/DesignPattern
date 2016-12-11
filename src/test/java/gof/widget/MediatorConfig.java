package gof.widget;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class MediatorConfig {
	  @Bean
	  @Qualifier("buttonok")
	  public Button buttonok() {
		 return new Button();
	  }
	  @Bean
	  @Qualifier("buttoncancel")	  
	  public Button buttoncancel() {
		  return new Button();
	  }
	  @Bean
	  @Qualifier("entryfield")
	  public EntryField entryField() {
		 return new EntryField();
	  }
	  @Bean
	  @Qualifier("listbox")
	  public ListBox listBox() {
		  return new ListBox();
	  }
	  @Bean
	  public DialogDirector dialogDirecotor() {
		  return new FontDialogDirector();
	  }
}
