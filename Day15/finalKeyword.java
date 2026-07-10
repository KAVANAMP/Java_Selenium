package Day15;

class Test
{
	final int x=100;
}




public class finalKeyword {

	public static void main(String[] args) {
		Test t=new Test();
		// t.x=200; //we can change value of variable through obj and it is invalid bcs x is final
		System.out.println(t.x);

	}

}


// if variable created with final keyword we cannot change the value of variable otherwise we can change