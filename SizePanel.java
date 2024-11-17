import javax.swing.*;

public class SizePanel extends JPanel {
    private JComboBox<String> sizeComboBox;

    public SizePanel() {
        setBorder(BorderFactory.createTitledBorder("Choose Pizza Size"));
        sizeComboBox = new JComboBox<>(new String[]{"Small", "Medium", "Large"});
        add(sizeComboBox);
    }

    public String getSelectedSize() {
        return (String) sizeComboBox.getSelectedItem();
    }

    public void resetSize() {
        sizeComboBox.setSelectedIndex(0);
    }
}
