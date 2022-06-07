package vehicle;

public class main {
	public static void main (String args[]) {
		vehicle car1 = new vehicle();
		car1.setData(5, 10, 10.5, 20, 20);
		car1.turnLeft(215);
		car1.anglecontrol();
		car1.aHead(2);
		car1.Display();
	}

}
