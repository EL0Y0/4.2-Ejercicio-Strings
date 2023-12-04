/**
 * programa que pida por teclado tres cadenas de texto: nombre y dos apellidos. Luego
 * mostrará un código de usuario (en mayúsculas) formado por la concatenación de las tres
 * primeras letras de cada uno de ellos.
 * @author Eloy Agudo Cortés
 */
public class Strings3 {
    public static void main(String[] args) {
        System.out.println("Introduce el nombre: ");
        String nombre = System.console().readLine();
        System.out.println("Introduce el primer apellido: ");
        String primerApellido = System.console().readLine();
        System.out.println("Introduce el segundo apellido: ");
        String segundoApellido = System.console().readLine();
        String codigo = nombre.substring(0,3).toUpperCase() + primerApellido.substring(0,3).toUpperCase() + segundoApellido.substring(0,3).toUpperCase();
        System.out.println("");
        System.out.println("Código de usuario: " + codigo);
    }
}
