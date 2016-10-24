package gof.maze;

public class MazePrototypeFactory extends MazeFactory{
	private Maze prototypeMaze;
	private Room prototypeRoom;
	private Wall prototypeWall;
	private Door prototypeDoor;
	public MazePrototypeFactory() {
		this.prototypeMaze = null;
		this.prototypeRoom = null;
		this.prototypeWall = null;
		this.prototypeDoor = null;
	}
	public MazePrototypeFactory(Maze maze, Wall wall, Room room, Door door) {
		this.prototypeMaze = maze;
		this.prototypeWall = wall;
		this.prototypeRoom = room;
		this.prototypeDoor = door;
	}
	public Maze MakeMaze() {
		return this.prototypeMaze.clone();
	}
	public Room MakeRoom(int n) {
		Room room = this.prototypeRoom.clone();
		room.Initailize(n);
		return room;
	}
	public Wall MakeWall() {
		return this.prototypeWall.clone();
	}
	public Door MakeDoor(Room r1, Room r2) {
		Door door = this.prototypeDoor.clone();
		door.Initialize(r1, r2);
		return door;
	}
}
