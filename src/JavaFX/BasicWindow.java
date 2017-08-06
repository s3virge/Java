package JavaFX;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Created by s3virge on 05.06.17.
 */
public class BasicWindow extends Application {

    public static void main(String[] args) {
        System.out.println("First JavaFX GUI");
        launch(args);
    }

    @Override
    /*
        Stage
        A stage (a window) contains all the objects of a JavaFX application.
        Scene
        A scene represents the physical contents of a JavaFX application.
    */
    public void start(Stage primaryStage) throws Exception {

        Button button = new Button();
        button.setText("Click me");

        Button button1 = new Button("Second button");
        Button button2 = new Button("Third button");

        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Button was clicked");
            }
        });

        button1.setOnAction(event -> System.out.println("A Second button was pressed"));

        button2.setOnAction(event -> {
            System.out.println("The third button was pressed");
            System.out.println("The next string in lambda expression");
        });

        Line line = new Line();

        //Setting the properties to a line
        line.setStartX(0);
        line.setStartY(0);

        line.setEndX(300);
        line.setEndY(200);

        //create a text object
        Text text = new Text("JFX text");
        text.setFont(new Font(24.0));
        text.setX(50);
        text.setY(150);

        //stackPane размещает все елементы по центу окна. Игнорирует указанные координаты елемента
        // StackPane layout = new StackPane();
        //Group для размещения елементов использует их координаты
//        Group layout = new Group();
        AnchorPane layout = new AnchorPane();
        AnchorPane.setTopAnchor(button, 20.0);
        AnchorPane.setLeftAnchor(button, 20.0);
        AnchorPane.setTopAnchor(button1, 50.0);
        AnchorPane.setLeftAnchor(button1, 20.0);
        AnchorPane.setTopAnchor(button2, 80.0);
        AnchorPane.setLeftAnchor(button2, 20.0);

        //Retrieving the observable list object
        ObservableList list = layout.getChildren();

        list.add(line);
        list.add(button);
        list.add(button1);
        list.add(button2);
        list.add(text);

        //Scene scene = new Scene(layout, 300, 200);
        Scene scene = new Scene(layout);

        //setting color to the scene
        scene.setFill(Color.DARKGREEN);

        primaryStage.setTitle("JFX Basic Window");
        //Adding the scene to Stage
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
