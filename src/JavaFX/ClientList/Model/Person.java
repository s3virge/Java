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

    private final StringProperty firstName;
    private final StringProperty lastName;
    private final StringProperty phoneNumber;
    //private final IntegerProperty postalCode;
    private final StringProperty address;
    private final StringProperty note;

    /**
     * Default constructor.
     */
    public Person() {
        this(null, null);
    }

    /**
     * Constructor with some initial data.
     *
     * @param strFirstName
     * @param strLastName
     */
    public Person(String strFirstName, String strLastName) {
        this.firstName = new SimpleStringProperty(strFirstName);
        this.lastName = new SimpleStringProperty(strLastName);

        // Some initial dummy data, just for convenient testing.
        this.phoneNumber = new SimpleStringProperty("315-10-20");
        //this.address = new SimpleIntegerProperty(1234);
        this.address = new SimpleStringProperty("Москальский проспект");
        this.note = new SimpleStringProperty("some Note");
    }

    public String getFirstName() {
        return firstName.get();
    }

    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }

    public StringProperty firstNameProperty() {
        return firstName;
    }

    public String getLastName() {
        return lastName.get();
    }

    public void setLastName(String lastName) {
        this.lastName.set(lastName);
    }

    public StringProperty lastNameProperty() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber.get();
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber.set(phoneNumber);
    }

    public StringProperty phoneNumberProperty() {
        return phoneNumber;
    }

    public String getAddress() {
        return address.get();
    }

    public void setAddress(String address) {
        this.address.set(address);
    }

    public StringProperty addressProperty() {
        return address;
    }

    public String getNote() {
        return note.get();
    }

    public void setNote(String note) {
        this.note.set(note);
    }

    public StringProperty noteProperty() {
        return note;
    }
}
