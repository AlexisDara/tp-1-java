import java.util.Scanner;


public class ej16 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        
        System.out.println("ingrese el largo de un lado");
        int cat1= scanner.nextInt();
        System.out.println("ingrese el largo de un lado");
        int cat2= scanner.nextInt();
        System.out.println("ingrese el largo de un lado");
        int cat3= scanner.nextInt();
        
        if ((cat1 == cat2 && cat1 != cat3) || (cat1 == cat3 && cat1 != cat2) || (cat2 == cat3 && cat2 != cat1)) {
            System.out.println("El triangulo es isosceles");
        } else if (cat1 == cat2 && cat1 == cat3) {
            System.out.println("El triangulo es equilatero");
        } else {
            System.out.println("El triangulo es escaleno");
        }
    }
    
}

