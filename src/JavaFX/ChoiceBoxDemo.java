package JavaFX;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * Created by s3virge on 13.06.17.
 */
public class ChoiceBoxDemo extends Application {
    public static void main(String[] args) {
        launch();
    }

    //Label label2;

    @Override
    public void start(Stage window) throws Exception {
        window.setTitle("ChoiceBox Demo");
//        window.setMinWidth(300);
//        window.setMinHeight(200);

        Label label1 = new Label("Label");
        Label label2 = new Label("Label2");
        Label label3 = new Label("Label3");

        ChoiceBox<String> chBox = new ChoiceBox<>();
        chBox.setValue("Ситро");
        chBox.setTooltip(new Tooltip("SQLite.Select the language"));
        chBox.getItems().add("Яблоко");
        chBox.getItems().add("Ситро");
        chBox.getItems().add("Апельсин");
        chBox.getItems().addAll("Помидор", "Банан", "Огурец");

        //1 получаем модель выделения
        //2 получаем свойство выделенного елемента, не индекса, а елемента
        //3 добавляем ему слушателя
        /*chBox.getSelectionModel().selectedItemProperty().addListener( (observable, oldValue, newValue) -> {
            label1.setText(oldValue);
            label2.setText(newValue);
        });*/

        chBox.setOnAction(event -> label2.setText(chBox.getValue()));

        chBox.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                label3.setText("qwerty");
            }
        });


        chBox.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                label1.setText(oldValue);
                label2.setText(newValue);
            }
        });

        Button btnClick = new Button("Click me");
        btnClick.setOnAction(event -> getChoice(chBox, label1));

        GridPane layout = new GridPane();
//        layout.setSpacing(10);
        layout.setPadding(new Insets(20));
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setMinWidth(400);
        layout.add(chBox, 0, 0);
        layout.add(label1, 1, 0);
        layout.add(label2, 3, 0);
        layout.add(label3, 4, 0);
        layout.add(btnClick, 0, 1);
//        layout.getChildren().addAll(chBox, btnClick, label);

        //на сцене размещаем елементы
        Scene scene = new Scene(layout);

        window.setScene(scene);
        window.show();
    }

    private void getChoice(ChoiceBox<String> choiceBox, Label la) {
        String choice = choiceBox.getValue();

        System.out.println(choice);
        la.setText(choice);
    }
}
