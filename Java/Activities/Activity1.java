package Activities;

public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car xl6= new Car();
		xl6.make = 2014;
		xl6.color = "Black";
		xl6.transmission = "Manual";
		
		xl6.accelarate();
		xl6.brake();
		xl6.displayCharacteristics();

	}

}
