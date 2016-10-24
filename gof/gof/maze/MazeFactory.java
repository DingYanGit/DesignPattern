package gof.maze;

import java.util.HashMap;
import java.util.Map;
public class MazeFactory {
	private static Map<String, MazeFactory> mapInstance = new HashMap<String, MazeFactory>();
	public static MazeFactory Instance() {
		MazeFactory mazeFactory = MazeFactory.mapInstance.get("");
		if (mazeFactory == null) {
			mazeFactory = new MazeFactory();
		}
		return mazeFactory;
	}
	public static MazeFactory Instance(String s) {
		MazeFactory mazeFactory = MazeFactory.mapInstance.get(s);
		if (mazeFactory == null) {
			if (s.contentEquals("BombedMazeFactory")) {
				mazeFactory = new BombedMazeFactory();
				MazeFactory.mapInstance.put(s, mazeFactory);
			}
			if (s.contentEquals("EnchantedMazeFactory")) {
				mazeFactory = new EnchantedMazeFactory();
				MazeFactory.mapInstance.put(s, mazeFactory);
			}
			if (s.contentEquals("MazePrototypeFactory")) {
				mazeFactory = new MazePrototypeFactory();
				MazeFactory.mapInstance.put(s, mazeFactory);
			}
		}
		return mazeFactory;
	}
	protected MazeFactory() {
	}
	public Maze MakeMaze() {
		return new Maze();
	}
	public Wall MakeWall() {
		return new Wall();
	}
	public Room MakeRoom(int n) {
		return new Room(n);
	}
	public Door MakeDoor(Room r1, Room r2) {
		return new Door(r1, r2);
	}
}
