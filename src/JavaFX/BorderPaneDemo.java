package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by s3virge on 07.06.17.
 */
public class BorderPaneDemo extends Application {

    private Stage window;

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Window title");
        window.setMinWidth(350);
        window.setMinHeight(250);

        HBox topMenu = new HBox();

        Button btn1 = new Button("File");
        Button btn2 = new Button("Edit");
        Button btn3 = new Button("View");

        topMenu.getChildren().addAll(btn1, btn2, btn3);

        VBox leftMenu = new VBox();

        Button btnLeft1 = new Button("File");
        Button btnLeft2 = new Button("Edit");
        Button btnLeft3 = new Button("View");

        leftMenu.getChildren().addAll(btnLeft1, btnLeft2, btnLeft3);

        BorderPane borderPane = new BorderPane();

        borderPane.setTop(topMenu);
        borderPane.setLeft(leftMenu);

        Scene scene = new Scene(borderPane);

        window.setScene(scene);
        window.show();
    }
}

