package gof.graphic;

import java.awt.Point;

public class MoveCommand {
	private Graphic target;
	@SuppressWarnings("unused")
	private Point delta;
	private ConstraintSolverMemento state;
	public MoveCommand(Graphic target, Point delta) {
		this.delta = delta;
		this.target = target;
	}
	public void Execute() {
		ConstraintSolver solver = ConstraintSolver.Instance();
		this.state = solver.CreateMemento();
		target.Move();
		solver.Solve();
	}
	public void UnExecute() {
		ConstraintSolver solver = ConstraintSolver.Instance();
		this.target.Move();
		solver.SetMemento(this.state);
		solver.Solve();
	}
}
