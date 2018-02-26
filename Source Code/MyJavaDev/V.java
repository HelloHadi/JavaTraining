class V{
	public static void main(String [] args){
		StringBuilder sb1 = new StringBuilder();
		System.out.println(sb1.length());
		
		StringBuilder sb2 = new StringBuilder("Gopi");
		System.out.println(sb2.length());
		sb2 = sb2 + "Nathan";
		System.out.println(sb2.length());
		
		StringBuilder sb3 = new StringBuilder("GopiGopi            ");
		System.out.println(sb3.length());
	}
	
	
}