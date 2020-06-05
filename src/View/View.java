package View;

import javafx.scene.Scene;
import javafx.scene.SnapshotParameters;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class View {
	private static float WIDTH = 300;
	private static float HEIGHT = 500;

	Stage stage;
	StackPane root;

	public void init(Stage primaryStage) {
		this.stage = primaryStage;
		primaryStage.setTitle("Stack Up");

		this.root = new StackPane();

		primaryStage.setScene(new Scene(root, WIDTH, HEIGHT));
		primaryStage.show();
	}
	public Scene getScene(){
		return this.stage.getScene();
	}
	public void draw(float x, float y, Image img){
		ImageView v = new ImageView();
		v.setTranslateX(x);
		v.setTranslateY(y-HEIGHT/2);
		v.setImage(img);
		this.root.getChildren().add(v);
	}

	public static float getWIDTH(){
		return WIDTH;
	}
	public static float getHEIGHT(){
		return HEIGHT;
	}
}