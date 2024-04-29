import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazUsuario extends JFrame {
    private CryptoAPI cryptoAPI;

    public InterfazUsuario() {
        cryptoAPI = new CryptoAPI();

        setTitle("Intercambio de Criptomonedas");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        JLabel fromLabel = new JLabel("De: Bitcoin");
        JLabel toLabel = new JLabel("A: Ethereum");
        JLabel amountLabel = new JLabel("Cantidad:");
        JTextField amountField = new JTextField("1"); // Agrega un campo de texto para la cantidad

        JButton exchangeButton = new JButton("Intercambiar");
        exchangeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double amount = Double.parseDouble(amountField.getText()); // Obtiene la cantidad ingresada por el usuario
                double result = cryptoAPI.exchange("bitcoin", "ethereum", amount);

                JOptionPane.showMessageDialog(null, "El resultado del intercambio es: " + result);
            }
        });

        panel.add(fromLabel);
        panel.add(new JLabel()); // Agrega un espacio vacío para mantener la simetría
        panel.add(toLabel);
        panel.add(new JLabel()); // Agrega un espacio vacío para mantener la simetría
        panel.add(amountLabel);
        panel.add(amountField); // Agrega el campo de texto a la interfaz
        panel.add(exchangeButton);

        add(panel);
    }
}