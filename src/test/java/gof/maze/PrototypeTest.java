package gof.maze;

import org.junit.Rule;
import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@ContextConfiguration(classes=CreatorConfig.class,loader=AnnotationConfigContextLoader.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class PrototypeTest {
	@Rule
	public final StandardOutputStreamLog log = new StandardOutputStreamLog();
	protected String newLineMark;
	@Autowired
	protected ApplicationContext context;
	@Autowired
	protected MazeGame game;
	@Autowired
	public void setNewLineMark() {
		this.newLineMark = System.getProperty("line.separator");
	}
	@Test
	public void prototype()
	{
		Maze maze = this.context.getBean(Maze.class);
		Wall wall = this.context.getBean(Wall.class);
		Room room = this.context.getBean(Room.class);
		Door door = this.context.getBean(Door.class);
		MazePrototypeFactory factory = (MazePrototypeFactory) this.context.getBean("mazePrototypeFactory", maze, wall, room, door);
		maze = this.game.CreateMaze(factory);
		maze.showMapSites();
		assertEquals("gof.maze.Room" + this.newLineMark
				+ "NORTH:gof.maze.Wall" + this.newLineMark
				+ "SOUTH:gof.maze.Wall" + this.newLineMark
				+ "EAST:gof.maze.Door" + this.newLineMark
				+ "WEST:gof.maze.Wall" + this.newLineMark
				+ "gof.maze.Room" + this.newLineMark
				+ "NORTH:gof.maze.Wall" + this.newLineMark
				+ "SOUTH:gof.maze.Wall" + this.newLineMark
				+ "EAST:gof.maze.Wall" + this.newLineMark
				+ "WEST:gof.maze.Door" + this.newLineMark
				, this.log.getLog());
	}
	@Test
	public void prototypeBombed()
	{
		Maze maze = this.context.getBean(Maze.class);
		Wall wall = this.context.getBean(BombedWall.class);
		Room room = this.context.getBean(RoomWithABomb.class);
		Door door = this.context.getBean(Door.class);
		MazePrototypeFactory factory = (MazePrototypeFactory) this.context.getBean("mazePrototypeFactory", maze, wall, room, door);
		maze = this.game.CreateMaze(factory);
		maze.showMapSites();
		assertEquals("gof.maze.RoomWithABomb" + this.newLineMark
				+ "NORTH:gof.maze.Wall" + this.newLineMark
				+ "SOUTH:gof.maze.Wall" + this.newLineMark
				+ "EAST:gof.maze.Door" + this.newLineMark
				+ "WEST:gof.maze.Wall" + this.newLineMark
				+ "gof.maze.RoomWithABomb" + this.newLineMark
				+ "NORTH:gof.maze.Wall" + this.newLineMark
				+ "SOUTH:gof.maze.Wall" + this.newLineMark
				+ "EAST:gof.maze.Wall" + this.newLineMark
				+ "WEST:gof.maze.Door" + this.newLineMark
				, this.log.getLog());
	}
}
