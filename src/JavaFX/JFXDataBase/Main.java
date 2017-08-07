package JavaFX.JFXDataBase;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    private Stage window;
    private BorderPane rootLayout;

    @Override
    public void start(Stage primaryStage) throws Exception{

        window = primaryStage;
        window.setTitle("Address");
        window.setResizable(false);

        initRootLayout();
        showPersonOverview();
    }

    public static void main(String[] args) {
        launch(args);
    }

    private void initRootLayout(){
        try {
            rootLayout = FXMLLoader.load(getClass().getResource("RootLayout.fxml"));
            window.setScene(new Scene(rootLayout));
            window.show();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void showPersonOverview(){
        try{
            FXMLLoader fxmlLayout = new FXMLLoader();
            fxmlLayout.setLocation(getClass().getResource("PersonOverview.fxml"));
            AnchorPane personOverview = fxmlLayout.load();
            rootLayout.setCenter(personOverview);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public Stage getWindow() {
        return window;
    }
}
