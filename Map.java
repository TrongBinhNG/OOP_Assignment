package Test;

public class Map {
	static Vehicle[] CarList = new Vehicle[10];
	private int i = 0;
	void addVehicle(Vehicle vehicle) {
		CarList[i] = vehicle;
		i++;
	}
	//a,b is car index in array
	void Update(int a,int b) {
		CarList[a].forwardstatic(7, 30, 100);
		CarList[a].turnLeft(90);
		CarList[b].turnRight(24.5);
		CarList[b].forwardstatic(7, 20, 100);
	}

}
