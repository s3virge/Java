package JavaFX.ClientList.Model;

/**
 * Created by S3ViRGE on 07.08.2017.
 */

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Model class for a Person.
 *
 * @author Marco Jakob
 */
public class Person {

    private final StringProperty propFirstName;
    private final StringProperty propLastName;
    private final StringProperty propPhoneNumber;
    //private final IntegerProperty postalCode;
    private final StringProperty propAdress;
    private final StringProperty propNote;

    /**
     * Default constructor.
     */
    public Person() {
        this(null, null);
    }

    /**
     * Constructor with some initial data.
     *
     * @param propFirstName
     * @param propLastName
     */
    public Person(String propFirstName, String propLastName) {
        this.propFirstName = new SimpleStringProperty(propFirstName);
        this.propLastName = new SimpleStringProperty(propLastName);

        // Some initial dummy data, just for convenient testing.
        this.propPhoneNumber = new SimpleStringProperty("315-10-20");
        //this.propAdress = new SimpleIntegerProperty(1234);
        this.propAdress = new SimpleStringProperty("Москальский проспект");
        this.propNote = new SimpleStringProperty("some Note");
    }

    public String getPropFirstName() {
        return propFirstName.get();
    }

    public void setPropFirstName(String propFirstName) {
        this.propFirstName.set(propFirstName);
    }

    public StringProperty propFirstNameProperty() {
        return propFirstName;
    }

    public String getPropLastName() {
        return propLastName.get();
    }

    public void setPropLastName(String propLastName) {
        this.propLastName.set(propLastName);
    }

    public StringProperty propLastNameProperty() {
        return propLastName;
    }

    public String getPropPhoneNumber() {
        return propPhoneNumber.get();
    }

    public void setPropPhoneNumber(String propPhoneNumber) {
        this.propPhoneNumber.set(propPhoneNumber);
    }

    public StringProperty propPhoneNumberProperty() {
        return propPhoneNumber;
    }

    public String getPropAdress() {
        return propAdress.get();
    }

    public void setPropAdress(String propAdress) {
        this.propAdress.set(propAdress);
    }

    public StringProperty propAdressProperty() {
        return propAdress;
    }

    public String getPropNote() {
        return propNote.get();
    }

    public void setPropNote(String propNote) {
        this.propNote.set(propNote);
    }

    public StringProperty propNoteProperty() {
        return propNote;
    }
}
