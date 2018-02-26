// Program to find the sum of natural numbers from 1 to 1000.

class SummingUpNumbers {
   public static void main(String[] args) {
      
      int sum = 0;
	   
      for (int i = 1; i <= 100; ++i) {
         sum += i;     // sum = sum + i
	System.out.println(i+ " 	" +sum);
      }
	   
      System.out.println("Sum = " + sum);
   }
}