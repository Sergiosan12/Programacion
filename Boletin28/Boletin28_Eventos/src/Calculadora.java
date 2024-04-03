
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame {
    private JTextField operando1;
    private JTextField operando2;
    private JButton suma;
    private JButton resta;
    private JTextArea resultArea;

    public Calculadora() {
        setLayout(new FlowLayout());

        operando1 = new JTextField(10);
        operando2 = new JTextField(10);
        suma = new JButton("+");
        resta = new JButton("-");
        resultArea = new JTextArea(3, 20);
        resultArea.setEditable(false);

        add(operando1);
        add(operando2);
        add(suma);
        add(resta);
        add(resultArea);

        suma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(operando1.getText());
                    double num2 = Double.parseDouble(operando2.getText());
                    double result = num1 + num2;
                    resultArea.setText(String.valueOf(result));
                } catch (NumberFormatException ex) {
                    resultArea.setText("Error: Entrada no válida");
                }
            }
        });

        resta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(operando1.getText());
                    double num2 = Double.parseDouble(operando2.getText());
                    double result = num1 - num2;
                    resultArea.setText(String.valueOf(result));
                } catch (NumberFormatException ex) {
                    resultArea.setText("Error: Entrada no válida");
                }
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(250, 200);
        setVisible(true);
    }
}