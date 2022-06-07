package Test;

public class Main {

	public static void main(String[] args) {
		//initialize starting position
		Vehicle car1 = new Vehicle(0,0,"lamboghini");
		Vehicle car2 = new Vehicle(0,0,"KIA");
		Vehicle car3 = new Vehicle(0,0,"TOYOTA");
		Map map = new Map();
		//
		//car1.forwardstatic(7,25,1000);//1000 = 1s//ahead() method with specify distance
		map.addVehicle(car1);
		map.addVehicle(car2);
		map.addVehicle(car3);
		//car1.acceleration=2;
		//car1.deceleration=2;
		//car1.forward(20);
		
		map.Update(0, 1);
	}

}
