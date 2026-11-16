package Validacion;
import java.util.Scanner;

public class AreaC {
    public static Scanner sc = new Scanner(System.in);

    public static double leerRadio() {
        double radio;
        while (true) {
            System.out.println("Ingrese el radio del circulo: ");
            if (sc.hasNextDouble()) { 
                radio = sc.nextDouble();
                sc.nextLine();
                return radio;
            } else {
                System.out.println("ingresa un numero valido");
                sc.nextLine();
            }
        }
    }
    public static void main(String[] args) {
        double radio = leerRadio();
        double area = 3.1416 * radio * radio;
        System.out.println("El área del círculo es: " + area);
    }
}