package gof.Exp;

public class VariableExp extends BooleanExp{
	protected String variableName;
	public VariableExp(String name) {
		this.variableName = name;
	}
	public boolean Evaluate(Context context) {
		return context.Lookup(this.variableName);
	}
	public BooleanExp Copy() {
		return new VariableExp(this.variableName);
	}
}
