package gof.maze;

import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.springframework.stereotype.Component;

import gof.maze.RoomWithABomb.BomRoom;

@Component
@BomRoom
public class RoomWithABomb extends Room{
	@Retention(RUNTIME)
	@Target({ TYPE, FIELD, METHOD, CONSTRUCTOR })
	public @interface BomRoom {

	}
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
