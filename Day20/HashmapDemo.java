package Day20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashmapDemo {

	public static void main(String[] args) {
		//Declaration
		
		//HashMap hm=new HashMap();
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
		//Adding pairs
		hm.put(101,"Jhon");
		hm.put(102,"Jho");
		hm.put(103,"Dhon");
		hm.put(104,"Mary");
		hm.put(105,"Scott");
		hm.put(101,"David");
		
		System.out.println(hm); //{101=David, 102=Jho, 103=Dhon, 104=Mary, 105=Scott}
		
		System.out.println("Size of hashmap:"+hm.size()); //4
		
		//remove pair
		hm.remove(103);
		System.out.println("After removing pair:"+hm); 
		
		//access value of the sky
		System.out.println(hm.get(102));
		
		//get all the keys from hashmap
		System.out.println(hm.keySet()); //[101, 102, 104, 105]
		System.out.println(hm.values()); //[David, Jho, Mary, Scott]
		System.out.println(hm.entrySet()); //[101=David, 102=Jho, 104=Mary, 105=Scott]
		
		//Reading data from hashmap
		
		
		/*for(int k:hm.keySet())
		{
			System.out.println(k+"    "+hm.get(k));
			
		}*/
		
		//using iterator
		Iterator<Entry<Integer,String>>it=hm.entrySet().iterator();
		while(it.hasNext())
		{
			Entry<Integer,String>entry=it.next();
			System.out.println(entry.getKey()+"    "+entry.getValue());
		}
		hm.clear();
		System.out.println(hm.isEmpty()); //true
	}

}
