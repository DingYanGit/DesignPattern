package gof.maze;

import org.springframework.stereotype.Component;

@Component
public class CountingMazeBuilder extends MazeBuilder{
	private int roomCount, doorCount;
	private Maze maze;
	public CountingMazeBuilder() {
		this.roomCount = this.doorCount = 0;
	}
	public void BuildMaze() {
		
	}
	public void BuildRoom(int n) {
		this.roomCount++;
	}
	public void BuildDoor(int n1, int n2) {
		this.doorCount++;
	}
	public void AddWall(int n, Direction direction) {
		
	}
	public Integer[] GetCounts() {
		Integer roomCount = Integer.valueOf(this.roomCount);
		Integer doorCount = Integer.valueOf(this.doorCount);
		Integer[] counts = {roomCount, doorCount};
		return counts;
	}
	public Maze GetMaze() {
		return this.maze;
	}
}
