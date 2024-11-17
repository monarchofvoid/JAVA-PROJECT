import javax.swing.*;

public class OrderSummaryPanel extends JPanel {
    private JTextArea orderSummary;

    public OrderSummaryPanel() {
        orderSummary = new JTextArea(5, 20);
        orderSummary.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(orderSummary);
        add(scrollPane);
    }

    public void setOrderSummary(String summary) {
        orderSummary.setText(summary);
    }

    public void clearSummary() {
        orderSummary.setText("");
    }
}
