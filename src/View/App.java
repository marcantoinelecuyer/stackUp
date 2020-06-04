package View;

import Controller.Controller;
import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        View view = new View();
        view.init(stage);
        Controller controller = new Controller(view);
    }
}
