package RahulShetty;

public class MoterBike {
	  private int speed;
	
	
	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		if(speed>0)
		this.speed = speed;
		
		//System.out.println(speed);
		System.out.println(this.speed);
	}
public void incresespeed(int howmuch) {
setSpeed(this.speed=this.speed+howmuch);
}
public void decresespeed(int howmuch) {
setSpeed (this.speed=this.speed-howmuch);
}

	void start() {
		System.out.println ("one kic start");
	}

}
