package Day14;

class Animal
{
	void display(int a) {
		System.out.println(a);
	}
}
class Dog extends Animal
{
	void show(int b)
	{
		System.out.println(b);
	}
}

class Cat extends Animal
{
	void print(int c)
	{
		System.out.println(c);
	}
}


public class HierarchyInheritance {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.display(100);
		d.show(200);
		
		Cat c=new Cat();
		c.display(450);
		c.print(53);

	}

}
