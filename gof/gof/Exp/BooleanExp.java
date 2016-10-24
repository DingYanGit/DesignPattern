package gof.Exp;

public abstract class BooleanExp {
	public abstract BooleanExp Copy();
	public abstract boolean Evaluate(Context context);
}
