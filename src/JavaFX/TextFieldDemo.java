package JavaFX;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by s3virge on 11.06.17.
 */
public class TextFieldDemo extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Stage window = primaryStage;

        javafx.scene.control.TextField tfInput = new javafx.scene.control.TextField();

        Button btnClose = new Button("Close");
        btnClose.setOnAction(event -> window.close());

        Button btnClick = new Button("Click me");
//        btnClick.setOnAction(event -> System.out.println(tfInput.getText()))
        btnClick.setOnAction(event -> isInt(tfInput, tfInput.getText()));

        VBox layout = new VBox();
        //set spaces betwen objects
        //VBox layout = new VBox(10);
        layout.setSpacing(10);
        //layout.setAlignment(Pos.BOTTOM_CENTER);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.setMinSize(400,200);
        layout.getChildren().addAll(tfInput, btnClick, btnClose);

        Scene scene = new Scene(layout);

        window.setScene(scene);
        window.show();
    }

    private boolean isInt(javafx.scene.control.TextField input, String message){
        try{
            int age = Integer.parseInt(message); //NumberFormatException - if the string does not contain a parsable integer.
            System.out.println("User is: " + age + "years old");
            return true;
        }
        catch (NumberFormatException ex){
            System.out.println("Error " + message + " is not a number");
            //change input border color to red
            return false;
        }
    }
}
