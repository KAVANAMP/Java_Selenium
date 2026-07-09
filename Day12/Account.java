package Day12;


//Encapsulation
public class Account {

	private int accno;
	private String name;
	private double amount;
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
}
//accno=accno; -> gives 0 as output bcs computer doesn't know which is class variable and local variable
// if both are same we have to use "this " keyword