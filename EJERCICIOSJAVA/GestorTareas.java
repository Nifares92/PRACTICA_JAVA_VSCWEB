package EJERCICIOSJAVA;

import java.util.ArrayList;
import java.util.Scanner;

public class GestorTareas {

    public static void main(String[] args) {
    
        ArrayList<String> tareas = new ArrayList<>(); // Usamos un ArrayList para guardar las tareas como texto.
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        System.out.println("¡Bienvenido a tu Gestor de Tareas!");

        // Este bucle se ejecutará hasta que el usuario elija la opción de salir.
        while (!salir) {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Ver tareas");
            System.out.println("2. Añadir tarea");
            System.out.println("3. Eliminar tarea");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // ¡Importante! Consume el salto de línea que deja nextInt()

            switch (opcion) {
                case 1: // Ver tareas
                    System.out.println("\n--- TUS TAREAS ---");
                    if (tareas.isEmpty()) {
                        System.out.println("No tienes tareas pendientes.");
                    } else {
                        for (int i = 0; i < tareas.size(); i++) {
                            // Mostramos el número de tarea (i+1) y la descripción
                            System.out.println((i + 1) + ". " + tareas.get(i));
                        }
                    }
                    break;
                case 2: // Añadir tarea
                    System.out.print("Escribe la nueva tarea: ");
                    String nuevaTarea = scanner.nextLine();
                    tareas.add(nuevaTarea);
                    System.out.println("¡Tarea añadida con éxito!");
                    break;
                case 3: // Eliminar tarea
                    System.out.println("\n--- ELIMINAR TAREA ---");
                    if (tareas.isEmpty()) {
                        System.out.println("No hay tareas para eliminar.");
                    } else {
                        // Mostramos la lista para que el usuario elija
                        for (int i = 0; i < tareas.size(); i++) {
                            System.out.println((i + 1) + ". " + tareas.get(i));
                        }
                        System.out.print("Introduce el número de la tarea que quieres eliminar: ");
                        int numeroTarea = scanner.nextInt();
                        scanner.nextLine(); // Consumir el salto de línea

                        // Validamos que el número esté en el rango correcto
                        if (numeroTarea > 0 && numeroTarea <= tareas.size()) {
                            // Restamos 1 porque los usuarios ven 1,2,3... pero la lista usa 0,1,2...
                            tareas.remove(numeroTarea - 1);
                            System.out.println("Tarea eliminada con éxito.");
                        } else {
                            System.out.println("Número de tarea no válido.");
                        }
                    }
                    break;
                case 4: // Salir
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige un número del 1 al 4.");
                    break;
            }
        }

        System.out.println("¡Hasta pronto!");
        scanner.close();
    }
}


