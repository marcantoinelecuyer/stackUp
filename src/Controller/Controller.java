package Controller;
import View.*;
import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import java.awt.event.KeyListener;

public class Controller {

	private View v;
	private int attribute;

	/**
	 * 
	 * @param v the view
	 */
	public Controller(View v) {
		this.v = v;
		v.getScene().setOnKeyPressed(event -> {
			if (event.getCode() == KeyCode.SPACE) {
				stopBlocks();
			}
		});
	}

	public void play() {
		// TODO - implement Controller.play
		throw new UnsupportedOperationException();
	}

	public void stopBlocks(){
		System.out.println("ok");
	}


}