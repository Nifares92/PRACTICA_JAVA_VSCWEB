package MundoConjuradoPOO;

public class EscenadeBatalla {

public void iniciarcombate(EntidadMagica luchador1, EntidadMagica luchador2){

System.out.println("-------- Comienza la batalla entre " + luchador1.getNombre() + " y " + luchador2.getNombre() + ".");
System.out.println("Os informamos que " +luchador1.getNombre() + " tiene una energía vital de " + luchador1.getEnergiaVital() + "\n Por su parte, el " + luchador2.getNombre() + " tiene una energía vital de " + luchador2.getEnergiaVital());

System.out.println("!Qué comience la batalla!");

luchador1.setataquerecibido(32);

System.out.println("!Oh dios mio!, el " + luchador1.getNombre() + " ha recibido un ataque de " + luchador2.getNombre() + " con fuerza 32 " + " y ahora su energía vital es de " + luchador1.getEnergiaVital()); 

// Turno 2: Luchador 2 responde
        if (luchador2.getEnergiaVital() > 0) {
            System.out.println(luchador2.getNombre() + " responde con furia...");
            luchador2.realizarAccionEspecial();
           
        }

        // Resultado final
        System.out.println("\n--- RESULTADO FINAL ---");
        System.out.println(luchador1.getNombre() + " termina con " + luchador1.getEnergiaVital() + " de energía.");
        System.out.println(luchador2.getNombre() + " termina con " + luchador2.getEnergiaVital() + " de energía.");
    }
}





