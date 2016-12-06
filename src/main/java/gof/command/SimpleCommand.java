package gof.command;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class SimpleCommand<Receiver> {
	private String action; 
	@SuppressWarnings("unused")
	private Receiver receiver;
	public SimpleCommand(Receiver receiver, String action) {
		this.action = action;
		this.receiver = receiver;
	}
	public void Execute() {
		Class<Object> classes[] = null;
		try {
			Method method = this.action.getClass().getMethod(this.action, classes);
			try {
				Object parameter = null;
				method.invoke(this.action, parameter);
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
