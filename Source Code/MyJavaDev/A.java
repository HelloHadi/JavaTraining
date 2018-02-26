class B{
	private String name;
	int age;

	B(){
		
		age = 22;
	}

	public void setname(String val){

		name = val;
	}

	public void printemp(){

		System.out.println("name" +name+ "age" +age);
	}
}

public class A{
	public static void main(String args[]){

		B e = new B();
		e.printemp();
		e.name = "Selvan";
	}
}