package matriz;
import java.util.Scanner;
/*
Integrantes:
    Catalina Rancusi
    Christian Velasquez
    Matias Sepulveda
*/
public class Matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el numero de filas de la matriz: ");
        int filas=sc.nextInt();
        System.out.print("Introduzca el numero de columnas de la matriz:");
        int columnas=sc.nextInt();
        int[][] Matriz=new int[filas][columnas];
        int[][] frecuencia=new int[(filas*columnas)][2];
        int cont=0;
        System.out.println("Introduzca elementos de la matriz:");
        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                System.out.print("Matriz["+(i+1)+"]["+(j+1)+"]: ");
                Matriz[i][j]=sc.nextInt();
            }
        }
        System.out.println("\nMatriz capturada: ");
        for(int i=0; i < filas; i++) {
            for(int j=0; j < columnas; j++) {
                System.out.print(Matriz[i][j]+"\t");
            }
            System.out.println();
        }
        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                int elemento=Matriz[i][j];
                boolean encontrado=false;
                for(int k=0;k<cont;k++){
                    if(frecuencia[k][0]==elemento){
                        frecuencia[k][1]++;
                        encontrado=true;
                        break;
                    }
                }
                if(!encontrado){
                frecuencia[cont][0]=elemento;
                frecuencia[cont][1]=1;
                cont++;
                }
            }
        }
        System.out.print("Elemento Frecuencia\n");
        for(int i=0; i<filas;i++){
            System.out.println(frecuencia[i][0]+" "+frecuencia[i][1]);
        }
    }
}
