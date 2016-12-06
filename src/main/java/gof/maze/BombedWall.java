package gof.maze;

import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.springframework.stereotype.Component;

import gof.maze.BombedWall.BomWall;

@Component
@BomWall
public class BombedWall extends Wall{
	@Retention(RUNTIME)
	@Target({ TYPE, FIELD, METHOD, CONSTRUCTOR })
	public @interface BomWall {

	}
	private boolean hasBomb;
	public BombedWall clone() {
		BombedWall wall = new BombedWall();
		wall.SetBomb(hasBomb);
		return wall;
	}
	public boolean HasBomb() {
		return this.hasBomb;
	}
	public void SetBomb(boolean hasBomb) {
		this.hasBomb = hasBomb;
	}
}
