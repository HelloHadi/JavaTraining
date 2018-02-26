class Testing{
	int x = 10;
	static int y = 20;
	
	void doIt(){
		System.out.println("Hi");
	}

	static void dontDo(){
		System.out.println("Bye");
	}

	public static void main(String [] args){
		//Testing t2 = new Testing();
		//System.out.println("x" +t1.x);
		//System.out.println("x:" +x); //cannot access non static from static
		System.out.println("y:" +y);
		Testing t1 = new Testing();
		t1.doIt();
		System.out.println("x:" +t1.x); // correct way to call non static instance from static method
		//doIt();
		dontDo();
	}
}