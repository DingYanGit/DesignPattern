package gof.maze;

public class FactoryMethod {
	public void Run() {
		MazeGame game;
		Maze maze;
		game = new BombedMazeGame();
		maze = game.CreateMaze(true);
		maze.showMapSites();
		game = new EnchantedMazeGame();
		maze = game.CreateMaze(true);
		maze.showMapSites();
	}
}
