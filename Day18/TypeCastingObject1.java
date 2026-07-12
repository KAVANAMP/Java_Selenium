package Day18;

class parent
{
	String name="Jhon";
	
	void m1()
	{
		System.out.println("this is m1 from parent..");
	}
}

class Child extends parent
{
	int id=101;
	
	void m2()
	{
		System.out.println("this is m2 from child..");
	}
}

public class TypeCastingObject1 {

	public static void main(String[] args) {
		/*Child c = new Child();
		System.out.println(c.name);  //Parent
		c.m1();//Parent
		System.out.println(c.id); //child
		c.m2(); //child
*/
	
		/*parent p = new Child();  //upcasting
		System.out.println(p.name);  //Parent
		p.m1();
		
		System.out.println(c.id); //we cannot access
		p.m2();
		*/
		parent p = new parent();
		Child c =(Child)p;
		
		System.out.println(c.name); 
		System.out.println(c.id); 
		c.m1();
		c.m2();
		
		
		
	}

}
