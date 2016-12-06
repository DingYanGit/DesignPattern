package gof.maze;

import org.junit.Rule;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@ContextConfiguration(classes=CreatorConfig.class,loader=AnnotationConfigContextLoader.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class BuilderTest {
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
	protected StandardMazeBuilder sdBuilder;
	@Autowired
	protected CountingMazeBuilder ctBuilder;
	@Autowired
	protected Maze maze;
	@Test
	public void StandardBuilder()
	{
		this.game.CreateMaze(this.sdBuilder);
		this.maze = this.sdBuilder.GetMaze();
		this.maze.showMapSites();
		assertEquals("gof.maze.Room" + this.newLineMark
				+ "NORTH:gof.maze.Wall" + this.newLineMark
				+ "SOUTH:gof.maze.Wall" + this.newLineMark
				+ "EAST:gof.maze.Door" + this.newLineMark
				+ "WEST:gof.maze.Wall" + this.newLineMark
				+ "gof.maze.Room" + this.newLineMark
				+ "NORTH:gof.maze.Wall" + this.newLineMark
				+ "SOUTH:gof.maze.Wall" + this.newLineMark
				+ "EAST:gof.maze.Wall" + this.newLineMark
				+ "WEST:gof.maze.Door" + this.newLineMark, log.getLog());
	}
	@Test
	public void CountingBuilder() 
	{
		this.game.CreateMaze(this.ctBuilder);
		this.maze = this.sdBuilder.GetMaze();
		Integer counts[] = this.ctBuilder.GetCounts();
		assertTrue(counts[0] == 2);
		assertTrue(counts[1] == 1);
	}
}
