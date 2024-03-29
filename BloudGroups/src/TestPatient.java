import java.util.Scanner;

public class TestPatient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Patient defaultPatient = new Patient();

        // Prompts
        System.out.println("Enter ID number for the second patient: ");
        int idNumber2 = scanner.nextInt();
        System.out.println("Enter age for the second patient: ");
        int age2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Patient blood type (O, A, B, AB): ");
        BloodType bloodType2 = BloodType.valueOf(scanner.nextLine().toUpperCase());
        System.out.println("Patient Rh factor (+ or -): ");
        char rhFactor2 = scanner.nextLine().charAt(0);

        BloodData bloodData2 = new BloodData(bloodType2, rhFactor2);
        Patient patient2 = new Patient(idNumber2, age2, bloodData2);

        // Third Patient Details
        System.out.println("Enter ID number for the third patient: ");
        int idNumber3 = scanner.nextInt();
        System.out.println("Enter age for the third patient: ");
        int age3 = scanner.nextInt();

        Patient patient3 = new Patient(idNumber3, age3, new BloodData());

        // All patient details
        System.out.println("\nDetails of First Patient (Default Values):");
        displayPatientDetails(defaultPatient);

        System.out.println("\nDetails of Second Patient (User Values):");
        displayPatientDetails(patient2);

        System.out.println("\nDetails of Third Patient (Default BloodData Values):");
        displayPatientDetails(patient3);

        scanner.close();
    }

    // Display
    private static void displayPatientDetails(Patient patient) {
        System.out.println("ID Number: " + patient.getIdNumber());
        System.out.println("Age: " + patient.getAge());
        System.out.println("Blood Type: " + patient.getBloodData().getBloodType());
        System.out.println("Rh Factor: " + patient.getBloodData().getRhFactor());
    }
}