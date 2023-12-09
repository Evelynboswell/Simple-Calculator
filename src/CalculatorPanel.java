import javax.swing.*;

public class CalculatorPanel extends JPanel {
    // Constructor
    public CalculatorPanel() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        // Add the input fields
        JLabel label1 = new JLabel("Number 1: ");
        JLabel label2 = new JLabel("Number 2: ");
        JTextField textField1 = new JTextField(10);
        JTextField textField2 = new JTextField(10);
        add(label1);
        add(textField1);
        add(label2);
        add(textField2);

        // Add the buttons
        JButton button1 = new JButton("+");
        JButton button2 = new JButton("-");
        JButton button3 = new JButton("*");
        JButton button4 = new JButton("/");
        JButton button5 = new JButton("=");
        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
    }
}