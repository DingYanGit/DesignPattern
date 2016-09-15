
public class Test {
	public static void main(String[] args)
	{
			Singleton instanceA = Singleton.getInstance();
			instanceA.echo();
			Singleton instanceB = Singleton.getInstance();
			instanceB.echo();
	}
}
