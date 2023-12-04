/**
 * programa que pida dos cadenas de texto por teclado y luego indique si son iguales,
 * además de si son iguales sin diferenciar entre mayúsculas y minúsculas.
 * @author Eloy Agudo COrtés
 */
public class Strings2 {
    public static void main(String[] args) {
        System.out.println("Introduce una frase.");
        String frase1 = System.console().readLine();
        System.out.println("Introduce otra frase.");
        String frase2 = System.console().readLine();
        if (frase1.equalsIgnoreCase(frase2)) {
            System.out.println("Las frases son iguales.");

        } else {
            System.out.println("Las frases no son iguales.");
        }

    }
    
}
