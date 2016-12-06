package gof.Exp;

import java.util.HashMap;
import java.util.Map;
public class Context {
	protected Map<String, Boolean> variableMap = new HashMap<String, Boolean>(); 
	public boolean Lookup(String s) {
		return this.variableMap.get(s);
	}
}
