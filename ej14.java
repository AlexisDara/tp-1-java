import java.util.Scanner;

public class ej14{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("ingrese un numero N: ");
        int n = scanner.nextInt();
        
        int primero = 0;
        int segundo = 1;
        
        System.out.print("secuencia de fibonacci: ");
        
        for (int i = 0; i < n; i++) {
            System.out.print(primero + " ");
            
            int siguiente = primero + segundo;
            primero = segundo;
            segundo = siguiente;
        }
        
        scanner.close();
    }
}
