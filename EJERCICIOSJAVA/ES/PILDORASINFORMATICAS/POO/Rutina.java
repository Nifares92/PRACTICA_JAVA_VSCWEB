package EJERCICIOSJAVA.ES.PILDORASINFORMATICAS.POO;

public class Rutina {

    //ATRIBUTO.

    private String nombrerutina;

    //CONSTRUCTOR.

    public Rutina(String nombrerutina){

        this.nombrerutina=nombrerutina;

    }
    //MÉTODO.

    public void ejecutarEjercicio(MUSCULO musculo, int incremento){


            System.out.println("Se está ejecutando ejercicio del músculo " + musculo + " con la fuerza aumentada en " + incremento);

             musculo.aumentarfuerza(incremento);
    }

        public void finalizarDia(MUSCULO musculo){

            musculo.descansar();

        }




}
