package JavaFX;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * Created by s3virge on 10.06.17.
 */
public class GridPainDemo extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Stage window = primaryStage;
        window.setTitle("Title - Grid Pane");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20, 20, 20, 20));
        grid.setVgap(8);
        grid.setHgap(10);

        Label labelUsername = new Label("Username");
        GridPane.setConstraints(labelUsername, 0, 0);

        //Name input
        TextField inputName = new TextField("S3ViRGE");
        GridPane.setConstraints(inputName, 1, 0);

        //Password Label
        Label labelPassword = new Label("Password");
        GridPane.setConstraints(labelPassword, 0, 1);

        TextField inputPassword = new TextField();
        inputPassword.setPromptText("password");
        GridPane.setConstraints(inputPassword, 1, 1);

        Button btnLogin = new Button("Login");
        GridPane.setConstraints(btnLogin, 1, 2);

        Button btnExit = new Button("Exit");
        GridPane.setConstraints(btnExit, 3, 6);
        btnExit.setOnAction(event -> window.close());

        grid.getChildren().addAll(labelUsername, inputName, labelPassword, inputPassword, btnLogin, btnExit);

        Scene layout = new Scene(grid, 400, 200);

        window.setScene(layout);
        window.show();
    }
}
