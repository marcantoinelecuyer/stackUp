package View;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class View {
	Stage stage;
	public void init(Stage primaryStage) {
		this.stage = primaryStage;
		primaryStage.setTitle("Hello World!");



		StackPane root = new StackPane();
		primaryStage.setScene(new Scene(root, 300, 500));
		primaryStage.show();
	}
	public Scene getScene(){
		return this.stage.getScene();
	}
}