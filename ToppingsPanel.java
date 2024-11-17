import javax.swing.*;
import java.awt.*;

public class ToppingsPanel extends JPanel {
    private JCheckBox pepperoniCheckBox, mushroomsCheckBox, onionsCheckBox, sausageCheckBox, extraCheeseCheckBox;

    public ToppingsPanel() {
        setLayout(new GridLayout(0, 1));
        setBorder(BorderFactory.createTitledBorder("Select Toppings"));

        pepperoniCheckBox = new JCheckBox("Pepperoni");
        mushroomsCheckBox = new JCheckBox("Mushrooms");
        onionsCheckBox = new JCheckBox("Onions");
        sausageCheckBox = new JCheckBox("Sausage");
        extraCheeseCheckBox = new JCheckBox("Extra Cheese");

        add(pepperoniCheckBox);
        add(mushroomsCheckBox);
        add(onionsCheckBox);
        add(sausageCheckBox);
        add(extraCheeseCheckBox);
    }

    public double getToppingsPrice() {
        double price = 0;
        if (pepperoniCheckBox.isSelected()) price += 1;
        if (mushroomsCheckBox.isSelected()) price += 0.5;
        if (onionsCheckBox.isSelected()) price += 0.5;
        if (sausageCheckBox.isSelected()) price += 1.5;
        if (extraCheeseCheckBox.isSelected()) price += 1;
        return price;
    }

    public String getSelectedToppings() {
        StringBuilder toppings = new StringBuilder();
        if (pepperoniCheckBox.isSelected()) toppings.append("Pepperoni, ");
        if (mushroomsCheckBox.isSelected()) toppings.append("Mushrooms, ");
        if (onionsCheckBox.isSelected()) toppings.append("Onions, ");
        if (sausageCheckBox.isSelected()) toppings.append("Sausage, ");
        if (extraCheeseCheckBox.isSelected()) toppings.append("Extra Cheese, ");
        return toppings.length() > 0 ? toppings.substring(0, toppings.length() - 2) : "No Toppings";
    }

    public void resetToppings() {
        pepperoniCheckBox.setSelected(false);
        mushroomsCheckBox.setSelected(false);
        onionsCheckBox.setSelected(false);
        sausageCheckBox.setSelected(false);
        extraCheeseCheckBox.setSelected(false);
    }
}
