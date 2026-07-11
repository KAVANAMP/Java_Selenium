package Day16;

interface Shape
{
	int length=10; //final &static
	int width=20; //final &static
	
	void circle(); // abstract method
	
	default void square()
	{
		System.out.println("this is rectangle-default method");
	}
	static void rectangle()
	{
		System.out.println("this is rectangle-static method");
	}
	
}

public class InterfaceDemo implements Shape
{
	public void circle()
	{
		System.out.println("this is circle-abstract method");
	}

	public static void main(String[] args) {
		
		//Scenario 1
		//InterfaceDemo id=new InterfaceDemo();
		//id.circle(); //abstract
		//id.square(); //default
		//Shape.rectangle(); // static method can directly access from interface
		
		// Scenario 2
		Shape sh=new InterfaceDemo();
		sh.circle(); //abstract
		sh.square(); //default
		Shape.rectangle(); // static method can directly access from interface
		System.out.println(Shape.length * Shape.width); //accessing static variables directly
		

	}

}
