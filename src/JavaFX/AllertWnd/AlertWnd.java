package JavaFX.AllertWnd;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * Created by s3virge on 07.06.17.
 */
public class AlertWnd {
    static void display(String title, String message){
        //create a new window
        Stage window = new Stage();

        //customize our window
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(250);
        window.setMinHeight(150);

        Label label = new Label();
        label.setText(message);

        Button btnClose = new Button("Close");
        btnClose.setOnAction(event -> window.close());

        VBox layout = new VBox(20);
        layout.getChildren().addAll(label, btnClose);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout);

        window.setScene(scene);
        window.showAndWait();
    }
}