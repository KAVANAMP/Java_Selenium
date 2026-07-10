package Day15;


class ABC
{
	void m1(int a)
	{
		System.out.println(a);
	}

void m2(int b) //overloading
{
	System.out.println(b);
}
}
class XYZ extends ABC
{
	void m1(int a)
	{
		System.out.println(a*a); //changed implementation -overriding
	}
	void m2(int b) //overrided
	{
		System.out.println(b*b);
	}
	
	void m2(int a,int b) //overloading-changedXYZ the declaration
	{
		System.out.println(a+b);
	}
	
}

public class OverloadingVSOverriding {

	public static void main(String[] args) {
		XYZ xyzobj = new XYZ();
		xyzobj.m1(25);
		xyzobj.m2(10);
		xyzobj.m2(100, 200);

	}

}
