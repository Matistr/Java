package aproximar.e;
import java.util.Scanner;
/*
Integrantes:
    Catalina Rancusi
    Christian Velasquez
    Matias Sepulveda
*/
public class AproximarE{
    public static void main(String[] args)    {
        int x,n_inicial,n_final;
        double resultado=0,fact=1,pot;
        Scanner lector=new Scanner(System.in);
        System.out.print("Ingresa el valor de x: ");
        x=lector.nextInt();
        System.out.print("Ingresa el valor inicial de n: ");
        n_inicial=lector.nextInt();
        System.out.print("Ingresa el valor final de n: ");
        n_final=lector.nextInt();
        
        for(int i=n_inicial;i<=n_final;i++){
            resultado=Math.pow(i,x)/Factorial(i);
            System.out.println("Para n = "+i+", e elevado a la x = "+resultado);    
        }
    }
    public static double Factorial(int n) {
        int factorial = 1;
        for (int i = 1;i <= n; ++i) {
            factorial *= i;
        }
        return factorial;
    }
}