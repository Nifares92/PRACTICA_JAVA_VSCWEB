package MundoConjuradoPOO;

//Cuando hablamos de POO, hablamos de herencia entre clases tambien. 
//En el caso que nos ocupa, nosotros hemos creado una clase madre, sobre la creación de una o varias Entidades Magicas, pero, ¿cuales son las entidades magicas por antonomasia en el mundo conjurado? (además de los gnomos borrachos).
//Pues efectivamente, los ARCANOFAUNOS.
//En este caso vamos a crear una clase exclusiva para los arcanofaunos, pero que va a heredar los parámetros y valores atributos ya asociados a la Entidad Magica.
//Para eso utilizamos la palabra reservada "extends" (extiende de, hereda de). 

public class Arcanofauno extends EntidadMagica { //Extends significa que esta clase hereda de otra clase, en este caso de EntidadMagica.

private String clasificacionSENO;  //Este es un atributo que no teniamos en la otra clase, ya que la clasificación SENO es algo exclusivo de los Arcanofaunos.

public Arcanofauno (String nombre, int energiaVital, String clasificacionSENO){

// La primera acción SIEMPRE debe ser llamar al constructor de la clase padre
        // para que él se encargue de inicializar las propiedades que heredamos (nombre y energiaVital).
        // Para eso se usa la palabra 'super'.


super (nombre, energiaVital);
this.clasificacionSENO=clasificacionSENO;

}

public String getclasificacionSENO(){

return this.clasificacionSENO;

}



}


