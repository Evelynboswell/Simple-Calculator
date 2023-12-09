import javax.swing.*;
import java.awt.*;

public class CalculatorFrame extends JFrame {
    private JTextField num1Text;
    private JTextField num2Text;
    private JButton plusButton;
    private JButton minusButton;
    private JButton multiplyButton;
    private JButton divideButton;
    private JButton equalsButton;
    private int num1;
    private int num2;
    private int result;
    // Constructor
    public CalculatorFrame() {
        super("Simple Calculator");

        // Set up the content pane
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(new GridLayout(0,1,10,10));

        // Add the input fields
        num1Text = new JTextField(10);
        num2Text = new JTextField(10);
        plusButton = new JButton("+");
        minusButton = new JButton("-");
        multiplyButton = new JButton("*");
        divideButton = new JButton("/");
        equalsButton = new JButton("=");
        getContentPane().add(num1Text);
        getContentPane().add(num2Text);
        getContentPane().add(plusButton);
        getContentPane().add(minusButton);
        getContentPane().add(multiplyButton);
        getContentPane().add(divideButton);
        getContentPane().add(equalsButton);

        // Add action listeners
        plusButton.addActionListener(e -> calculate());
        minusButton.addActionListener(e -> calculate());
        multiplyButton.addActionListener(e -> calculate());
        divideButton.addActionListener(e -> calculate());
        equalsButton.addActionListener(e -> displayResult());
    }

    // Method to calculate the result
    private void calculate() {
        try {
            num1 = Integer.parseInt(num1Text.getText());
            num2 = Integer.parseInt(num2Text.getText());
            result = num1 + num2;

            if (result == 0) {
                displayResult("Error: cannot subtract zero from non-zero value.");
            } else {
                displayResult(String.valueOf(result));
            }
        } catch (NumberFormatException e) {
            displayResult("Invalid input. Please enter valid numbers.");
        }
    }

    // Method to display the result
    private void displayResult() {
        JOptionPane.showMessageDialog(this, "Result: " + result, "Calculator", JOptionPane.INFORMATION_MESSAGE);
    }
    private void displayError(String message) {
        JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
    }
    private void displayResult(String message) {
        JOptionPane.showMessageDialog(null, message, "Result", JOptionPane.INFORMATION_MESSAGE);
    }
}