package JavaFX.AllertWnd;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Created by s3virge on 07.06.17.
 */
public class Main extends Application {

    private Stage window;

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Window title");

        Button button = new Button("Click me");
        button.setOnAction(e -> AlertWnd.display("Alert Window title", "Alert window message"));

        StackPane layout = new StackPane();

        //Gets the list of children of this Parent.
        layout.getChildren().add(button);

        Scene scene = new Scene(layout, 300, 200);

        window.setScene(scene);
        window.show();
    }
}

