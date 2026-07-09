package Day14;

public class PassingParamstoMainMethod {

	public static void main(String[] args) {
		System.out.println(args.length);// length of arra
		
		for(String value:args) //read array
		{
			System.out.println(value);
		}

	}

}
