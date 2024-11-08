package calculadora;
/*
Integrantes:
    Catalina Rancusi
    Christian Velasquez
    Matias Sepulveda
*/
import javax.swing.*;
import java.awt.*;

public class Calculadora extends JFrame{
    private JTextField numero1,numero2;
    private JButton botonSuma,botonMultiplicar,botonDividir,botonRestar,botonPotencia;
    private JLabel resultadoLabel;
    
    public Calculadora(){
        setSize(500,400);
	setTitle("Calculadora");
	setLocation(100, 100);
	setLocationRelativeTo(null);
	setResizable(false);
	setMinimumSize(new Dimension(200,200));
	getContentPane().setBackground(Color.LIGHT_GRAY);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
        numero1 = new JTextField(10);
	numero2 = new JTextField(10);
        
	botonSuma = new JButton("+");
        botonRestar=new JButton("-");
        botonMultiplicar=new JButton("X");
        botonDividir=new JButton("/");
        botonPotencia=new JButton("^");
        
        resultadoLabel = new JLabel("Resultado: ");
	
        JPanel panel = new JPanel();
        //panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        panel.add(new JLabel("Número 1: "));
	panel.add(numero1);
        panel.add(new JLabel("Número 2: "));
        panel.add(numero2);
	panel.add(botonSuma);
        panel.add(botonRestar);
        panel.add(botonMultiplicar);
        panel.add(botonDividir);
        panel.add(botonPotencia);
        panel.add(resultadoLabel);
	add(panel);
	panel.setBackground(Color.LIGHT_GRAY);
	botonSuma.addActionListener(e -> suma());
        botonRestar.addActionListener(e -> resta());
        botonMultiplicar.addActionListener(e -> mult());
        botonDividir.addActionListener(e -> div());
        botonPotencia.addActionListener(e -> pot());
    }
    
    private void pot(){
        try {
		double num1 = Double.parseDouble(numero1.getText());
		double num2 = Double.parseDouble(numero2.getText());
		double resultado = Math.pow(num1,num2);
		resultadoLabel.setText("Resultado: " + resultado);
	} catch (NumberFormatException ex) {
		resultadoLabel.setText("Error: Ingresa valores numéricos");
	}
    }
    
    private void div(){
        try {
		double num1 = Double.parseDouble(numero1.getText());
		double num2 = Double.parseDouble(numero2.getText());
		double resultado = num1 / num2;
		resultadoLabel.setText("Resultado: " + resultado);
	} catch (NumberFormatException ex) {
		resultadoLabel.setText("Error: Ingresa valores numéricos");
	}
    }
    
    private void mult(){
        try {
		double num1 = Double.parseDouble(numero1.getText());
		double num2 = Double.parseDouble(numero2.getText());
		double resultado = num1 * num2;
		resultadoLabel.setText("Resultado: " + resultado);
	} catch (NumberFormatException ex) {
		resultadoLabel.setText("Error: Ingresa valores numéricos");
	}
    }
    
    private void resta(){
        try {
		double num1 = Double.parseDouble(numero1.getText());
		double num2 = Double.parseDouble(numero2.getText());
		double resultado = num1 - num2;
		resultadoLabel.setText("Resultado: " + resultado);
	} catch (NumberFormatException ex) {
		resultadoLabel.setText("Error: Ingresa valores numéricos");
	}
    }
    
    private void suma(){
        try {
		double num1 = Double.parseDouble(numero1.getText());
		double num2 = Double.parseDouble(numero2.getText());
		double resultado = num1 + num2;
		resultadoLabel.setText("Resultado: " + resultado);
	} catch (NumberFormatException ex) {
		resultadoLabel.setText("Error: Ingresa valores numéricos");
	}
    }
    
    public static void main(String[] args) {
        Calculadora c=new Calculadora();
        c.setVisible(true);
    }
    
}
