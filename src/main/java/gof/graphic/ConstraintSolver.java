package gof.graphic;

public class ConstraintSolver {
	private static ConstraintSolver instance = null;
	@SuppressWarnings("unused")
	private ConstraintSolverMemento memento;
	protected ConstraintSolver() {
		
	}
	public static ConstraintSolver Instance() {
		if (null == ConstraintSolver.instance) {
			ConstraintSolver.instance = new ConstraintSolver();
		}
		return ConstraintSolver.instance;
	}
	public ConstraintSolverMemento CreateMemento() {
		return new ConstraintSolverMemento();
	}
	public void Solve() {
		
	}
	public void SetMemento(ConstraintSolverMemento memento) {
		this.memento = memento;
	}
}
