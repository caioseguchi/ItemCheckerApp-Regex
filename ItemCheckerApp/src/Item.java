//Domain Class LicensePlate
public class Item {
    //Variables
    private String code;
    private boolean valid;

    //Constructor
    public Item(String code, boolean valid) {
        this.code = code;
        this.valid = valid;
    }

    //Getters and Setter
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    //toString

    @Override
    public String toString() {
        return code + " - " + (valid ? "Valid" : "Invalid");
    }
}//class
