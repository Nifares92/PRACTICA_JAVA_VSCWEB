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

// La anotación @Override es una pista para Java. Le dice:
// "Mi intención es sobrescribir un método de mi padre. Si me equivoco en el nombre
// o los parámetros, avísame con un error". Es una buena práctica de seguridad.
@Override

public String describir() {
    // Primero, llamamos al método 'describir' del padre para reutilizar la descripción base.
    String descripcionPadre = super.describir();

    // Y luego, le añadimos la información específica del Arcanofauno.
    return descripcionPadre + " Además, soy un Arcanofauno de clasificación SENO: " + getclasificacionSENO() + ".";
}

public void realizarAccionEspecial(){

System.out.println("¿Alguien sabe qué hora es?");


}


}


