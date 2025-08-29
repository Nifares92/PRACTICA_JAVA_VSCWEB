package EJERCICIOSJAVA.ES.PILDORASINFORMATICAS.POO;

public class Broker {

    //ATRIBUTO.

    private String nombrebroker;

    //CONSTRUCTOR.

    public Broker (String nombrebroker){

        this.nombrebroker=nombrebroker;


    }

    //MÉTODOS.

    public void ComprarAcciones(Accion accion, int cantidad){

        accion.comprarcantidad(cantidad);   
        
        System.out.println("Has comprado " + cantidad + " acciones de " + accion + " a través del broker " + this.nombrebroker);

    }

    public void venderAcciones(Accion accion, int cantidadvendida){

        accion.comprar(-cantidad);
        
        System.out.println("Has vendido " + cantidadvendida + " acciones de " + accion);

        

    }


}
