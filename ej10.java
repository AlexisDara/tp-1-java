import java.util.Scanner;


public class ej10{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        int n = 0;
          
        System.out.println("ingrese un numero");
        n=scanner.nextInt();
       
        int aux= 1;     
      
        for(int i =1;i<=n;i++){      
        aux *=i;
        }

        System.out.println("el resultado es: " + aux);
        
    }
    
}
