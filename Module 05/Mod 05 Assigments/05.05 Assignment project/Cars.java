public class Cars {

    public Cars() { // constructor
    }

    public double HorsePower(int torque, int rpm) {

        double hpower = (torque * rpm) / 5252;
        return hpower;
    }

    public String CoolFactor(double horsePower) {
        String howCool = "";

        if (horsePower < 300) {
            howCool = "Not Cool";
        } else if (horsePower < 600) {
            howCool = "Somewhat Cool";
        } else {
            howCool = "Very Cool";
        }

        return howCool;

    }

}
