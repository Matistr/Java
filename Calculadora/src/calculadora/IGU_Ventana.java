// Se define al crear el proyecto en formato MAVEN
package com.mycompany.igu_ventana;

// Importar las Clases Swing y AWT
import javax.swing.*;
import java.awt.*;

// Se declara la clase principal como subclase de la clase JFrame
// para heredar los métodos para la creación de ventanas junto
// con sus componentes
public class IGU_Ventana extends JFrame {
    // Atributos de la clase
    private JTextField campoNombre;
    private JButton botonSaludar;
    
    // Método constructor
    public IGU_Ventana(){
        // Configuración de la ventana
        // Establecer el tamaño de la ventana
        setSize(300,500);
        // Establecer el título de la ventana
        setTitle("Ventana de Prueba");
        // Establecer la localización de la ventana
        setLocation(100, 100);
        // Establecer límites: Posición y Tamaño        
	setBounds(100, 100, 300, 500);
        // Establecer ventana en el centro de la pantalla
        setLocationRelativeTo(null);
        // Establecer si la ventana puede o no cambiar de tamaño
        setResizable(false);
        // Establecer tamaño mínimo de la ventana
        setMinimumSize(new Dimension(200,200));
        // Establecer color de la ventana
        getContentPane().setBackground(Color.CYAN);
        //Color colorRosa = new Color(255, 175, 175);
        //Color colorX = new Color(100,200, 150);
        //getContentPane().setBackground(colorX);
        // Establecer el cierre automático del programa al cerrar la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        // Crear los componentes
        // Componente JLabel (etiqueta)
        JLabel etiquetaNombre = new JLabel("Nombre:");
        // Componente JTextField (campo de texto)
        campoNombre = new JTextField(20);
        // Componente JButton (botón)
        botonSaludar = new JButton("Saludar");
        
        // Configurar el layout de la ventana
        // Por defecto se usa BorderLayout el cual divide el contenedor en cinco 
        // áreas: norte, sur, este, oeste y centro. 
        // Cuando se agrega un componente al contenedor sin especificar una ubicación 
        // explícita, el componente se coloca en el centro del contenedor.
        JPanel panel = new JPanel();
        panel.add(etiquetaNombre);
        panel.add(campoNombre);
        panel.add(botonSaludar);
        // Agregar el panel al JFrame
        add(panel);
        // Definir el color del panel
        panel.setBackground(Color.cyan);
        
        // Asignar el oyente de eventos al componente, en este caso
        // al botón Saludar.
        // Este escuchador de eventos estará pendiente de acciones específicas realizadas 
        // por el usuario en ese componente, como hacer clic en el botón.
        // Toma un objeto ActionListener como argumento.
        // e -> método() es una expresión Lambda. Se usa usualmente e de evento
        // pero puede ser cualquier nombre. método() se ejecuta cuando el evento
        // se presente.
        botonSaludar.addActionListener(e -> saludar());
    } // Fin del método constructor
    
    // Método o acción que se activa al producirse el evento
    private void saludar() {
        String nombre = campoNombre.getText();
        if (!nombre.isEmpty()) {
            JOptionPane.showMessageDialog(this, "¡Hola, " + nombre + "!");
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, ingresa tu nombre.");
        }
    } // Fin del método saludar()

    public static void main(String[] args) {
        // Crear objeto
        IGU_Ventana v = new IGU_Ventana();
        // Establecer el componente asociado al objeto como visible
        v.setVisible(true); 
    } // Fin del método principal
    
} // Fin de la clase