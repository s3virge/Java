package JavaFX;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by s3virge on 18.06.17.
 */
public class ListViewDemo extends Application {

    ListView<String> listView;
    CheckBox checkBox;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage window) throws Exception {
        window.setTitle("ComboBoxDemo");

        VBox layout = new VBox();
        layout.setPadding(new Insets(10));
        layout.setSpacing(10);

        Button btnSubmit = new Button("Submit");
        btnSubmit.setMinWidth(150);
        btnSubmit.setOnAction(event -> printSelectedItems());

        listView = new ListView<>();
        listView.getItems().addAll("Corn", "Napalm Death", "Megadeath", "Chimaira", "Metallica", "Pink Floyd");

        checkBox = new CheckBox("Multiple Selection mode");
        checkBox.setOnAction(event -> onChange());

        layout.getChildren().addAll(listView, checkBox, btnSubmit);
        Scene scene = new Scene(layout, 300, 200);
        window.setScene(scene);
        window.show();
    }

    private void onChange(){
        boolean bMultiSelection = checkBox.isSelected();

        if (bMultiSelection){
            listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        }
        else {
            listView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        }
    }

    private void printSelectedItems(){
        String message = "";

        SelectionMode selectionMode = listView.getSelectionModel().getSelectionMode();

        if (selectionMode == SelectionMode.SINGLE) {
            message = listView.getSelectionModel().getSelectedItem() + "\n ";
        }
        else {
            ObservableList<String> listItems;
            listItems = listView.getSelectionModel().getSelectedItems();

            for (String m : listItems){
                message += m + "\n";
            }
        }

        System.out.println(message);
    }
}
