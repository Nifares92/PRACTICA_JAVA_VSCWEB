package EJERCICIOSJAVA;
import java.util.Scanner;

public class NumeroAleatorio {

    public static void main(String[] args) {

        // Math es con M mayúscula.
        // La variable no puede ser 'private static final' dentro de un método.
        // Se recomienda la convención camelCase: numeroAleatorio.
        int numeroAleatorio = (int) (Math.random() * 100); // Rango 0-99

        Scanner sera = new Scanner(System.in);

        System.out.println("He pensado un número entre 0 y 99. ¡Intenta adivinarlo!");
        System.out.print("Introduce un número: ");

        int numero = sera.nextInt();

        // El operador de desigualdad es !=
        // El bucle debe leer un nuevo número en cada iteración para no ser infinito.
        while (numero != numeroAleatorio) {
            System.out.println("No ha habido suerte, prueba otra vez.");
            System.out.print("Introduce otro número: ");
            numero = sera.nextInt();
        }

        // El método es println, no prinln.
        System.out.println("¡Perfecto!, has acertado. ¡Enhorabuena!");

        sera.close(); // Se debe cerrar el scanner al terminar.
    }
}

