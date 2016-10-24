package gof.maze;

public class Native {
	public Native() {
		
	}
	public void Run() {
		MazeGame mazeGame = new MazeGame();
		Maze maze = mazeGame.CreateMaze();
		maze.showMapSites();
	}
}
