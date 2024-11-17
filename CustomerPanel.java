import javax.swing.*;
import java.awt.*;

public class CustomerPanel extends JPanel {
    private JTextField nameField, phoneField, addressField;

    public CustomerPanel() {
        setLayout(new GridLayout(3, 2));
        setBorder(BorderFactory.createTitledBorder("Customer Details"));

        add(new JLabel("Name:"));
        nameField = new JTextField();
        add(nameField);

        add(new JLabel("Phone:"));
        phoneField = new JTextField();
        add(phoneField);

        add(new JLabel("Address:"));
        addressField = new JTextField();
        add(addressField);
    }

    public String getName() {
        return nameField.getText();
    }

    public String getPhone() {
        return phoneField.getText();
    }

    public String getAddress() {
        return addressField.getText();
    }

    public void clearFields() {
        nameField.setText("");
        phoneField.setText("");
        addressField.setText("");
    }
}
