import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            InterfazUsuario ui = new InterfazUsuario();
            ui.setVisible(true);
        });
    }
}