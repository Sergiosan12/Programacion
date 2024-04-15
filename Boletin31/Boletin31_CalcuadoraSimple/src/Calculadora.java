import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {
    private JFrame frame;
    private JTextField display;
    private String numero = "";
    private String operacion = "";

    public Calculadora() {
        frame = new JFrame("Calculadora");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        display = new JTextField();
        display.setFont(new Font("Arial", Font.PLAIN, 20));
        frame.add(display, BorderLayout.NORTH);

        JPanel numberPanel = new JPanel(new GridLayout(4, 4));
        for (int i = 1; i <= 9; i++) {
            JButton button = new JButton(String.valueOf(i));
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    display.setText(display.getText() + e.getActionCommand());
                }
            });
            numberPanel.add(button);
        }

        JButton zeroButton = new JButton("0");
        zeroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + e.getActionCommand());
            }
        });
        numberPanel.add(zeroButton);

        String[] operations = {"+", "-", "x", "÷"};
        for (String op : operations) {
            JButton button = new JButton(op);
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    numero = display.getText();
                    operacion = e.getActionCommand();
                    display.setText("");
                }
            });
            numberPanel.add(button);
        }

        JButton clearButton = new JButton("C");
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText("");
                numero = "";
                operacion = "";
            }
        });
        numberPanel.add(clearButton);

        JButton calculateButton = new JButton("=");
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!numero.isEmpty() && !display.getText().isEmpty() && !operacion.isEmpty()) {
                    double result = 0;
                    switch (operacion) {
                        case "+":
                            result = Double.parseDouble(numero) + Double.parseDouble(display.getText());
                            break;
                        case "-":
                            result = Double.parseDouble(numero) - Double.parseDouble(display.getText());
                            break;
                        case "x":
                            result = Double.parseDouble(numero) * Double.parseDouble(display.getText());
                            break;
                        case "÷":
                            result = Double.parseDouble(numero) / Double.parseDouble(display.getText());
                            break;
                    }
                    display.setText(String.valueOf(result));
                    numero = "";
                    operacion = "";
                }
            }
        });
        numberPanel.add(calculateButton);

        frame.add(numberPanel, BorderLayout.CENTER);

        frame.pack();
        frame.setSize(400, 500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}