package Day15;

class Bank
{
	double roi()
	{
		return 0;
	}
}

class Canara extends Bank
{
	double roi()
	{
		return 10.5;
	}
}

class SBI extends Bank
{
	double roi()
	{
		return 11.5;
	}
}


public class OverridindDemo {

	public static void main(String[] args) {
		Canara cn=new Canara();
		System.out.println(cn.roi());
		
		SBI sb=new SBI();
		System.out.println(sb.roi());
		

	}

}
