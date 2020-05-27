package Service;

import Model.*;

public abstract class BlockFactory {

	private BlockFactory factory;
	private float productivity;
	private float currentWidth;

	private BlockFactory() {
		// TODO - implement BlockFactory.BlockFactory
		throw new UnsupportedOperationException();
	}

	public abstract BlockFactory getInstance();

	public Block createBlock() {

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