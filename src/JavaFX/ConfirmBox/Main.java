package JavaFX.ConfirmBox;

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

        button.setOnAction(e -> {
            boolean result = ConfirmBox.display("Alert Window title", "Are you sure you want to sand naked pics?");
            System.out.println(result);
        });

        StackPane layout = new StackPane();

        //Gets the list of children of this Parent.
        layout.getChildren().add(button);

        Scene scene = new Scene(layout, 300, 200);

        window.setScene(scene);
        window.show();
    }
}

