import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AsignarNave extends JDialog {
    private JComboBox<String> cmbMisiones;
    private JComboBox<String> cmbNaves;

    public AsignarNave(GestorMisiones gestorMisiones) {
        setTitle("Asignar Nave");
        setSize(300, 200);
        setLayout(new GridLayout(3, 2));
        setLocationRelativeTo(null);

        add(new JLabel("Misión:"));
        cmbMisiones = new JComboBox<>(gestorMisiones.getNombresMisiones());
        add(cmbMisiones);

        add(new JLabel("Nave:"));
        cmbNaves = new JComboBox<>(gestorMisiones.getNombresNaves());
        add(cmbNaves);

        JButton btnAsignar = new JButton("Asignar");
        btnAsignar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombreMision = (String) cmbMisiones.getSelectedItem();
                String nombreNave = (String) cmbNaves.getSelectedItem();
                NaveEspacial nave = gestorMisiones.getNavePorNombre(nombreNave);

                gestorMisiones.asignarNaveAMision(nombreMision, nave);
            }
        });
        add(btnAsignar);

        setVisible(true);
    }
}

