
class Man {

	private String name;

	Man(String name) {
		this.name = name;
	}

	
	public String getName() {

		return name;
	}

	public void setName(String val) {

		name = val;
	}	

	public static void swap(Man m1, Man m2) {
	System.out.println("Inside swap");

	System.out.println("m1 : " + m1);
	System.out.println("m2 : " + m2);

	System.out.println();
        Man temp = m1;

        m1 = m2;

	m2 = temp;

	System.out.println("m1 : " + m1);
	System.out.println("m2 : " + m2);
	}

	// Method to actually change the state of an object

	public static void changeState(Man m) {

	m.setName("Gopinathan Munappy");

	}

	public static void main(String args[]) {
	
	Man m1  = new Man("Gopi");
	
	Man m2  = new Man("Gopinathan");

	System.out.println("m1 : " + m1);
	System.out.println("m2 : " + m2);

	System.out.println(m1.getName() + ": " + m2.getName());

	swap(m1, m2);

	System.out.println("other");
	Man temp = new Man("S");
	
	temp = m1;

        m1 = m2;

	m2 = temp;

	System.out.println("m1 : " + m1.getName());
	System.out.println("m2 : " + m2.getName());

	System.out.println("After the swap");
	System.out.println("m1 : " + m1);
	System.out.println("m2 : " + m2);
	System.out.println("");

	System.out.println(m1.getName() + ": " + m2.getName());

	changeState(m1);
	changeState(m2);

	System.out.println(m1.getName() + ": " + m2.getName());

	} // main

} // class
	



