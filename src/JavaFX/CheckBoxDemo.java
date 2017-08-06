package JavaFX;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by S3ViRGE on 13.06.2017.
 */
public class CheckBoxDemo extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Stage window = primaryStage;

        VBox layout = new VBox();
        layout.setPadding(new Insets(10, 10, 10, 10));
        layout.setSpacing(10);

        CheckBox checkBox1 = new CheckBox("first check");
        CheckBox checkBox2 = new CheckBox("second check");

        Button button = new Button("Click me");
        button.setCursor(Cursor.HAND);
        button.setOnAction(event -> eventHendler(checkBox1, checkBox2));

        //Gets the list of children of this Parent.
        ObservableList observableList = layout.getChildren();
        observableList.addAll(checkBox1, checkBox2, button);

        Scene scene = new Scene(layout, 300, 200);
        window.setScene(scene);
        window.show();
    }

    private void eventHendler(CheckBox ch1, CheckBox ch2){
        String messege = "No one check box is selected";

        if(ch1.isSelected()){
            messege = "First check box is selected. ";
        }

        if(ch2.isSelected()){
            messege = "Second check box is selected. ";
        }

        System.out.println(messege);
    }
}
