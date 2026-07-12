package Day18;

//A b=(C) d;
public class TypeCastingObject3 {

	public static void main(String[] args) {
        
		//Object o =new String("elcome");
		//StringBuffer sb=(StringBuffer) o; //Rule1-yes   Rule2-yes Rule3-failed
		
		//Ex2:
		//String s=new String("welcome");
		//StringBuffer sb=(StringBuffer) s; //Rule1-failed
		
		//Ex3:
		Object o=new String("welcome");
		StringBuffer sb=(StringBuffer)o; //rule2-yes rule1-yes
	}

}
