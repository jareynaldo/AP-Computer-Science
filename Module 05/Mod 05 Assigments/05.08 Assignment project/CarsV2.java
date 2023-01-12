/**
 * @purpose: To modify my first classS
 *
 * @author Jose Reynaldo
 * @version 11/1/2023
 */

public class CarsV2 {

    private String myName;
    private int myTorque;
    private int myRPM;
    private String myCFactor;
    private int myHorsePower;

    public CarsV2() { // constructor
    }

    public CarsV2(int torque) {
        myTorque = torque;
        myHorsePower = 0;
        myRPM = 0;
        myCFactor = "";
        myName = "";

    }

    public CarsV2(String name) {
        myName = name;
        myTorque = 0;
        ;
        myHorsePower = 0;
        myRPM = 0;
        myCFactor = "";
    }

    public CarsV2(int torque, int rpm, String name) {
        myTorque = torque;
        myRPM = rpm;
        myName = name;
        myCFactor = "";
        myHorsePower = 0;

    }

    // start getters
    public int getTorque() {
        return myTorque;
    }

    public int getRPM() {
        return myRPM;
    }

    public int getHPower() {
        return myHorsePower;
    }

    public String getCFactor() {
        return myCFactor;
    }

    public String getName() {
        return myName;
    }

    // start setters
    public void setTorque(int torque) {
        myTorque = torque;
    }

    public void setRPM(int rpm) {
        myRPM = rpm;
    }

    public void setHpower(int hPower) {
        myHorsePower = hPower;
    }

    public void setCFactor(String Cfactor) {
        myCFactor = Cfactor;
    }

    public void setName(String name) {
        myName = name;
    }

    // start methods
    public int HorsePower(int torque, int rpm) {
        int hpower = (torque * rpm) / 5252;
        return hpower;
    }

    public int HorsePower() {
        myHorsePower = (myTorque * myRPM) / 5252;
        return myHorsePower;
    }

    public String CoolFactor(int horsePower) {
        myHorsePower = horsePower;
        if (horsePower < 300) {
            myCFactor = "Not Cool";
        } else if (horsePower < 600) {
            myCFactor = "Somewhat Cool";
        } else {
            myCFactor = "Very Cool";
        }
        return myCFactor;
    }

    public String CoolFactor() {

        if (myHorsePower < 300) {
            myCFactor = "Not Cool";
        } else if (myHorsePower < 600) {
            myCFactor = "Somewhat Cool";
        } else {
            myCFactor = "Very Cool";
        }
        return myCFactor;
    }

}
