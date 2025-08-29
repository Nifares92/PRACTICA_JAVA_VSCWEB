package EJERCICIOSJAVA.ES.PILDORASINFORMATICAS.POO;

public class Gestordelectura {

        //Atributo.
        //Primero vamos a señalar/fijar los atributos del gestor de lecturas, que solo se van a poder modificar desde esta clase.

private String nombrelector;

        //CONSTRUCTOR. Ahora vamos a por el constructor.
        //Podemos entender el constructor como el esqueleto del objeto que vamos a crear a posteriori en nuestra clase principal. En este caso, llamaremos a este constructor cuando se cumpla una condidicón: String nombrelector.

public Gestordelectura (String nombrelector){

this.nombrelector=nombrelector;

}

        // En este caso, los métodos son las acciones que llevaremos a cabo, y que interactuarán con tanto nuestra clase princpial, como el resto de clases de este código para poder generar en la principal el resultado que esperamos.

public void Iniciarlectura (Libro libro){

System.out.println("Serafín ha comenzado a leer el libro " + libro);

}

public void finalizarLectura (Libro libro){

    libro.marcarcomoleído();

    System.out.println("La lectura ha terminado. Gracias por embarcarte en este apasionante mundo de la literatura");

}


}
