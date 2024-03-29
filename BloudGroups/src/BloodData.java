
public class BloodData {
    private BloodType bloodType;
    private char rh;

    // Default constructor
    public BloodData() {
        this.bloodType = BloodType.O;
        this.rh = '+';
    }

    // Overloaded constructor
    public BloodData(BloodType bloodType, char rhFactor) {
        this.bloodType = bloodType;
        this.rh = rhFactor;
    }

    // Getters and Setters
    public BloodType getBloodType() {
        return bloodType;
    }

    public void setBloodType(BloodType bloodType) {
        this.bloodType = bloodType;
    }

    public char getRhFactor() {
        return rh;
    }

    public void setRhFactor(char rhFactor) {
        this.rh = rhFactor;
    }
}