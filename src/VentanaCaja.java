import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaCaja {
    private JPanel Almacenamiento;
    private JTextField textCodigo;
    private JTextField textNombre;
    private JComboBox comboBoxContenido;
    private JComboBox comboBoxPila;
    private JButton guardarButton;
    private JButton buscarButton;
    private JButton mostrarButton;

    private Pila pila1[] = new Pila[6];


public VentanaCaja() {
    guardarButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String pilaElegida = comboBoxPila.getSelectedItem().toString();
            int pila = Integer.parseInt(pilaElegida);
            if (pila1[pila].getTamaño()>6){
                pila1[pila].apilar(textNombre.getText(), comboBoxContenido.getSelectedItem().toString(), textCodigo.getText());
            }
        }
    });
}
}
