package JavaFX;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by s3virge on 19.06.17.
 */
public class TreeViewDemo  extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    TreeView<String> tree;

    @Override
    public void start(Stage window) throws Exception {
        window.setTitle("TreeViewDemo");

        TreeItem<String> root, first, second;

        //create a root item
        root = new TreeItem<>("rootItem");
//        root.setExpanded(true);

        //first branch
        first = makeBranch("JavaFX", root);
        makeBranch("Java", first);
        makeBranch("GUI", first);
        makeBranch("Tutorial", first);

        //second branch
        second = makeBranch("TreeView", root);
        makeBranch("one", second);
        makeBranch("two", second);
        makeBranch("three", second);
        makeBranch("four", second);

        //Create TreeView
        tree = new TreeView<>(root);
//        tree.setShowRoot(false);

        Button btnOk = new Button("OK");
        btnOk.setMinWidth(150);
        btnOk.setOnAction(event -> window.close());

        //layout
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(10));
        layout.setAlignment(Pos.CENTER);
        layout.getChildren().add(tree);
        layout.getChildren().add(btnOk);
        Scene scene = new Scene(layout, 300, 400);
        window.setScene(scene);
        window.show();
    }

    private TreeItem<String> makeBranch(String title, TreeItem<String> parent){
        TreeItem<String> item = new TreeItem<>(title);
        item.setExpanded(true);
        parent.getChildren().add(item);
        return item;
    }
}
