package JavaFX.JFXDataBase;

import JavaFX.JFXDataBase.Model.Person;
import JavaFX.JFXDataBase.View.PersonOverviewController;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApp extends Application {

    private Stage window;
    private BorderPane rootLayout;

    /**
     * The data as an observable list of Persons.
     */
    private ObservableList<Person> personData = FXCollections.observableArrayList();

    /**
     * Constructor
     */
    public MainApp() {
        // Add some sample data
        personData.add(new Person("Hans", "Muster"));
        personData.add(new Person("Ruth", "Mueller"));
        personData.add(new Person("Heinz", "Kurz"));
        personData.add(new Person("Cornelia", "Meier"));
        personData.add(new Person("Werner", "Meyer"));
        personData.add(new Person("Lydia", "Kunz"));
        personData.add(new Person("Anna", "Best"));
        personData.add(new Person("Stefan", "Meier"));
        personData.add(new Person("Martin", "Mueller"));
    }

    /**
     * Returns the data as an observable list of Persons.
     * @return
     */
    public ObservableList<Person> getPersonData() {
        return personData;
    }

    // ... THE REST OF THE CLASS ...

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
            fxmlLayout.setLocation(getClass().getResource("View/PersonOverview.fxml"));
            AnchorPane personOverview = fxmlLayout.load();
            rootLayout.setCenter(personOverview);

            // Give the controller access to the main app.
            PersonOverviewController controller = fxmlLayout.getController();
            controller.setMainApp(this);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public Stage getWindow() {
        return window;
    }

    /**
     * Returns the main stage.
     * @return
     */
    public Stage getPrimaryStage() {
        return window;
    }
}
