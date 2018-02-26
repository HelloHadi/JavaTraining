class ClassObjectsExample{

	public static void main(String[] args){
		Lamp l1 = new Lamp();		//create l1 object of Lamp class
		Lamp l2 = new Lamp();		//create l2 object of Lamp class

		l1.turnOn();
		l2.turnOff();

		l1.displayLightStatus();
		l2.displayLightStatus();

	}
}

//This program creates two objects l1 and l2 of class Lamp

//static belongs to class,no one create the objects,