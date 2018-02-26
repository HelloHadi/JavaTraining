class AppendStringBuilder{
	public static void main(String [] args){
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		sb1.append("Java");
		sb1.append(new Person("Oracle"));
		System.out.println(sb1);
		sb1.append(new Person("Oracle"));
		System.out.println(sb1);
		
		sb2.append(new Person1("Oracle"));
		System.out.println(sb2);
	}
	
}

class Person{
	String name;
	Person(String str){
		name = str;
	}
}
	
	class Person1{
	String name;
	Person1(String str){
		name = str;
	}
}
