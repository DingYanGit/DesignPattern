package gof.maze;

public class AbstractFactory {
	public void Run() {
		MazeGame game = new MazeGame();
		String sInstance = new String("BombedMazeFactory");
		MazeFactory factory = (BombedMazeFactory)MazeFactory.Instance(sInstance);
		Maze maze = game.CreateMaze(factory);
		maze.showMapSites();
		sInstance = new String("EnchantedMazeFactory");
		factory = (EnchantedMazeFactory)MazeFactory.Instance(sInstance);
		game = new MazeGame();
		maze = game.CreateMaze(factory);
		maze.showMapSites();
	}
}
