package Controller;
import Service.BlockFactory;
import View.*;
import javafx.scene.input.KeyCode;

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
		BlockFactory.getInstance();
	}

	public void play() {
		// TODO - implement Controller.play
		throw new UnsupportedOperationException();
	}

	public void stopBlocks(){
		System.out.println("ok");
	}


}