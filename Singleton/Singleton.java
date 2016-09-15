
public class Singleton {
	protected static Singleton instance;
	
	protected Singleton()
	{
		
	}
	
	public static Singleton getInstance()
	{
		if(instance == null){
			instance = new Singleton();
		}
		return instance;
	}
	
	public void echo()
	{
		System.out.println("hello, singleton");
	}
}
