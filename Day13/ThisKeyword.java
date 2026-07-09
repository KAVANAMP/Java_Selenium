package Day13;

public class ThisKeyword
{

	int x,y; //class variables
	
	/*ThisKeyword(int a,int b) //constructor - local variable
	{
		x=a;
		y=b;
	}
	*/
	
	ThisKeyword(int x,int y) //constructor - local variable
	{
		this.x=x;
		this.y=y;
	}
	
	void display() {
		System.out.println(x);
		System.out.println(y);
	}
	public static void main(String[] args) {
		ThisKeyword tk=new ThisKeyword(100,200);
        tk.display();
	}

}

// this keyword always represent class variable