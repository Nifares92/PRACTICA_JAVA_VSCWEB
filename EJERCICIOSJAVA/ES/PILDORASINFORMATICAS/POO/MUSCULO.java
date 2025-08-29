package EJERCICIOSJAVA.ES.PILDORASINFORMATICAS.POO;

public class MUSCULO {

//INDICIE: ATRIBUTOS, CONSTRUCTORES Y MÉTODOS.

    //ATRIBUTOS.
    private String nombremusculo;
    private double fuerzamusculo;

    //CONSTRUCTORES:

    public MUSCULO (String nombremusculo){

        this.nombremusculo=nombremusculo;
        this.fuerzamusculo=10.0;

    }

    //MÉTODOS.

    public void Entrenar (){

        System.out.println("Perfecto, has comenzado el entrenamiento de " + nombremusculo);

    }

    public void aumentarfuerza(int aumentar){

        this.fuerzamusculo=fuerzamusculo + aumentar;

        System.out.println ("Muy bien, la fuerza actual del músculo es " + this.fuerzamusculo);

    }

    public void descansar (){

    this.fuerzamusculo=fuerzamusculo*0.10;
    
        }


public String getnombre(){

return this.nombremusculo;

}




}





