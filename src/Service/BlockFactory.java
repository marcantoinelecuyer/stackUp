package Service;

import Model.*;
import Util.Position;
import View.View;

public class BlockFactory {

	private static BlockFactory factory;
	private float productivity;
	private float currentWidth;
	private float height;

	private BlockFactory() {
		this.height = 10;

		this.productivity = 0;
		this.currentWidth = 10;
	}

	public static BlockFactory getInstance() {
		if(factory == null)
			factory = new BlockFactory();
		return factory;
	}

	public Block createBlock() {

		return new Block(currentWidth++, height, new Position((Math.random()<0.5 ? 1 : -1) * (View.getWIDTH()/2 + currentWidth/2),0));
	}

	public float getProductivity() {
		return this.productivity;
	}

	/**
	 * 
	 * @param speed
	 */
	public void setProductivity(float speed) {
		this.productivity = speed;
	}

}