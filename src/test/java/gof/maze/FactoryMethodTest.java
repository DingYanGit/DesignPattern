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
public class FactoryMethodTest {
	@Rule
	public final StandardOutputStreamLog log = new StandardOutputStreamLog();
	protected String newLineMark;
	@Autowired
	protected ApplicationContext context;
	@Autowired
	public void setNewLineMark() {
		this.newLineMark = System.getProperty("line.separator");
	}
	@Test
	public void bombedMazeGame()
	{
		MazeGame game = (MazeGame) this.context.getBean("bombedMazeGame");
		Maze maze = game.CreateMaze(true);
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
				+ "WEST:gof.maze.Door" + this.newLineMark, this.log.getLog());
	}
	@Test
	public void enchantedMazeGame()
	{
		MazeGame game = (MazeGame) this.context.getBean("enchantedMazeGame");
		Maze maze = game.CreateMaze(true);
		maze.showMapSites();
		assertEquals("gof.maze.EnchantedRoom" + this.newLineMark
				+ "NORTH:gof.maze.Wall" + this.newLineMark
				+ "SOUTH:gof.maze.Wall" + this.newLineMark
				+ "EAST:gof.maze.DoorNeedingSpell" + this.newLineMark
				+ "WEST:gof.maze.Wall" + this.newLineMark
				+ "gof.maze.EnchantedRoom" + this.newLineMark
				+ "NORTH:gof.maze.Wall" + this.newLineMark
				+ "SOUTH:gof.maze.Wall" + this.newLineMark
				+ "EAST:gof.maze.Wall" + this.newLineMark
				+ "WEST:gof.maze.DoorNeedingSpell" + this.newLineMark, this.log.getLog());
	}
}
