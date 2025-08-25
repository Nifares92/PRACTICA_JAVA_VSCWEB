package EJERCICIOSJAVA.ES.PILDORASINFORMATICAS.POO;

public class USOvehiculos {              //Esta será considerada como la clase principal, es decir, la que tiene el método main.-
                                        //PERO la clase que construye nuestro vehiculos la creamos aparte. 
                                        //Esta es la que va a tener el método main. la calse Vehciulos no tendrá el método main. ya que en java solo una clase podrá tener el método main.
                                        //Estamos estudiando POO en java.
                                        //En las clases no vamos a poder usar nada que se haya declarado como private en otra clase, pero si vamos a poder usar todo lo que se haya declarado como public.
                                        //Para poder usar lo que se haya declarado como private en otra clase, tenemos que usar los métodos getters y setters.
                            
          

    public static void main (String [] args){

Vehiculos miCoche=new Vehiculos(4); //Creamos un objeto de la clase Vehiculos. //acabamos de INSTANCIAR,HEMOS INSTANCIDADO la clase Vehiculos.
                            //miCoche es el nombre del objeto. Podría ser cualquier otro nombre.
                            //new es una palabra reservada que se usa para crear objetos.
                            //Vehiculos() es el constructor de la clase Vehiculos. Es decir, el método que tiene el mismo nombre que la clase.
                            //Cuando creamos un objeto, se ejecuta el constructor de la clase. Por lo tanto, se establece el estado inicial del objeto.
                            //El estado inicial del objeto se establece a través de las propiedades o campos de clase que hemos definido en la clase Vehiculos.
                            //Estas propiedades están encapsuladas, es decir, solo son accesibles desde la misma clase.
                            //Para poder modificar el color, hemos creado un método setter que modifica la propiedad color.
                            //Para poder acceder al color, hemos creado un método getter que devuelve el valor de la propiedad color.                  


      //¿Cómo accedemos al método perteneciente a un objeto? 
      //Si quiero ver qué color tiene el coche, tengo que usar el método getter.

      miCoche.setColor("verde"); //Usamos el método setter para cambiar el color del coche.
                            //Dentro de los paréntesis del método setter, le pasamos el valor que queremos que tenga la propiedad color.
                            //En este caso, le pasamos el valor "verde".
                            //El método setter no devuelve nada, simplemente cambia el valor de la propiedad color.
      
      System.out.println(miCoche.getColor()); //No puedo acceder directamente a la propiedad color, ya que está encapsulada.
                            //Por lo tanto, tengo que usar el método getter para acceder al color.
                            //El método getter devuelve el valor de la propiedad color.
                            //Pero si quiero ver el valor del color, tengo que imprimirlo por pantalla.


                            //Si le damos al system.out.prinln cuando en el interior está el getColor, vemos que el resultado es "sin color". Porque ese es el estado inicial que le hemos dado al coche en el constructor de la clase Vehiculos.
                            //Si quiero cambiar el color del coche, tengo que usar el método setter. Esto es: public static void main .... Vehiculos miCoche=new.Vehiculos(); miCoche.setColor(); sysout.println(miCoche.getColor());
   
   
Vehiculos miCoche2=new Vehiculos(4); //Creamos otra instancia de la clase Vehiculos.
   
miCoche2.setColor("rojo"); //Cambiamos el color del segundo coche a rojo.
   
               System.out.print(miCoche2.getColor()); //Imprimimos el color del segundo coche.  }


Vehiculos moto1=new Vehiculos(2); //Creamos una nueva instancia de la clase Vehiculos. moto1.
   

   
System.out.println(miCoche.getDatovehiculo()); //Imprimimos los datos del primer coche.
System.out.println(moto1.getDatovehiculo()); //Imprimimos los datos de la moto.
   
   
    }







}

//RESUMEN//

//Por lo tanto, para recapitular. Tenemos una clase que se llama Vehiculos. Esta clase tiene un método constructor que tiene el mismo nombre que la clase. Este método constructor establece un estado inicial a los objetos que se creen de esta clase.
//Este estado inicial lo establece a través de unas propiedades o campos de clase que hemos definido.
//Estas propiedades están encapsuladas, es decir, solo son accesibles desde la misma clase.
//Para poder modificar el color, hemos creado un método setter que modifica la propiedad color.
//Para poder acceder al color, hemos creado un método getter que devuelve el valor de la propiedad color.
//Ahora, para crear objetos de esta clase, tenemos que ir a la clase principal que es la que tiene el método main. En este caso, la clase USOvehiculos.



//Ahora vamos a ver el PASO DE PARÁMETROS. ESTO ES, CÓMO HACER QUE UN MÉTODO RECIBA UN VALOR DESDE FUERA DEL MÉTODO.
//Hemos creado una nueva instancia de la clase Vehiculos. miCoche2.
//Hemos cambiado el color del segundo coche a rojo.
//Hemos imprimido el color del segundo coche.
//Hemos visto que cada objeto tiene su propio estado. El primer coche es verde y el segundo coche es rojo.
//Cada objeto tiene su propio estado porque cada objeto es una instancia diferente.