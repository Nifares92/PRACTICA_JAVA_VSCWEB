package EJERCICIOSJAVA.ES.PILDORASINFORMATICAS.POO;

import java.util.Random;

public class CuentaCorriente {

            // 1. PROPIEDADES, atributos. Están encapsuladas, son private. Solo se pueden usar desde la misma clase.

                    private double saldoinicial;

                    private String nombreTitular;

                    private long numeroCuenta; 

            // 2. CONSTRUCTOR
                // Se ejecuta al crear un objeto nuevo (new CuentaCorriente(...)).
                // Su misión es establecer el estado inicial de la cuenta.  

public CuentaCorriente(String nombreTitular, double saldoinicial){

this.nombreTitular = nombreTitular;
this.saldoinicial = saldoinicial;

            //Para generar un número de cuenta aleatorio entre 1 y 100.
            //Importamos la clase Random.
            //Creamos un objeto de la clase Random.
            //Usamos el método nextInt(100) para generar un número aleatorio entre 0 y 99.
            //Sumamos 1 para que el rango sea entre 1 y 100.

Random generador = new Random();
int numeroCuenta = generador.nextInt(100) + 1;

this.numeroCuenta = numeroCuenta; //Asignamos el número de cuenta generado aleatoriamente a la propiedad numeroCuenta.

}
            // 3. MÉTODOS (Comportamientos).
                    
                //3.1.a SETTER para hacer INGRESOS, modificar el saldo.
 
public void setIngreso(double cantidad) {
        if (cantidad > 0) {
            this.saldoinicial += cantidad; // Es lo mismo que saldo = saldo + cantidad
            System.out.println("INFO: Ingreso de " + cantidad + "€ realizado con éxito.");
        } else {
            System.out.println("ERROR: La cantidad a ingresar debe ser positiva.");
        }
    }

                //3.1.b. SETTER para hacer REINTEGROS (modifica el saldo)

public void setReintegro(double cantidad) {
        if (cantidad > 0 && this.saldoinicial >= cantidad) {
            this.saldoinicial -= cantidad; // Es lo mismo que saldo = saldo - cantidad
            System.out.println("INFO: Reintegro de " + cantidad + "€ realizado con éxito.");
        } else {
            System.out.println("ERROR: No es posible retirar " + cantidad + "€. Saldo insuficiente o cantidad inválida.");
        }
    }

                //3.2.a GETTER para OBTENER el saldo  

public String getSaldo() {
        return "El saldo actual de la cuenta es: " + String.format("%.2f", saldoinicial) + "€";
    }

                //3.2.b GETTER para obtener todos los datos de la cuenta
    
public String getDatosCuenta() {
        return "----------------------------------" +
               "\nTitular: " + this.nombreTitular +
               "\nNº Cuenta: " + this.numeroCuenta +
               "\nSaldo: " + String.format("%.2f", this.saldoinicial) + "€" +
               "\n----------------------------------";
    }


}



