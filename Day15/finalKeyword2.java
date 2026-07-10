package Day15;

final class Test1 // not allowed to inheritance
{
	final void m() //if we make method as final it will  not allowed to override
	{
		System.out.println("this is a method from test 1..");
	}
}
/*class Test2 extends Test1 // incorrect,bcs Test1 is final
{
	void m()
	{
		System.out.println("this is a method from test2..");
	}	
}
*/
public class finalKeyword2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
