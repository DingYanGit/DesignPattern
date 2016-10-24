package gof.Exp;

public class OrExp {
	private BooleanExp oprand1, oprand2;
	public OrExp(BooleanExp op1, BooleanExp op2) {
		this.oprand1 = op1;
		this.oprand2 = op2;
	}
	boolean Evaluate(Context context) {
		return this.oprand1.Evaluate(context) || this.oprand2.Evaluate(context);
	}
}
