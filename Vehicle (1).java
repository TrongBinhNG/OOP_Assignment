package Test;
import java.lang.Math;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
public class Vehicle {
	float x,y;
	private int angle;
	double acceleration;
	double deceleration;
	//private int turnSpeed;
	void display() {
		//System.out.printf("Current angle:%d ",angle);
		System.out.printf("x:%f",x);
		System.out.printf("  y:%f",y);
	} 
	public void ahead(double velocity){
	        this.x += velocity* Math.cos(Math.toRadians(angle));
	        this.y += velocity* Math.sin(Math.toRadians(angle));
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
	//static speed //print with any time interval
	public void forwardstatic(double acce,double distance,long speed) {
		double a = acce*speed/1000;
		TimerTask task = new TimerTask() {
			double dcounter = 0;
			double tcounter = 0;

		    public void run() {
		        dcounter += a;
		        if(dcounter >= distance) {
		        	dcounter = dcounter - a; 
		        	ahead(distance - dcounter);
		        	tcounter +=(distance - dcounter)/acce;
		        	System.out.printf("\nCurrent Spot after %fs  ",tcounter);
		        	display();
		        	cancel();
		        }else {
		        	tcounter = tcounter + (double)speed/1000;
		        	System.out.printf("\nCurrent Spot after %fs  ",tcounter);
				    ahead(a);
				    display();
		        }
		    }
		};

		Timer timer = new Timer();
		timer.schedule(task, new Date(), speed);
	}
	public void brake(double Maxvelocity, double time) {
		TimerTask task = new TimerTask() {
			double velocity = Maxvelocity;
			double tcounter = time;
			
			public void run() {
		
				if(velocity > 0 ) {
				velocity -= deceleration; 
				ahead(velocity);
				tcounter++;
				System.out.printf("\nCurrent Spot after %fs  ",tcounter);
				display();
				System.out.printf("  v:%f", velocity);
				}else {
					velocity = 0;
					cancel();
					System.out.printf("\nStopped! ");
					display();
				}
				
			}
			
		};
		Timer timer = new Timer();
		timer.schedule(task, new Date(), 100);
		
	}
	//Move forward with acceleration //print with 1sec interval
	public void forward(double Maxvelocity) {
		TimerTask task = new TimerTask() {
			double velocity = 0;
			double tcounter = 0;

			public void run() {
		
				if(velocity < Maxvelocity ) {
				velocity += acceleration; 
				ahead(velocity);
				tcounter++;
				System.out.printf("\nCurrent Spot after %fs  ",tcounter);
				display();
				System.out.printf("  v:%f", velocity);
				}else {
					velocity = Maxvelocity;
					ahead(velocity);
					tcounter++;
					System.out.printf("\nCurrent Spot after %fs  ",tcounter);
					display();
					System.out.printf("  v:%f", velocity);
					if(tcounter == 20) {
						brake(Maxvelocity,tcounter);
						cancel();
					}
				}
				
			}
			
		};
		Timer timer = new Timer();
		timer.schedule(task, new Date(), 100);
		
	}
	

}
