/**
 * programa que lea una frase por teclado e indique si la frase es un palíndromo o
 * no (ignorando espacios y sin diferenciar entre mayúsculas y minúsculas). Supondremos que
 * el usuario solo introducirá letras y espacios (ni comas, ni puntos, ni acentos, etc.). 
 * @author Eloy Agudo Cortés
 */

public class Strings5 {
    public static void main(String[] args) {
        System.out.println("Introduce una frase:");
        String frase = System.console().readLine();
        String fraseAdaptada = frase.replaceAll(" ","").toLowerCase();
        String fraseInvertida = new StringBuilder(fraseAdaptada).reverse().toString();
        if (fraseAdaptada.equals(fraseInvertida)) {
            System.out.println("La frase es un palíndromo.");
        } else {
            System.out.println("La frase no es un palíndromo.");
        }
    }
}
