public class Patient {
    private int idNumber;
    private int age;
    private BloodData bloodData;

    // Default constructor
    public Patient() {
        this.idNumber = 0;
        this.age = 0;
        this.bloodData = new BloodData();
    }

    // Overloaded constructor
    public Patient(int idNumber, int age, BloodData bloodData) {
        this.idNumber = idNumber;
        this.age = age;
        this.bloodData = bloodData;
    }

    // Getters and Setters
    public int getIdNumber() {
        return idNumber;
    }

    public int getAge() {
        return age;
    }

    public BloodData getBloodData() {
        return bloodData;
    }
}