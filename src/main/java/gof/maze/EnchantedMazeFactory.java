package gof.maze;

public class EnchantedMazeFactory extends MazeFactory {
	public Room MakeRoom(int n) {
		return new EnchantedRoom(n);
	}
	public Door MakeDoor(Room r1, Room r2) {
		return new DoorNeedingSpell(r1, r2);
	}

}
