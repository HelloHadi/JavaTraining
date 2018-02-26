class Dog{
	



}

class C{
	public static void main(String[] args){
	int x = 5;
	int y = 15;
	
	System.out.println(x == y);
	
	x = y;
	System.out.println(x == y);
		
	Dog d1 = new Dog();
	Dog d2 = new Dog();
	System.out.println(d1 == d2);
	
	String s1 = "Malaysia";
	String s2 = "Malaysia";
	String s3 = new String("Malaysia");
	String s4 = new String("Japan");
	System.out.println(s1 + "is a country" );
	System.out.println(s1 == s2);
	System.out.println(s1 == s3);
	System.out.println(s1.equals(s2));
	System.out.println(s1.equals(s3));
	System.out.println(s4.equals(s3));
	
	}
	
	
}