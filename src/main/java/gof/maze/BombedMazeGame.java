package gof.maze;

import org.springframework.stereotype.Component;

@Component
public class BombedMazeGame extends MazeGame{
	public BombedMazeGame() {
		
	}
	public Wall MakeWall() {
		return new BombedWall();
	}
	public Room MakeRoom(int roomNumber) {
		return new RoomWithABomb(roomNumber);
	}
}
