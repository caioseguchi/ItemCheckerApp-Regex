import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ItemChecker {
    //Declare Variable
    private static final String LICENSE_PLATE_PATTERN = "^[0-9]{3}-(CK|CE|CN|CW|DN|DL|GY|KE|KK|KY|LK|LD|LH|LM|LS|MH|MN|MO|OY|RN|SO|TY|WD|WH|WX|WW)-[0-9]{4,6}$";
    private static final String USERNAME_PATTERN = "^[@]{1}[a-zA-Z0-9_]{5,16}$";
    private int numberOfItems;


    //Declare Array of objects
    Item[] itemCode = new Item[10];

    //Option 1 Method to verify license plates
    public void verifyLicensePlates(){
        while (true){
            try {
                //Input - number of licenses
                numberOfItems = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the number of licenses to verify, max 10"));

                //Check if the array is full
                if (numberOfItems > itemCode.length){
                    JOptionPane.showMessageDialog(null, "You reach the max of license plates");
                    return;
                }

                JOptionPane.showMessageDialog(null, "License Plate: YYY-LL-SSSSSS"+
                        "\n YYY year code"+
                        "\n LL valid location code"+
                        "\n SSSSSS number code"+
                        "\n Example: 123-CK-123456");

                //Input - Enter License Plates
                for (int i = 0; i < numberOfItems; i++) {
                    String code = JOptionPane.showInputDialog(null, "Enter the license plate "+(i+1)).toUpperCase();


                    //Verify if it is valid
                    boolean isValid = isValidLicensePlate(code);

                    //Save to array
                    itemCode[i] = new Item(code, isValid);
                }//for
                //Display results
                displayResults();
                break;

            } catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Enter a number between 1 and 10");
            }//catch
        }//while
    }//verifyLicensePlates

    //Option 2 Method to verify username
    public void verifyUsername(){
        while (true){
            try {
                //Input - number of licenses
                numberOfItems = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the number of licenses to verify, max 10"));

                //Check if the array is full
                if (numberOfItems > itemCode.length){
                    JOptionPane.showMessageDialog(null, "You reach the max of license plates");
                    return;
                }


                //Input - Enter License Plates
                for (int i = 0; i < numberOfItems; i++) {
                    String code = JOptionPane.showInputDialog(null, "Enter the license plate "+(i+1));

                    //Verify if it is valid
                    boolean isValid = isValidUsername(code);

                    //Save to array
                    itemCode[i] = new Item(code, isValid);
                }//for
                //Display results
                displayResults();
                break;

            } catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Enter a number between 1 and 10");
            }//catch
        }//while
    }//verifyLicensePlates

    // Method to validate license plate using regex
    private boolean isValidLicensePlate(String code) {
        Pattern compiledPattern = Pattern.compile(LICENSE_PLATE_PATTERN);
        Matcher matcher = compiledPattern.matcher(code);
        return matcher.matches();
    }//isValidLicensePlate

    private boolean isValidUsername(String code) {
        Pattern compiledPattern = Pattern.compile(USERNAME_PATTERN);
        Matcher matcher = compiledPattern.matcher(code);
        return matcher.matches();
    }//isValidLicensePlate

    // Method to display results
    public void displayResults() {
        StringBuilder result = new StringBuilder("License Plate Validation Results:\n");
        for (int i = 0; i < numberOfItems; i++) {
            result.append(itemCode[i].toString()).append("\n");
        }
        JOptionPane.showMessageDialog(null, result.toString());
    }
}//class
