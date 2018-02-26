class W{
	
	public static void main(String [] args){
		
		int intArray[];
		intArray = new int[40];
		
		for (int i = 0; i < intArray.length; i++){
			intArray[i] = i + 5;
			System.out.println(intArray[i]);
		}
		
		System.out.println(intArray[23]);
	}
}