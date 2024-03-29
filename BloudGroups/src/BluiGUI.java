import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BluiGUI extends JFrame implements ActionListener {
    private final JLabel resultLabel;
    private final JTextField idField;
    private final JTextField ageField;
    private final JTextField bloodTypeField;
    private final JTextField rhFactorField;
    private final JButton submitButton;

    public BluiGUI() {
        setTitle("Patient Information");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Initialize components
        JLabel idLabel = new JLabel("ID Number:");
        idField = new JTextField(10);
        JLabel ageLabel = new JLabel("Age:");
        ageField = new JTextField(10);
        JLabel bloodTypeLabel = new JLabel("Blood Type:");
        bloodTypeField = new JTextField(10);
        JLabel rhFactorLabel = new JLabel("Rh Factor:");
        rhFactorField = new JTextField(10);
        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);
        resultLabel = new JLabel("");

        // Set layout
        setLayout(new GridLayout(6, 2, 5, 5));

        // Add components to the frame
        add(idLabel);
        add(idField);
        add(ageLabel);
        add(ageField);
        add(bloodTypeLabel);
        add(bloodTypeField);
        add(rhFactorLabel);
        add(rhFactorField);
        add(submitButton);
        add(resultLabel);
    }

    // ActionListener implementation
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            // Get values from text fields
            int idNumber = Integer.parseInt(idField.getText());
            int age = Integer.parseInt(ageField.getText());
            BloodType bloodType = BloodType.valueOf(bloodTypeField.getText().toUpperCase());
            char rhFactor = rhFactorField.getText().charAt(0);

            BloodData bloodData = new BloodData(bloodType, rhFactor);

            Patient patient = new Patient(idNumber, age, bloodData);

            // Display patient details
            String result = "Patient Details:\n";
            result += "\n ID Number: " + patient.getIdNumber() + "\n";
            result += "\n Age: " + patient.getAge() + "\n";
            result += "\n Blood Type: " + patient.getBloodData().getBloodType() + "\n";
            result += "\n Rh Factor: " + patient.getBloodData().getRhFactor();
            resultLabel.setText(result);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new BluiGUI().setVisible(true));
    }
}