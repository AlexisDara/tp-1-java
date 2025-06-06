import java.util.Scanner;
import java.util.Random;

public class ej9{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        int[] n = new int[3];
            System.out.println("Ingrese 3 numeros");     
     for(int i = 0; i < n.length; i++) {
            n[i] = scanner.nextInt();
        }
        int mayor=0;
        for(int j = 0;j<n.length;j++){
            if(n[j]>mayor){
                mayor=n[j];
            }
            
        }
       
        System.out.println("El mayor de los tres es: " + mayor);
        
    }
    
}
