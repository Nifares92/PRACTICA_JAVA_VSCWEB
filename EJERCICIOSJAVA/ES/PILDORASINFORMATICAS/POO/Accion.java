package EJERCICIOSJAVA.ES.PILDORASINFORMATICAS.POO;

public class Accion {

//Atributos. Propiedades.

                private String nombre;
                private String ticker;
                private double precioactual;
                private double cantidadposeida;

        

//Constructor.

public Accion (String nombre, String ticker, double precioactual, double cantidadposeida){

                this.nombre=nombre;
                this.ticker=ticker;
                this.precioactual=precioactual;
                this.cantidadposeida=cantidadposeida;

}

//Métodos.

public void mostrarEstado(){

System.out.println( "|" + nombre + "|" + ticker + "|" + precioactual + "|" + cantidadposeida);

}

public void actualizaPrecio (double nuevoprecio){

this.precioactual=nuevoprecio;

System.out.println ("El nuevo precio es de " + precioactual);

}

public void comprarcantidad (double nuevacantidad){

this.cantidadposeida=cantidadposeida + nuevacantidad;

}



}