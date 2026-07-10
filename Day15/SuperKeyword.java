package Day15;

public class SuperKeyword {
String color ="white";

void eat()
{
	System.out.println("eating chocolate..");
}
}
class Dog extends SuperKeyword
{
	String color ="black";
	
	void displayColor()
	{
		System.out.println(super.color);
	}
	void eat()
	{
		//System.out.println("eating bread..");
		super.eat();
	}
}
