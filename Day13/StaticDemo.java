package Day13;

public class StaticDemo {
	static int a=10; //static variable
	int b=30;//non static variable
	
	static void m1() //static method
	{
		System.out.println("this is a static method");
	}
	void m2() // non static method
	{
		System.out.println("this is a non static method");
	}
	void m() // non static
	{
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}


	public static void main(String[] args) {
		
		//1) static methods can access static variables and methods without creating any object 
		System.out.println(a);
		m1();
		
		//System.out.println(b); // cannot access,b is non static
		//m2(); //cannot access,m2 is non static
		
		StaticDemo sd= new StaticDemo();
		//System.out.println(sd.b);
		//sd.m2();
		
		sd.m();
	}
}
