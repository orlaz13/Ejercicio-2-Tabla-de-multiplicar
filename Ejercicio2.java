import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.print("Ingrese un numero: ");
        numero = sc.nextInt();
        int contador = 1;
        while (contador <= 12) {
            int resultado = numero * contador;
            System.out.println(numero + " x " + contador
                    + " = " + resultado);
            contador = contador + 1;
        }
        sc.close();
    }
}