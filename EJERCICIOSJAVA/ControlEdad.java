package EJERCICIOSJAVA;

import java.util.Scanner;
// No es necesario importar IntegerSyntax, no se utiliza.

public class ControlEdad {

    public static void main(String[] args) {

        Scanner sera = new Scanner(System.in);

        System.out.println("Introduce tu nombre, por favor");
        String nombre = sera.nextLine();

        System.out.println("Muy bien " + nombre + ", ahora introduce tu edad");

        // Es mejor usar un bucle while para asegurarse de que el usuario introduce un número.
        while (!sera.hasNextInt()) {
            System.out.println("Por favor, introduce una edad válida (un número).");
            sera.next(); // Limpia el buffer del scanner para evitar un bucle infinito.
        }
        int edad = sera.nextInt();

        // Las condiciones if/else if deben usar el operador AND (&&) para definir un rango.
        // Con OR (||), la condición casi siempre sería verdadera.
        if (edad >= 0 && edad <= 12) {
            System.out.println("Eres un niño.");
        } else if (edad >= 13 && edad <= 17) {
            System.out.println("Eres un adolescente.");
        } else if (edad >= 18 && edad <= 65) {
            System.out.println("Eres un adulto.");
        } else if (edad > 65) {
            System.out.println("Eres un adulto mayor.");
        } else {
            // Añadimos un caso para edades negativas.
            System.out.println("La edad no puede ser negativa.");
        }

        sera.close(); // Es una buena práctica cerrar el Scanner cuando ya no se necesita.
    }
}




