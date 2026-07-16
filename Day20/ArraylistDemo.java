package Day20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArraylistDemo {

	public static void main(String[] args) {
	     //Declaration
	     ArrayList mylist=new ArrayList();
		//List mylist=new ArrayList(); //parent class can hold child address
		//ArrayList <String> mylist=new ArrayList<String>(); //If we want to store specific datatype we have to use <> like this
		
		//Adding data into arrayList
	     mylist.add(100);
	     mylist.add(10.5);
	     mylist.add("welcome");
	     mylist.add('A');
	     mylist.add(true);
	     mylist.add(null);
	     mylist.add(100);
	     
	     //Size of arraylist
	     System.out.println("Size of an arraylist:" +mylist.size());
	     
	     //Printing arraylist
	     System.out.println("Printing data from arraylist:" +mylist); //[100, 10.5, welcome, A, true, null, 100]
		
	     //Remove element from arraylist
	     mylist.remove(5);
	     System.out.println("After removing:" +mylist); //[100, 10.5, welcome, A, true, 100]
	     
	     //Insert element in the arraylist
	     mylist.add(2,"java");
	     System.out.println("After insertion:" +mylist); //[100, 10.5, java, welcome, A, true, 100]
	     
	     //Modify element in the arraylist(modify/replace/change)
	     mylist.set(2, "python");
	     System.out.println("After modification:" +mylist);
	     
	     //Access specific element from arraylist
	     System.out.println(mylist.get(3));
	     
	     //Reading all the elements from arraylist
	     //using normal for loop
	     
	    /* for(int i=0;i<mylist.size();i++)
	     {
	    	 System.out.println(mylist.get(i));

	     }
	     */
	     
	     //using normal for loop
	   /*  for (int i=0;i<mylist.size();i++)
	     {
	    	 System.out.println(mylist.get(i));
	     }
	     */
	     
	     //using for each loop
	    /* for(Object x:mylist)
	     {
	    	 System.out.println(x);
	     }
	     */
	     
	     //using iterator
	     Iterator<String> it=mylist.iterator();
	     while(it.hasNext())
	     {
	    	 System.out.println(it.next());
	     }
	     
	     //Checking arraylist is empty or not
	     System.out.println("Is arrayList empty:"+ mylist.isEmpty());
	}

}
