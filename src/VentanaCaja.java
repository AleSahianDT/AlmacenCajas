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

