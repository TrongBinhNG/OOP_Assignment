package vehicle;

public class vehicle {
	int X;
	int Y;
	double velocity;
	double angle;
	double turnSpeed;
	void setData(int X,int Y,double velocity,double angle,double turnSpeed) {
		this.X = X;
		this.Y = Y;
		this.velocity = velocity;
		this.angle = angle;
		this.turnSpeed = turnSpeed;
	}
	void aHead(double velocity) {
		 this.X += velocity* Math.cos(Math.toRadians(angle));
	     this.Y += velocity* Math.sin(Math.toRadians(angle));
	}
	public void anglecontrol() {
		if(this.angle < 0) {
			this.angle = 360 + this.angle;
		}
		if(this.angle > 360) {
			this.angle = 360 - this.angle; 
		}
	}
	void turnLeft(int angle) {
		this.angle = this.angle + angle;
	}
	void turnRight(int angle) {
		this.angle = this.angle - angle;
	}
	void Display(){
		System.out.println("The vehicle is at ["+X+"][" +Y+"]");
	}
}
