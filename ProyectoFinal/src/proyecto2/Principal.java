/*Paradigmas de la Programacion, NRC 8150
Integrantes:
    Catalina Esperanza Rancusi Bustamante; 21..533.463-5
    Matias Ambrosio Sepulveda Toro; 21.323.113-8
    Christian Alonso Velasquez Matus; 21.351.669-8

Descripcion del programa:
    Programa que se le ingresan datos de ventas (nombre del vendedor, codigo, cantidades vendidas), 
    los cuales se muestran en la siguiente ventana,
    pudiendo comparar varios datos a partir de una matriz que los almacena, 
    obteneniendo un vendedor TOP comparando esta informacion.

*/
package proyecto2;

public class Principal{
    //Declaracion de variables, ventanas, comisiones, precios
    private static Ventana vp;
    private static Ingresar v1;
    private static Datos v2;
    private static VendedorTOP vt;
    public static float comA=0.06f,comB=0.04f,comC=0.02f;
    public static int precioAli1=650, precioAli2=1000, precioAli3=450, precioAmz1=910,precioAmz2=1400,precioAmz3=630;
    // Se declaran las comisiones y precios para luego llamarlos desde otras ventanas
    public static void main(String[] args) {
        //Se inicia la ventana principal dentro del constructor de la clase main
        vp=new Ventana();
        v1=new Ingresar();
        v2=new Datos();
        vt=new VendedorTOP();
        vp.setVisible(true);
        vp.setLocationRelativeTo(null);
        vp.setResizable(false);
    }
    public static void mostrarVentanaPrincipal(){
        //Metodo para mostrar la ventana principal, ocultando las demas ventanas
        vp.setVisible(true);
        vt.setVisible(false);
        vp.setResizable(false);
        vp.setLocationRelativeTo(null);//Para que el tamaño de la ventana no cambie de tamaño
        v1.setVisible(false);
        v2.setVisible(false);
    }
    public static void mostrarVentanaIngresar(){
        //Metodo para mostrar la ventana donde se ingresan los datos del vendedor
        vp.setVisible(false);
        v1.setVisible(true); 
        v1.setResizable(false);
        v1.setLocationRelativeTo(null);
        v2.setVisible(false);
        vt.setVisible(false);
    }
    public static void mostrarVentanaDatos(String nombre, String code, String cantidad1,String cantidad2, String cantidad3,String totalVentas,String totalComision, String totalProductos){
        //Metodo para mostrar la ventana donde se muestran los datos del vendedor ingresados anteriormente
        v2.setDatos(nombre, code, cantidad1, cantidad2, cantidad3,totalVentas,totalComision,totalProductos);
        //Metodo creado en Datos.java, lo que hace es tomar los datos que se le entrega y los pone en las etiquetas correspondientes
        v2.agregarDatos(nombre, code, cantidad1, cantidad2, cantidad3,totalVentas,totalComision,totalProductos);
        //Metodo que toma los datos entregados y los almacena en una matriz ubicada en Datos.java
        vp.setVisible(false);
        v1.setVisible(false);
        v2.setVisible(true);
        v2.setResizable(false);
        v2.setLocationRelativeTo(null);
        vt.setVisible(false);
    }    
    public static void mostrarVentanaTop(String array[]){
        //Metodo para mostrar la ventana VendedorTOP y ocultar las demas
        vp.setVisible(false);
        vt.setDatos(array);
        //Metodo creado en VendedorTOP, lo que hace es tomar el arreglo entregado y cada dato ponerlo en la etiqueta correspondiente
        v1.setVisible(false);
        v2.setVisible(false);
        vt.setVisible(true);
        vt.setResizable(false);
        vt.setLocationRelativeTo(null);
    }
    public static void volver(){
        //Metodo para volver de la ventana VendedorTOp hacia la ventana Datos
        vp.setVisible(false);
        v1.setVisible(false);
        v2.setVisible(true);
        v2.setResizable(false);
        v2.setLocationRelativeTo(null);
        vt.setVisible(false);
    }
}