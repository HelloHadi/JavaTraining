
/*Suppose we are asked to develop communication software such as an FTP (File Transfer Protocol) or Telnet program that uses a modem. Our program must work with a variety of different modems. Although all the modems provide the same functionality, their implementations are quite different.

Obviously, it would be inadvisable to create multiple versions of our application to interface with each of the modems available on the market because the code maintenance and application upgrades would be too much work. For this reason, we would develop an interface that specifies the method signatures our application uses for interfacing with the modem. This would provide a uniform programming interface to all the modems. This way, the application that uses a modem would not break even if the implementations in the methods of the modem change in future.

Typically, we would have open, close, read, and write operations that our application would invoke on a modem. Our interface would declare these methods as follows:
*/
interface Modem {
  public boolean open();                               
  public boolean close();
  public int read ();
  public int write();

}
 

//We will provide different implementations for the methods declared in the Modem interface for each of the supported modems. To implement an interface, we use the following notation:

class MindStickModem implements Modem {
                     public boolean open() {

                           System.out.println("Started a MindStickModem");
			   return true;

                     }

                     public boolean close() {

                             // implementation

			   System.out.println("Started a MindStickModem");
			   return false;

                     }

                     public int read() {

                             // implementation
				
		           System.out.println("Reading a MindStickModem way");
			   return 100;

                     }

                     public int write() {

                             // implementation

			   System.out.println("Started a MindStickModem");
			   return 100;

                     }

}
 //The class MindStickModem declaration uses the implements keyword to implement the Modem interface. In the class definition, we need to provide an implementation for each method defined in the Modem interface.

//To support another modem, we would create another class (say, HuaweiModem). We would define this class as follows:


class HuaweiModem implements Modem {
                     public boolean open() {

                             // implementation

			   System.out.println("Started a HuaweiModem");
			   return true;

                     }

                     public boolean close() {

                             // implementation

		 	   System.out.println("Started a HuaweiModem");
			   return false;

                     }

                     public int read() {

                             // implementation

			   System.out.println("Started a HuaweiModem");
			   return 500;

                     }

                     public int write() {

                             // implementation

			   System.out.println("Started a HuaweiModem");
			   return 500;

                     }


}
 //The method implementations in this class would be different from the implementations provided in MindStickModem class. Each implementation would be specific to the modem manufacturer. Once we create such classes specific to each modem manufacturer, we can develop our application software that interfaces easily with each of these modems. To use the MindStickModem class, we would use code similar to the following:
//This method main
 class Mo{
	public static void main(String [] args){
Modem modem = new MindStickModem();
modem.open();
modem.write();
modem.read();

modem.close();
 

//Note that we instantiate the MindStickModem class and assign the object reference to a variable of type Modem. Remember from earlier posts that an object reference can be assigned to its superclass without explicit typecasting. The Modem interface is a super-interface here. The MindStickModem class implements Modem and therefore the assignment of an object reference from type MindStickModem to the Modem interface is permitted.

//Now, to interface our application with Huawei modem, we would use the following code:

Modem modem1 = new HuaweiModem();
modem1.open();
modem1.write();
modem1.read();
modem1.close();
 
}
}
//The only difference between the earlier code and this code is in the class instantiation. In the earlier case we use MindStickModem and in the latter case we use HuaweiModem. The rest of the code remains the same. This is the greatest advantage of creating interfaces—we don’t need to change much of the code even when we change modems. This makes it easier to write an application that works with a lot of different modems. Here, we can see that our initial concern for how to provide a different implementation for each modem and yet maintaining a single interface to access them is easily resolved using an interface.