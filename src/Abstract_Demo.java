
public class Abstract_Demo {

	public static void main(String[] args) {
		Scooty Activa = new Scooty();
		Activa.noofwheels();
	}

}

abstract class Vehicle    //Partially implemented class
{
	abstract public void noofwheels();
}

class Scooty extends Vehicle
{

	@Override
	public void noofwheels() {
		System.out.println("No of wheels in scooty = " + 2);	
	}
	
}