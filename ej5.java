import java.util.Scanner;

public class ej5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 0;
        int aux = 0;
        
        System.out.println("Ingrese un numero del 1 al 10:");
        n = scanner.nextInt();
        while(n<= 0 || n>=11){
            System.out.println("ingrese un numero del 1 al 10:");
            n = scanner.nextInt();
        }
        // recorrer desde 1 hasta 10
        for(int i = 1; i <= 10; i++) {
           aux=0;
           aux= i * n;
        System.out.println( i + " por " + n + " es igual a: " + aux);// mostrar resultados
        }
    }
}
