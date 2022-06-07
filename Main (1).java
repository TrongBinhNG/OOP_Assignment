package Test;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle car1 = new Vehicle();
		car1.x=0;
		car1.y=0;
		car1.turnLeft(0);
		car1.anglecontrol();
		//car1.forwardstatic(7,25,1000);//1000 = 1s
		car1.acceleration=2;
		car1.deceleration=2;
		car1.forward(20);
	}

}
