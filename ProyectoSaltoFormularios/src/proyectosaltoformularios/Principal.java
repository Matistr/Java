package proyectosaltoformularios;

public class Principal {
    
    private static Ventana_Principal vp;
    private static Ventana_Secundaria_01 vs1;
    private static Ventana_Secundaria_02 vs2;
    
    public static void main(String[] args) {
        // Se crean las instancias de los formularios
        vp = new Ventana_Principal();
        vs1 = new Ventana_Secundaria_01();
        vs2 = new Ventana_Secundaria_02();
        
        // Mostrar el formulario principal
        vp.setVisible(true);      
    }
      
    // Métodos para mostrar y ocultar los formularios
    public static void mostrarVentanaPrincipal() {
        vp.setVisible(true);
        vs1.setVisible(false);
        vs2.setVisible(false);
    }

    public static void mostrarVentanaSecundaria1(String d1, String d2) {
        vs1.setDatos(d1, d2);
        vs1.setVisible(true);
        vs2.setVisible(false);
        vp.setVisible(false);
    }
    
    public static void mostrarVentanaSecundaria2(String d1, String d2) {
        vs2.setDatos(d1,d2);
        vs2.setVisible(true);
        vs1.setVisible(false);
        vp.setVisible(false);
    }
}
