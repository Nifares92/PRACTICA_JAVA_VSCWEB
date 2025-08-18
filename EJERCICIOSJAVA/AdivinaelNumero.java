package EJERCICIOSJAVA;

import java.util.Scanner;

public class AdivinaelNumero {

public static void main (String [] args){

    Scanner sera = new Scanner(System.in);

    // Para hacerlo más interesante, podríamos usar un número aleatorio.
    // Por ahora, mantenemos el número fijo.
    int numeromagico = 34;
    int intentos = 1; // Empezamos en 1 porque el primer intento ya cuenta.

    System.out.println("He pensado un número. ¡A ver si lo adivinas!");
    System.out.print("Introduce un número, por favor: ");

    int numeroelegido = sera.nextInt();

    // El bucle se ejecutará mientras el número elegido no sea el correcto.
    while (numeroelegido != numeromagico) {

        if (numeroelegido < numeromagico) {
            System.out.println("Lo siento, no has acertado. El número mágico es MAYOR.");
        } else {
            System.out.println("Lo siento, no has acertado. El número mágico es MENOR.");
        }

        // ¡Esta es la parte clave! Pedimos un nuevo número DENTRO del bucle.
        System.out.print("Inténtalo de nuevo: ");
        numeroelegido = sera.nextInt();
        intentos++; // Incrementamos el contador en cada nuevo intento.
    }

    // Este mensaje solo se muestra cuando se sale del bucle (al acertar).
    System.out.println("¡Perfecto, has acertado el número mágico! Has necesitado " + intentos + " intentos.");

    sera.close(); // Buena práctica: cerrar el Scanner al finalizar.
}
}
