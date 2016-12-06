package gof.maze;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.stereotype.Component;

@Component
public class Maze implements Cloneable{
	private Map<Integer, Room> rooms;
	public Maze() {
		this.rooms = new HashMap<Integer, Room>();
	}
	public void AddRoom(Room r) {
		Integer roomNumber = Integer.valueOf(r.getRoomNumber());
		rooms.put(roomNumber, r);
	}
	public Room RoomNo(int roomNo) {
		return this.rooms.get(Integer.valueOf(roomNo));	
	}
	public Maze clone() {
		return new Maze();
	}
	public void showMapSites() {
		Iterator<Entry<Integer, Room>> iterator = this.rooms.entrySet().iterator();
		while (iterator.hasNext()) {
			iterator.next().getValue().ShowMapSite();
		}
	}
}
