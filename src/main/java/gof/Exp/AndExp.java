package gof.Exp;

public class AndExp extends BooleanExp{ 
	private BooleanExp oprand1, oprand2;
	public AndExp(BooleanExp op1, BooleanExp op2) {
		this.oprand1 = op1;
		this.oprand2 = op2;
	}
	public boolean Evaluate(Context context) {
		return this.oprand1.Evaluate(context) && this.oprand2.Evaluate(context);
	}
	public BooleanExp Copy() {
		return new AndExp(this.oprand1.Copy(), this.oprand2.Copy());
	}
}
