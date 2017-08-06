package JavaFX.CloseWindow;

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
public class ConfirmBox {

    static boolean answer;

    static boolean display(String title, String message){
        //create a new window
        Stage window = new Stage();

        //customize our window
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(350);

        Label label = new Label();
        label.setText(message);

        //create two buttons
        Button btnYes = new Button("Yes");
        Button btnNo = new Button("No");

        //buttons functionality
        btnYes.setOnAction(event -> {
           answer = true;
           window.close();
        });

        btnNo.setOnAction(event -> {
            answer = false;
            window.close();
        });

        VBox layout = new VBox(10);
        layout.getChildren().addAll(label, btnYes, btnNo);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout);

        window.setScene(scene);
        window.showAndWait();

        return answer;
    }
}