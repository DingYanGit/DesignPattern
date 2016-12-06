package gof.maze;
import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@ContextConfiguration(classes=CreatorConfig.class,loader=AnnotationConfigContextLoader.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class AbstractFactoryTest {
	@Rule
	public final StandardOutputStreamLog log = new StandardOutputStreamLog();
	protected String newLineMark;
	@Autowired
	public void setNewLineMark() {
		this.newLineMark = System.getProperty("line.separator");
	}
	@Autowired
	protected MazeGame game;
	@Autowired
	@Qualifier("BombedMazeFactory")
	MazeFactory bombedFactory;
	@Autowired
	@Qualifier("EnchantedMazeFactory")
	MazeFactory enchantedFactory;	
		@Test
		public void BombedMazeFactory()
		{
			Maze maze= game.CreateMaze(this.bombedFactory);
			maze.showMapSites();
			assertEquals("gof.maze.RoomWithABomb" + newLineMark +
			"NORTH:gof.maze.Wall"  + newLineMark +
			"SOUTH:gof.maze.Wall"  + newLineMark +
			"EAST:gof.maze.Door"  + newLineMark +
			"WEST:gof.maze.Wall"  + newLineMark +
			"gof.maze.RoomWithABomb"  + newLineMark +
			"NORTH:gof.maze.Wall"  + newLineMark +
			"SOUTH:gof.maze.Wall"  + newLineMark +
			"EAST:gof.maze.Wall"  + newLineMark +
			"WEST:gof.maze.Door"  + newLineMark, log.getLog());
		}
	@Test	
	public void EnchantedMazeFactory()
	{
		System.out.print(log.getLog());
		Maze maze= game.CreateMaze(this.enchantedFactory);
		maze.showMapSites();
		assertEquals("gof.maze.EnchantedRoom" + newLineMark +
		"NORTH:gof.maze.Wall"  + newLineMark +
		"SOUTH:gof.maze.Wall"  + newLineMark +
		"EAST:gof.maze.DoorNeedingSpell"  + newLineMark +
		"WEST:gof.maze.Wall"  + newLineMark +
		"gof.maze.EnchantedRoom"  + newLineMark +
		"NORTH:gof.maze.Wall"  + newLineMark +
		"SOUTH:gof.maze.Wall"  + newLineMark +
		"EAST:gof.maze.Wall"  + newLineMark +
		"WEST:gof.maze.DoorNeedingSpell"  + newLineMark, log.getLog());		
	}
}
