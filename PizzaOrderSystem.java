import javax.swing.*;
import java.awt.*;

public class PizzaOrderSystem extends JFrame {
    private CustomerPanel customerPanel;
    private SizePanel sizePanel;
    private ToppingsPanel toppingsPanel;
    private OrderSummaryPanel orderSummaryPanel;
    private ButtonPanel buttonPanel;

    public PizzaOrderSystem() {
        setTitle("Pizza Order Management System");
        setSize(400, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(0, 1));

        customerPanel = new CustomerPanel();
        sizePanel = new SizePanel();
        toppingsPanel = new ToppingsPanel();
        orderSummaryPanel = new OrderSummaryPanel();
        buttonPanel = new ButtonPanel(this);

        add(customerPanel);
        add(sizePanel);
        add(toppingsPanel);
        add(new JLabel("Order Summary:"));
        add(orderSummaryPanel);
        add(buttonPanel);
    }

    public CustomerPanel getCustomerPanel() {
        return customerPanel;
    }

    public SizePanel getSizePanel() {
        return sizePanel;
    }

    public ToppingsPanel getToppingsPanel() {
        return toppingsPanel;
    }

    public OrderSummaryPanel getOrderSummaryPanel() {
        return orderSummaryPanel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            PizzaOrderSystem frame = new PizzaOrderSystem();
            frame.setVisible(true);
        });
    }
}
