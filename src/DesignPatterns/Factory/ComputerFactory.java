package DesignPatterns.Factory;

/**
 * Created by s3virge on 18.07.17.
 */
public class ComputerFactory {
    public Computer getType(String pcType){
        if (pcType == null) {
            return null;
        }
        else if (pcType.equalsIgnoreCase("Desktop")){
            return new Desktop();
        }
        else if (pcType.equalsIgnoreCase("Notebook")){
            return new Notebook();
        }
        else if (pcType.equalsIgnoreCase("Tablet")){
            return new Tablet();
        }
        else if (pcType.equalsIgnoreCase("Telephone")){
            return new Telephone();
        }

        return null;
    }
}
