package EJERCICIOSJAVA.ES.PILDORASINFORMATICAS.POO;

public class CatalogoLiteratura {

public static void main (String [] args){

//creamos un objeto de la clase Libro.

    Libro minovela=new Libro ("La casa de las cuatro rosas", "Serafín Piñeiro", 385, false);

    Gestordelectura lector = new Gestordelectura ("Serafin Piñeiro");


    //cuando creamos el objeto, se ejecuta el constructor.
//luego llamamos a los métodos.
//los métodos van separados por puntos.

minovela.mostrarInformacion();

lector.Iniciarlectura(minovela);

minovela.mostrarInformacion();
    
lector.finalizarLectura(minovela);

}

}
