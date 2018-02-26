public abstract class Employee {
	
	private String name;
	private int paymentPerHour;
	
	public Employee(String name, int paymentPerHour) {  //contructor of the class
		this.name = name;
		this.paymentPerHour = paymentPerHour;
	}
	
	public abstract int calculateSalary();  //cannot give the details. 
	//It is abstract method. So need to make the class abstract

	// This is setters and getters

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPaymentPerHour() {
		return paymentPerHour;
	}
	public void setPaymentPerHour(int paymentPerHour) {
		this.paymentPerHour = paymentPerHour;
	}
}

class Contractor extends Employee {   //using extends for Inheritance
	
	private int workingHours;
	public Contractor(String name, int paymentPerHour, int workingHours) {
		super(name, paymentPerHour);
		this.workingHours = workingHours;
	}
	@Override
	public int calculateSalary() { //he gets this method from Employee class, 
		return getPaymentPerHour() * workingHours; //this got implementation so it is not abstract.
	}
}

class FullTimeEmployee extends Employee {
	public FullTimeEmployee(String name, int paymentPerHour) {
		super(name, paymentPerHour);
	}
	@Override
	public int calculateSalary() {		//concrete method
		return getPaymentPerHour() * 8; 
	}
}

