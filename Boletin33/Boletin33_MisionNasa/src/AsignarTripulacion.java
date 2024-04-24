import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AsignarTripulacion extends JDialog {
    private JComboBox<String> cmbMisiones;
    private JComboBox<String> cmbTripulantes;

    public AsignarTripulacion(GestorMisiones gestorMisiones) {
        setTitle("Asignar Tripulante");
        setSize(300, 200);
        setLayout(new GridLayout(3, 2));
        setLocationRelativeTo(null);

        add(new JLabel("Misión:"));
        cmbMisiones = new JComboBox<>(gestorMisiones.getNombresMisiones());
        add(cmbMisiones);

        add(new JLabel("Tripulante:"));
        cmbTripulantes = new JComboBox<>(gestorMisiones.getNombresTripulantes());
        add(cmbTripulantes);

        JButton btnAsignar = new JButton("Asignar");
        btnAsignar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombreMision = (String) cmbMisiones.getSelectedItem();
                String nombreTripulante = (String) cmbTripulantes.getSelectedItem();
                MiembroTripulacion tripulante = gestorMisiones.getTripulantePorNombre(nombreTripulante);

                gestorMisiones.asignarTripulanteAMision(nombreMision, tripulante);
            }
        });
        add(btnAsignar);

        setVisible(true);
    }
}