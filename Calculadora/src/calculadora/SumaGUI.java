package com.mycompany.sumagui;

import javax.swing.*;
import java.awt.*;

public class SumaGUI extends JFrame {
    
    private JTextField campo1, campo2;
    private JLabel resultadoLabel;
    
    public SumaGUI() {
        setTitle("Suma de dos números");
        setSize(700,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Crear los componentes
        campo1 = new JTextField(10);
        campo2 = new JTextField(10);
        JButton sumarButton = new JButton("Sumar");
        resultadoLabel = new JLabel("Resultado: ");
        
        // Configurar el layout del JFrame
        setLayout(new FlowLayout());
        
        /// Agregar los componentes al JFrame
        add(new JLabel("Número 1: "));
        add(campo1);
        add(new JLabel("Número 2: "));
        add(campo2);
        add(sumarButton);
        add(resultadoLabel);
        
        // Asignar el oyente de eventos al botón Sumar
        sumarButton.addActionListener(e -> sumarNumeros());
        
        /*// Forma Indirecta para Asignar el oyente de eventos al botón Sumar
        sumarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sumarNumeros();
            }
        });*/
       
        setLocationRelativeTo(null); // Centrar el JFrame en la pantalla
    }
    
    private void sumarNumeros() {
        try {
            // Obtener los valores de los campos de texto y convertirlos a números
            double numero1 = Double.parseDouble(campo1.getText());
            double numero2 = Double.parseDouble(campo2.getText());
            
            // Calcular la suma
            double resultado = numero1 + numero2;
            
            // Mostrar el resultado en la etiqueta
            resultadoLabel.setText("Resultado: " + resultado);
        } catch (NumberFormatException ex) {
            // Manejar la excepción si los valores ingresados no son números
            resultadoLabel.setText("Error: Ingresa valores numéricos");
        }
    }
    
    public static void main(String[] args) {      
        // Crear objeto
        SumaGUI s = new SumaGUI();
        // Establecer el componente asociado al objeto como visible
        s.setVisible(true); 
    }
}