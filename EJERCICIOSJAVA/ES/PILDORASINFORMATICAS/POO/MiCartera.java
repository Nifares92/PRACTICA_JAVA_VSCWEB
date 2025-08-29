package EJERCICIOSJAVA.ES.PILDORASINFORMATICAS.POO;

public class MiCartera {

    //Instanciamos un OBJETO.
public static void main (String [] args){

Accion miETF=new Accion ("Microsoft", "MSFT", 280.50, 150);

Broker miBroker=new Broker ("Lolito");

miETF.mostrarEstado();

miETF.actualizaPrecio(92.50);

miETF.mostrarEstado();

miETF.comprarcantidad(050);

miETF.mostrarEstado();

miBroker.ComprarAcciones(miETF, 10);

miETF.mostrarEstado();

miBroker.venderAcciones(miETF, 3);

miETF.mostrarEstado();

}


}
