/**
 * programa que pida una cadena de texto por teclado y luego muestre cada palabra
 * de la cadena en una línea distinta.
 * @author Eloy Agudo Cortés
 */

public class Strings1 {
    public static void main(String[] args) {
        System.out.println("Introduce una frase");
        String[] palabras = System.console().readLine().split(" ");
        System.out.println("");
        int contador=0;
        while (contador<palabras.length) {
            System.out.println(palabras[contador]);
            contador++;
        }
    }
}
