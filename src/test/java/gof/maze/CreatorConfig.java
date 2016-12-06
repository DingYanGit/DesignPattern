package gof.maze;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class CreatorConfig {
	@Bean
	@Qualifier("BombedMazeFactory")
	public MazeFactory bombedMazeFacotory()
	{
		return MazeFactory.Instance("BombedMazeFactory");
	}
	@Bean
	@Qualifier("EnchantedMazeFactory")
	public MazeFactory enchantedMazeFacotory()
	{
		return MazeFactory.Instance("EnchantedMazeFactory");
	}
	
}
