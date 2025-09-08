package MundoConjuradoPOO;

public abstract class EntidadMagica {

    //ATRIBUTOS.
private String nombre;
private int energiaVital;

    //CONSTRUCTORES.

public EntidadMagica (String nombre, int energiaVital){

this.nombre=nombre;
this.energiaVital=energiaVital;

}               

//MÉTODOS PÚBLICOS. EL ACCESO CONTROLADO.

            //SETTER Y GETTER. DIFERENCIA: EL SETTER MODIFICA EL VALOR DE UN ATRIBUTO, EL GETTER DEVUELVE EL VALOR DE UN ATRIBUTO.
            //Estas son las únicas puertas para interactuar con las propiedades privadas, con los atributos.
        
// GETTER para el nombre (Permite LEER el nombre desde fuera).
    public String getNombre() {
        return this.nombre;
    }

// GETTER para la energía (Permite LEER la energía desde fuera).
    public int getEnergiaVital() {
        return this.energiaVital;
    }
        //¿Qué significa esto que acabamos de ver?: 
        // Que aunque las propiedades sean privadas, podemos acceder a ellas de forma controlada mediante métodos públicos.
        // Esto permite proteger la integridad de los datos y controlar cómo se accede y modifica la información.
      
// SETTER para la energía (Permite MODIFICAR la energía con reglas).
//En este supuesto, lo que hace es cambiar la energia de una especie por alguna razón.Pero este cambio la vamos a efectuar nosotros directamente en la clase principal.


   public void setCambiarenergia(int nuevaenergia){
    if(nuevaenergia>0){
        this.energiaVital=nuevaenergia;   //Si en la clase main me dice: nuevochaman.setCambiarenergia(20), dice que la nueva energia es igual a 20 y la introduce en la propiedad energiaVital.

    }else {
        
        this.energiaVital=0;
    
    }
   }
    //En este caso, he creado un método que hace lo siguiente: cuando en la clase principal una especie ataca a la otra, va a utilizar una intensidad (ataque) que va a afectar dorectamente a la energiaVital del oponente.
    //Asi, lo que hace es que la energiaVital que tenía hasta ese momento se ve afectada y se reduce en la intensidad del ataque. 

   public void setataquerecibido (int ataque) {

    this.energiaVital=energiaVital - ataque;


}

public void setaumentoenerrgia (int aumento){
    this.energiaVital=energiaVital + aumento;
}


//Lo que estamos creando en este caso es el METODO de la habilidad de SOMBRA.
//Es decir, las sombras tienen la habilidad de cambiar el nombre de cualquier criatura a su antojo (menos a las brujas, que siempre son las brujas).
//pARA ELLO UTILIZAREMOS ESTE SETTER, QUE LO QUE HARÁ SERÁ CAMBIAR EL NOMBRE DE LA ESPECIE POR OTRO QUE LE DIGAMOS.

public void setcambiarNombre(String nuevoNombre) {
   
    this.nombre = nuevoNombre;
}

public String describir(){

return ("Soy " + this.nombre + " y tengo de energía vital " + this.energiaVital);


}


// Este método no tiene cuerpo {}, solo la declaración.
// Obliga a todas las clases hijas a tener esta habilidad.
public abstract void realizarAccionEspecial();


}


