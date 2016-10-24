package gof.maze;

public class Prototype {
	public void Run() {
		MazeGame mazeGame = new MazeGame();
		MazePrototypeFactory factory = new MazePrototypeFactory(new Maze(), new Wall(), new Room(), new Door());
		Maze maze = mazeGame.CreateMaze(factory);
		maze.showMapSites();
		factory = new MazePrototypeFactory(new Maze(), new BombedWall(), new RoomWithABomb(), new Door());
		maze = mazeGame.CreateMaze(factory);
		maze.showMapSites();
	}
}
