
class BankEmployee {

	String name = "";
	static int bankVault = 0;

}


public class BankEmployeeTesting {

	public static void main(String x[]) {
	
	BankEmployee e1 = new BankEmployee();
	BankEmployee e2 = new BankEmployee();
        BankEmployee e3 = new BankEmployee();

	e1.bankVault = 100;
        System.out.println(e1.bankVault);
	
	e2.bankVault = 200;
        System.out.println(e2.bankVault);

	e3.bankVault = 300;
        System.out.println(e3.bankVault);

       
	e1.bankVault = 0;

        System.out.println(e1.bankVault);
        System.out.println(e2.bankVault);
        System.out.println(e3.bankVault);


        System.out.println(BankEmployee.bankVault);

	}

}