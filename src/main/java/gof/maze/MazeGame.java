package gof.maze;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MazeGame {
	public Maze CreateMaze() {
		Maze aMaze = new Maze();
		Room r1 = new Room(1);
		Room r2 = new Room(2);
		Door theDoor = new Door(r1, r2);
		r1.SetSide(Direction.NORTH, new Wall());
		r1.SetSide(Direction.EAST, theDoor);
		r1.SetSide(Direction.SOUTH, new Wall());
		r1.SetSide(Direction.WEST, new Wall());
		r2.SetSide(Direction.NORTH, new Wall());
		r2.SetSide(Direction.EAST, new Wall());
		r2.SetSide(Direction.SOUTH, new Wall());
		r2.SetSide(Direction.WEST, theDoor);
		aMaze.AddRoom(r1);
		aMaze.AddRoom(r2);
		return aMaze;
	}

	public Maze CreateMaze(MazeFactory factory) {
		Maze aMaze = factory.MakeMaze();
		Room r1 = factory.MakeRoom(1);
		Room r2 = factory.MakeRoom(2);
		Door aDoor = factory.MakeDoor(r1, r2);
		aMaze.AddRoom(r1);
		aMaze.AddRoom(r2);
		r1.SetSide(Direction.NORTH, new Wall());
		r1.SetSide(Direction.EAST, aDoor);
		r1.SetSide(Direction.SOUTH, new Wall());
		r1.SetSide(Direction.WEST, new Wall());
		r2.SetSide(Direction.NORTH, new Wall());
		r2.SetSide(Direction.EAST, new Wall());
		r2.SetSide(Direction.SOUTH, new Wall());
		r2.SetSide(Direction.WEST, aDoor);
		return aMaze;
	}

	public Maze CreateMaze(MazeBuilder builder) {
		builder.BuildMaze();
		builder.BuildRoom(1);
		builder.BuildRoom(2);
		builder.BuildDoor(1, 2);
		return builder.GetMaze();
	}

	public Maze CreateMaze(boolean useFactoryMethod) {
		if (false == useFactoryMethod) {
			return this.CreateMaze();
		}
		Maze aMaze = MakeMaze();
		Room r1 = MakeRoom(1);
		Room r2 = MakeRoom(2);
		Door theDoor = MakeDoor(r1, r2);
		aMaze.AddRoom(r1);
		aMaze.AddRoom(r2);
		r1.SetSide(Direction.NORTH, new Wall());
		r1.SetSide(Direction.EAST, theDoor);
		r1.SetSide(Direction.SOUTH, new Wall());
		r1.SetSide(Direction.WEST, new Wall());
		r2.SetSide(Direction.NORTH, new Wall());
		r2.SetSide(Direction.EAST, new Wall());
		r2.SetSide(Direction.SOUTH, new Wall());
		r2.SetSide(Direction.WEST, theDoor);
		return aMaze;

	}

	public Maze MakeMaze() {
		return new Maze();
	}

	public Room MakeRoom(int n) {
		return new Room(n);
	}

	public Wall MakeWall() {
		return new Wall();
	}

	public Door MakeDoor(Room r1, Room r2) {
		return new Door(r1, r2);
	}
}
