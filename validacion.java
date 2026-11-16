package Validacion;
import java.util.Scanner;

public class validacion {
    public Scanner sc = new Scanner(System.in);
    public static int leerEntero(Scanner sc, String mensaje) {
        while (true) {
            System.out.println(mensaje);
            if (sc.hasNextInt()) { // verifica si lo ingresado es un entero válido
                int numero = sc.nextInt();
                sc.nextLine(); // limpia el bufer
                return numero;
            } else {
                System.out.println("no es valido:");
                sc.nextLine(); // descarta lo invalido y limpia el bufer :v
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = leerEntero(sc, "escribe un numero entero: ");

        System.out.println("numero valido: " + numero);
    }
}