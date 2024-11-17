import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonPanel extends JPanel implements ActionListener {
    private JButton calculateButton, clearButton, orderButton;
    private PizzaOrderSystem mainFrame;

    public ButtonPanel(PizzaOrderSystem mainFrame) {
        this.mainFrame = mainFrame;

        // Initialize buttons
        calculateButton = new JButton("Calculate Price");
        calculateButton.addActionListener(this);

        clearButton = new JButton("Clear");
        clearButton.addActionListener(this);

        orderButton = new JButton("Place Order");
        orderButton.addActionListener(this);

        // Add buttons to panel
        add(calculateButton);
        add(clearButton);
        add(orderButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calculateButton) {
            calculateOrder();
        } else if (e.getSource() == clearButton) {
            clearFields();
        } else if (e.getSource() == orderButton) {
            placeOrder();
        }
    }

    private void calculateOrder() {
        String size = mainFrame.getSizePanel().getSelectedSize();
        String customerName = mainFrame.getCustomerPanel().getName();
        String customerPhone = mainFrame.getCustomerPanel().getPhone();
        String customerAddress = mainFrame.getCustomerPanel().getAddress();

        double price = 0;
        switch (size) {
            case "Small":
                price = 5;
                break;
            case "Medium":
                price = 8;
                break;
            case "Large":
                price = 10;
                break;
            default:
                price = 0;
        }

        double toppingsPrice = mainFrame.getToppingsPanel().getToppingsPrice();
        String toppings = mainFrame.getToppingsPanel().getSelectedToppings();
        price += toppingsPrice;

        String order = String.format("Customer Name: %s\nPhone: %s\nAddress: %s\n\nPizza Size: %s\nToppings: %s\nTotal Price: Rs%.2f\n",
        customerName, customerPhone, customerAddress, size, toppings, price);

        mainFrame.getOrderSummaryPanel().setOrderSummary(order);
    }

    private void clearFields() {
        mainFrame.getCustomerPanel().clearFields();
        mainFrame.getSizePanel().resetSize();
        mainFrame.getToppingsPanel().resetToppings();
        mainFrame.getOrderSummaryPanel().clearSummary();
    }

    private void placeOrder() {
        JOptionPane.showMessageDialog(mainFrame, "Your order is placed!", "Order Confirmation", JOptionPane.INFORMATION_MESSAGE);
    }
}
