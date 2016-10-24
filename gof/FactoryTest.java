import gof.maze.*;
public class FactoryTest {

	public static void main(String[] args) {
		/**
		 * Native 
		 */
/*		Native caseNative = new Native();
		caseNative.Run();*/
		/**
		 * AbstractFactory
		 */
		/*
		AbstractFactory abstractFactory = new AbstractFactory();
		abstractFactory.Run();
		*/
		/**
		 * Builder
		 */
		/*
		Builder builder = new Builder();
		builder.Run();
		*/
		/**
		 * Factory Method
		 */
		/*
		FactoryMethod fm = new FactoryMethod();
		fm.Run();
		*/
		/**
		 * Prototype
		 */
		Prototype prototype = new Prototype();
		prototype.Run();
		
	}
}
