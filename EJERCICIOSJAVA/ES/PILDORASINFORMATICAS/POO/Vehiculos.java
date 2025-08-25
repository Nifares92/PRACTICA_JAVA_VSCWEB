package EJERCICIOSJAVA.ES.PILDORASINFORMATICAS.POO;

public class Vehiculos {

                    //1. Primero tenemos que construir un método constructor. Tiene que: llevar el mismo nombre que la clase

public Vehiculos (int ruedas){  //1.Método CONSTRUCTOR DE LA CLASE. Mismo nombre que la clase. 

                        //2.Aqui, en este constructor, debemos dar un estado inicial. pero para poder darselo, necesitamos que esta clase que va a construcir objetos tenga porpiedades o tambien llamados campos de clase.
                        //2. En este caso, ¿que propiedades debe o puede tener un vehiculo?(*)

                        //3. Ahora establezco cuál es el estado inicial que va a tener un vehículo.

    
    this.ruedas=ruedas;              //El número de ruedas del vehículo va a ser igual al parámetro que reciba el constructor.
                                    //this es una palabra reservada que se usa para referirse a la propiedad de la clase.
                                    //ruedas es la propiedad de la clase.
                                    //ruedas es el parámetro que recibe el constructor.
                                    //ruedas es una variable local que solo existe dentro del constructor.
                                    //this.ruedas se refiere a la propiedad de la clase, mientras que ruedas se refiere al parámetro que recibe el constructor.
    
    
                               //******todos los vehiculos van a tener 4 ruedas.
    color="sin color";                          //todos los vehiculos van a ser sin color.
    largo=2.5;                                      //todos los vehiculos van a medir 2.5 metros de largo.
    ancho=1.5;                                          //todos los vehiculos van a medir 1.5 metros de ancho.
    peso=500;                                                       //todos los vehiculos van a pesar 500 kilos.

                        //3. Para poder cambiar el color, vamos a crear un método de acceso. Necesito crear un método que acceda a la propiedad color para modificarla. 
                        //3.Hablamos de un método SETTER. Por convención, el nombre del método empieza por set y luego el nombre de la propiedad a la que accede.

}
                        //3.void porque no devuelve nada. Solo camabia el color a los vehiculos, simplemente lo va a cambiar.

public void setColor(String colorVEHICULO){ //EN LOS PARENTESIS LE VAMOS A DECIR QUE VA A RECIBIR UN MÉTODO O PARÁMETRO. //Este método no devuelve nada, solo cambia el color del vehiculo. 

                                            //Hay que distinguir entre la propiedad color y el parámetro que recibe el método que también se llama color.
                                            //Para distinguir entre la propiedad color y el parámetro que recibe el método, vamos a llamar al parámetro colorVEHICULO.
                                            //colorVEHICULO es una variable local que solo existe dentro del método setColor.
                                            //color es la propiedad de la clase.
                                            //Ahora bien, cuando se llaman de la misma manera, es cuando entra en juego la palabra reservada this.
                                            //this.color se refiere a la propiedad de la clase, mientras que colorVEHICULO se refiere al parámetro que recibe el método.

 color=colorVEHICULO;               //El color del vehiculo va a ser igual al parámetro que reciba el método.;
                                    //color es verde porque el parámetro que recibe el método es verde.
                                    //color es la propiedad de la clase.
                                    //colorVEHICULO es el parámetro que recibe el método.
                                    //colorVEHICULO es una variable local que solo existe dentro del método setColor
}

                                //4. Los métodos que devuelven el valor de una propiedad se llaman GETTERS. Por convención, el nómbre del método empieza por get y luego el nombre de la propiedad a la que accede.

public String getColor(){

return color;                       //5. devuelve el color del vehiculo.
}
                        //2.(*)ENCAPSULACIÓN. encapsular un método o propiedad para que solo sea accesioble desde la misma clase.
                        //2.(*)Vamos a fijar los métodos o propiedades al final del código. Daría igual si los ponemos al principio, pero es una buena práctica ponerlos al final.


public String getDatovehiculo(){



return "Tu vehiculo tiene " + ruedas + " ruedas. Mide " + largo + " metros de largo, " + ancho + " metros de ancho y pesa " + peso + " kilos." ;

} 

//¿Por qué private? Porque no quiero que nadie pueda acceder a estas propiedades desde fuera de la clase. Solo quiero que se pueda acceder a ellas desde dentro de la clase.
//Esto es lo que se llama encapsulación. Encapsular un método o propiedad para que solo sea accesioble desde la misma clase.
//Si no ponemos private, las propiedades serían accesibles desde fuera de la clase. Y eso no es lo que queremos.

 private int ruedas;

private String color;

private double largo;

private double ancho;

private double peso;


}

//RESUMEN//

//Por lo tanto, para recapitular. Tenemos una clase que se llama Vehiculos. Esta clase tiene un método constructor que tiene el mismo nombre que la clase. Este método constructor establece un estado inicial a los objetos que se creen de esta clase.
//Este estado inicial lo establece a través de unas propiedades o campos de clase que hemos definido.
//Estas propiedades están encapsuladas, es decir, solo son accesibles desde la misma clase.
//Para poder modificar el color, hemos creado un método setter que modifica la propiedad color.
//Para poder acceder al color, hemos creado un método getter que devuelve el valor de la propiedad color.
//Ahora, para crear objetos de esta clase, tenemos que ir a la clase principal que es la que tiene el método main. En este caso, la clase USOvehiculos.