package Day17;

public class DataConversionMethod {

	public static void main(String[] args) {
		
		// String --->int
		
		//String s = "welcome"; //cannot convert to int
		
		/*String s1="10";
		String s2="20";
		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));
*/
		
		//String--->double
		/*String s1="10.5";
		String s2="12.4";
		System.out.println(Double.parseDouble(s1)+Double.parseDouble(s2));
		*/
		
		//String-->boolean -other than true,if you pass any string that will returns false
		String s="Hello";
		System.out.println(Boolean.parseBoolean(s));
		
		
		String s4="true";
		System.out.println(Boolean.parseBoolean(s4));
		
		
		//converting all primitive to string
		//int, double, bool, char ---->String
		int a=10;
		double d=10.5;
		char c='A';
		boolean bool=true;
		
		String s5=String.valueOf(a);
		System.out.println(s5);
		
	    s5=String.valueOf(d);
		System.out.println(s5);
		
		s5=String.valueOf(c);
		System.out.println(s5);
		
		 s5=String.valueOf(bool);
		 System.out.println(s5);
		
	}

}
