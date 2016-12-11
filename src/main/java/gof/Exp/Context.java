package gof.exp;

import java.util.HashMap;
import java.util.Map;
public class Context {
	protected Map<String, Boolean> variableMap = new HashMap<String, Boolean>(); 
	public boolean Lookup(String s) {
		return this.variableMap.get(s);
	}
	public void Assign(VariableExp exp, Boolean bool) {
		String s = exp.GetVariableName();
		if (this.variableMap.containsKey(s)) {
			this.variableMap.replace(s, bool);
		} else {
			this.variableMap.put(s, bool);
		}
	}
}
