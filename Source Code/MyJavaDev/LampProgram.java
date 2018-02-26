/*class Lamp{

	boolean isOn;

	void turnOn(){
		isOn = true;
	//return true;
	}

	void turnOff(){
		isOn = false;
	//return false;
	}

	void displayLightStatus(){
		System.out.println("Light on?\n" + isOn);
	}
	
}
*/
public class LampProgram{

	boolean isOn;

	void turnOn(){
		isOn = true;
	//return true;
	}

	void turnOff(){
		isOn = false;
	//return false;
	}

	void displayLightStatus(){
		System.out.println("Light on?\n" + isOn);
	}

	public static void main(String[] args){
		LampProgram l1 = new LampProgram();		//create l1 object of Lamp class
		LampProgram l2 = new LampProgram();		//create l2 object of Lamp class

		l1.turnOn();
		l2.turnOff();

		l1.displayLightStatus();
		l2.displayLightStatus();

	}
}