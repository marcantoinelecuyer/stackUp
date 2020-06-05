package Model;

import Util.*;
import View.*;
import javafx.scene.SnapshotParameters;
import javafx.scene.shape.Rectangle;

import java.awt.*;

public class Block implements Displayable {

	private boolean isMoving;
	private Image img;
	private float height;
	private float width;
	private Position position;
	private boolean isFromRight;

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
		javafx.scene.shape.Rectangle rect = new Rectangle(
				width,
				height,
				javafx.scene.paint.Color.BLUE);

		v.draw(position.getX(),position.getY(),rect.snapshot(new SnapshotParameters(), null));
	}

}