import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interfaz {
    private JFrame frame;
    private JComboBox<Materiales> materialComboBox;
    private JTextField cantidadTextField;
    private JButton guardarButton;
    private JTextArea inventarioTextArea;
    private GestorMateriales gestorMateriales;

    public Interfaz() {
        gestorMateriales = new GestorMateriales();
        frame = new JFrame("Gestor de Minecraft");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        frame.add(panel);

        materialComboBox = new JComboBox<>(gestorMateriales.getMateriales().toArray(new Materiales[0]));
        panel.add(materialComboBox);

        cantidadTextField = new JTextField(10);
        panel.add(cantidadTextField);

        guardarButton = new JButton("Guardar");
        panel.add(guardarButton);

        inventarioTextArea = new JTextArea(10, 30);
        panel.add(inventarioTextArea);

        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Materiales materialSeleccionado = (Materiales) materialComboBox.getSelectedItem();
                int cantidad = Integer.parseInt(cantidadTextField.getText());
                if (cantidad > 64) {
                    JOptionPane.showMessageDialog(frame, "La cantidad máxima de materiales es 64.");
                } else {
                    inventarioTextArea.append(materialSeleccionado.getNombre() + ": " + cantidad + "\n");
                }
            }
        });

        frame.setVisible(true);
    }
}