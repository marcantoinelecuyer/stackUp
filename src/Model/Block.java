package Model;

import Util.*;
import View.*;

import java.awt.*;

public class Block implements Displayable {

	private boolean isMoving;
	private Image img;
	private float height;
	private float width;
	private Position position;

	/**
	 * 
	 * @param w
	 * @param h
	 * @param p
	 */
	public Block(float w, float h, Position p) {
		// TODO - implement Block.Block
		throw new UnsupportedOperationException();
	}

	public float getWidth() {
		return this.width;
	}

	/**
	 * 
	 * @param width
	 */
	public void setWidth(float width) {
		this.width = width;
	}

	public boolean animate() {
		// TODO - implement Block.animate
		throw new UnsupportedOperationException();
	}

	public Position freeze() {
		// TODO - implement Block.animate
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param v
	 */
	public void display(View v) {
		// TODO - implement Block.animate
		throw new UnsupportedOperationException();
	}

}