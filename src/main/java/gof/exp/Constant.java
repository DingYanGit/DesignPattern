package gof.exp;

public class Constant extends BooleanExp{
	Boolean bool;
	public Constant(Boolean bool) {
		this.bool = bool;
	}
	public BooleanExp Copy() {
		return new Constant(bool);
	}
	public boolean Evaluate(Context context) {
		return this.bool;
	}
	
}
