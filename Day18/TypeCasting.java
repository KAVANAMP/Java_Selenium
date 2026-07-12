package Day18;

//upcasting - converting value from smaller to larger
//int --->long
//float--->double


//downcasting - converting value from larger to smaller
//long --->int
//double --->float

public class TypeCasting {

	public static void main(String[] args) {
		// upcasting - automatic --- smaller to larger
		
		/*int intvalue=100;
		long longvalue=intvalue;
		System.out.println(longvalue);
        */
		
		//float floatvalue=10.5F;
		//double dvalue=floatvalue;
		
		//downcasting - manually ---larger to smaller
		
		//long lvalue=10000;
		//int ivalue=(int)lvalue;
		
		//double dvalue=125.55;
		//float fvalue=(float)dvalue;
		
		//Example 1
		int i=100;
		double d=i;  //upcasting
		System.out.println(d);  //100
	}

}
