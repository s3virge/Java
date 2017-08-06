package JavaFX;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by s3virge on 18.06.17.
 */
public class ComboBoxDemo extends Application {

    ComboBox<String> comboBox;

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage window) throws Exception {
        window.setTitle("ComboBoxDemo");

        VBox layout = new VBox();
        layout.setPadding(new Insets(10));
        layout.setSpacing(10);

        Button btnSubmit = new Button("Submit");
        btnSubmit.setMinWidth(150);
        btnSubmit.setOnAction(event -> printChoice());

        comboBox = new ComboBox<>();
        comboBox.setMinWidth(150);
        comboBox.setValue("Value");
        comboBox.getItems().addAll("First", "Second", "Third", "Fours");

        comboBox.setPromptText("SQLite.Select item");
        comboBox.setEditable(true);
        comboBox.setOnAction(event -> System.out.println("User selected: " + comboBox.getValue()));

        layout.getChildren().addAll(comboBox, btnSubmit);
        Scene scene = new Scene(layout, 300, 200);
        window.setScene(scene);
        window.show();
    }

    private void printChoice(){
        System.out.println(comboBox.getValue());
    }
}
