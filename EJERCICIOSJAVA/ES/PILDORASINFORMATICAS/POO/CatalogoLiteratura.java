package EJERCICIOSJAVA.ES.PILDORASINFORMATICAS.POO;

public class CatalogoLiteratura {

public static void main (String [] args){

//creamos un objeto de la clase Libro.

    Libro minovela=new Libro ("La casa de las cuatro rosas", "Serafín Piñeiro", 385, false);

//cuando creamos el objeto, se ejecuta el constructor.
//luego llamamos a los métodos.
//los métodos van separados por puntos.

minovela.mostrarInformacion();

minovela.marcarcomoleído();

minovela.mostrarInformacion();

//creamos otro objeto de la clase Libro.
    
    Libro segundolibro=new Libro ("La novia gitana", "Carmen Mola", 600, true);

segundolibro.mostrarInformacion();

segundolibro.esVoluminoso();

minovela.cambioautor();
    }

}
