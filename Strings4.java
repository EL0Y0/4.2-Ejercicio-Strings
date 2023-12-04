/**
 * programa que muestre por pantalla cuantas vocales de cada tipo hay (cuantas
 * ‘a’,
 * cuantas ‘e’, etc.) en una frase introducida por teclado. No se debe
 * diferenciar entre
 * mayúsculas y minúsculas
 * 
 * @author Eloy Agudo Cortés
 */

public class Strings4 {
    public static void main(String[] args) {
        System.out.println("Introduce una frase: ");
        String frase = System.console().readLine().toLowerCase();
        int[] contadorVocales = new int[5];
        int contador = 0;
        while (contador < frase.length()) {
            char letra = frase.charAt(contador);
            switch (letra) {
                case 'a':
                    contadorVocales[0]++;
                    break;
                case 'e':
                    contadorVocales[1]++;
                    break;
                case 'i':
                    contadorVocales[2]++;
                    break;
                case 'o':
                    contadorVocales[3]++;
                    break;
                case 'u':
                    contadorVocales[4]++;
                    break;
            }
            contador++;
        }
        System.out.println("Nº de A's: " + contadorVocales[0]);
        System.out.println("Nº de E's: " + contadorVocales[1]);
        System.out.println("Nº de I's: " + contadorVocales[2]);
        System.out.println("Nº de O's: " + contadorVocales[3]);
        System.out.println("Nº de U's: " + contadorVocales[4]);
    }
}
