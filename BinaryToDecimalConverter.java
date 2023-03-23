import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BinaryToDecimalConverter implements ActionListener {
    private JFrame frame;
    private JTextField binaryField;
    private JLabel resultLabel;

    public BinaryToDecimalConverter() {
        frame = new JFrame("Binary to Decimal Converter");
        frame.setLayout(new GridLayout(3, 1));

        binaryField = new JTextField();
        binaryField.addActionListener(this);
        frame.add(binaryField);

        JButton convertButton = new JButton("Convert");
        convertButton.addActionListener(this);
        frame.add(convertButton);

        resultLabel = new JLabel();
        frame.add(resultLabel);

        frame.pack();
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            String binaryString = binaryField.getText();
            int decimal = Integer.parseInt(binaryString, 2);
            resultLabel.setText(binaryString + " in decimal is " + decimal);
        } catch (NumberFormatException ex) {
            resultLabel.setText("Invalid binary number: " + binaryField.getText());
        }
    }

    public static void main(String[] args) {
        new BinaryToDecimalConverter();
    }
}
