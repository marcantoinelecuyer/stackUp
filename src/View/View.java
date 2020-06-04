package View;

import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class View {
	Stage stage;
	StackPane root;
	public void init(Stage primaryStage) {
		this.stage = primaryStage;
		primaryStage.setTitle("Stack Up");

		this.root = new StackPane();
		primaryStage.setScene(new Scene(root, 300, 500));
		primaryStage.show();
	}
	public Scene getScene(){
		return this.stage.getScene();
	}
	public void draw(float x, float y, Image img){
		ImageView v = new ImageView();
		v.setX(x);
		v.setY(y);
		v.setImage(img);
		this.root.getChildren().add(v);
	}
}