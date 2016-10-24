package gof.maze;


public class Builder {
	public void Run() {
		Maze maze;
		MazeGame mazeGame = new MazeGame();
		StandardMazeBuilder standardMazeBuilder = new StandardMazeBuilder();
		mazeGame.CreateMaze(standardMazeBuilder);
		maze = standardMazeBuilder.GetMaze();
		maze.showMapSites();
		CountingMazeBuilder countingMazeBuilder = new CountingMazeBuilder();
		mazeGame = new MazeGame();
		maze = mazeGame.CreateMaze(countingMazeBuilder);
		Integer counts[] = countingMazeBuilder.GetCounts();
		System.out.println("The maze has " + counts[0].intValue() + " rooms and " + counts[1].intValue() + " doors");
	}
}
