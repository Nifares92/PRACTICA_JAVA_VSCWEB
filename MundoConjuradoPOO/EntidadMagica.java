package MundoConjuradoPOO;

public class EntidadMagica {

    //ATRIBUTOS.
private String nombre;
private int energiaVital;

    //CONSTRUCTORES.

public EntidadMagica (String nombre, int energiaVital){

this.nombre=nombre;
this.energiaVital=energiaVital;

System.out.println("Una nueva entidad mágica ha sido creada, cuyo nombre es " + this.nombre + "." + "\n Su energia vital es " + this.energiaVital);

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
   public void setCambiarenergia(int nuevaenergia){
    if(nuevaenergia>=0){
        this.energiaVital=nuevaenergia;   //Si en la clase main me dice: nuevochaman.setCambiarenergia(20), dice que la nueva energia es igual a 20 y la introduce en la propiedad energiaVital.

    }else {
          this.energiaVital = 0; // Si el valor es inválido, la energía se agota a 0.
    }
   }



}


