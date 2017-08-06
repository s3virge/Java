package JavaFX.CloseWindow;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
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

        //i want to close program
        window.setOnCloseRequest(event -> {
            // consume - поглощать
            // если не поглощать сообщение, то при нажатии на крестик окно
            //всеравно закрывается несмотря на выбор кнопки No
            event.consume();

            CloseProgram();
        });

        Button button = new Button("Click me");

        button.setOnAction(e -> {
            boolean result = ConfirmBox.display("Alert Window title", "Are you sure you want to sand naked pics?");
            System.out.println(result);
        });

        Button bntClose = new Button("Exit");

        bntClose.setOnAction(e -> CloseProgram());

        //stackpane располагает элементы в стопку
//        StackPane layout = new StackPane();
        VBox layout = new VBox();
        layout.setAlignment(Pos.CENTER);
        layout.setSpacing(20);

        //Gets the list of children of this Parent.
        layout.getChildren().add(button);
        layout.getChildren().add(bntClose);

        Scene scene = new Scene(layout, 300, 200);

        window.setScene(scene);
        window.show();
    }

    private void CloseProgram() {
        boolean answer = ConfirmBox.display("Window title", "Are you sure you want to exit?");
        System.out.println(answer);

        if (answer) {
            window.close();
        }
    }
}

