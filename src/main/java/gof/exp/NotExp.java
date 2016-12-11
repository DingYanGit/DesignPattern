package gof.exp;

public class NotExp extends BooleanExp {
	BooleanExp oprand;
	public NotExp(BooleanExp exp) {
		this.oprand = exp;
	}
	public BooleanExp Copy() {
		return new NotExp(this.oprand.Copy());
	}
	public boolean Evaluate(Context context) {
		return !this.oprand.Evaluate(context);
	}	
}
