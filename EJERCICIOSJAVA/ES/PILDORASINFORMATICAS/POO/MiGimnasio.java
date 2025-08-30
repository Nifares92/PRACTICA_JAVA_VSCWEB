package EJERCICIOSJAVA.ES.PILDORASINFORMATICAS.POO;


public class MiGimnasio {

    public static void main(String[] args) {

        // 1. Crea una instancia de Musculo para tus "Bíceps".
        MUSCULO biceps = new MUSCULO("Bíceps"); // Un solo parámetro como se pidió

        // 2. Crea una instancia de Rutina.
        Rutina diaDeBrazos = new Rutina("Día de brazos");

        // 3. Muestra el estado inicial del músculo.
        System.out.println("--- ESTADO INICIALe ---");
        System.out.println("Fuerza inicial del " + biceps.getnombre() + ": " + 10.0);

        // 4. Utiliza el objeto Rutina para ejecutar un ejercicio.
        System.out.println("\n--- COMIENZA LA RUTINA ---");
        diaDeBrazos.ejecutarEjercicio(biceps, 3);

        // 5. Entrena una segunda vez.
        diaDeBrazos.ejecutarEjercicio(biceps, 2);

        // 6. Utiliza el objeto Rutina para finalizar el día.
        System.out.println("\n--- FINALIZA LA RUTINA ---");
        diaDeBrazos.finalizarDia(biceps);
    }
}
