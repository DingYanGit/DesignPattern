package gof.maze;

public class RoomWithABomb extends Room{
	public RoomWithABomb() {
		super();
	}
	public RoomWithABomb(int roomNumber) {
		super(roomNumber);
	}
	public RoomWithABomb clone() {
		return new RoomWithABomb();
	}
}
