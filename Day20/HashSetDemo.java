package Day20;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		//Declaration
		
		HashSet myset=new HashSet();
		//Set myset=new HashSet();
		//HashSet<String> myset=new HashSet<String>();
		
		//adding elements in to hashset
		 myset.add(100);
	     myset.add(10.5);
	     myset.add("welcome");
	     myset.add('A');
	     myset.add(true);
	     myset.add(null);
	     myset.add(100);
	     myset.add(null);
	     
	     //Printing hashset
	     System.out.println(myset); //[null, A, 100, 10.5, welcome, true]
	     
	     //Size of hashset
	     System.out.println("size of HasgSet:"+myset.size()); 

	     //Removing element
	     myset.remove(10.5);//10.5 is value (not an index)
	     System.out.println("After removing:"+myset); //[null, A, 100, welcome, true]
	     
	     //Inserting elements - not possible
	     
	     //Access specific elements- not possible
	     
	     //Conver Hashset -->Arraylist
	     ArrayList al=new ArrayList(myset);
	     System.out.println(al); 
	     System.out.println(al.get(2)); 
	     
	     //using for each loop
		     for(Object x:myset)
		     {
		    	 System.out.println(x);
		     }
	     
	}

}
