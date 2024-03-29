import java.util.Scanner;

public class TestBloodData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declare the first object
        BloodData defaultBloodData = new BloodData();

        // User Prompts
        System.out.println("Enter blood type (O, A, B, AB): ");
        BloodType userBloodType = BloodType.valueOf(scanner.nextLine().toUpperCase());

        System.out.println("Enter Rh factor (+ or -): ");
        char userRhFactor = scanner.nextLine().charAt(0);

        BloodData userBloodData = new BloodData(userBloodType, userRhFactor);

        // Display
        System.out.println("Default Blood Data:");
        displayBloodData(defaultBloodData);

        System.out.println("\nUser Blood Data:");
        displayBloodData(userBloodData);

        // Change values in the default object to user's values
        defaultBloodData.setBloodType(userBloodType);
        defaultBloodData.setRhFactor(userRhFactor);

        System.out.println("\nNew Blood Data:");
        displayBloodData(defaultBloodData);

        scanner.close();
    }

    private static void displayBloodData(BloodData bloodData) {
        System.out.println("Blood Type: " + bloodData.getBloodType());
        System.out.println("Rh Factor: " + bloodData.getRhFactor());
    }
}
