package gof.maze;

import org.springframework.stereotype.Component;

@Component
public class StandardMazeBuilder extends MazeBuilder{
	private Maze currentMaze;
	public StandardMazeBuilder() {
		this.currentMaze = null;
	}
	public void BuildMaze() {
		this.currentMaze = new Maze();
	}
	public void BuildRoom(int n) {
		if (null == this.currentMaze.RoomNo(n)) {
			Room room = new Room(n);
			this.currentMaze.AddRoom(room);
			room.SetSide(Direction.NORTH, new Wall());
			room.SetSide(Direction.SOUTH, new Wall());
			room.SetSide(Direction.EAST, new Wall());
			room.SetSide(Direction.WEST, new Wall());
		}
	}
	public void BuildDoor(int n1, int n2) {
		Room r1 = this.currentMaze.RoomNo(n1);
		Room r2 = this.currentMaze.RoomNo(n2);
		Door door = new Door(r1, r2);
		r1.SetSide(Direction.EAST, door);
		r2.SetSide(Direction.WEST, door);
	}
	public Maze GetMaze() {
		return this.currentMaze;
	}
}
