package Model;

import View.*;

public class SpeedOMeter implements Displayable {

	private Image img;
	private float speed;

	public float getSpeed() {
		return this.speed;
	}

	/**
	 * 
	 * @param speed
	 */
	public void setSpeed(float speed) {
		this.speed = speed;
	}

	/**
	 * 
	 * @param v
	 */
	public void display(View v) {

	}

}