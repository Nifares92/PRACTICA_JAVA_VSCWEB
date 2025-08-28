package EJERCICIOSJAVA.ES.PILDORASINFORMATICAS.POO;

public class Libro {

        //PROPIEDADES.
            
            private String Título;
            private String autor;
            private int páginas;
            private boolean leído;
    
        //CONSTRUCTOR.

    public Libro(String título, String autor, int páginas, boolean leído){

        this.Título=título;
        this.autor=autor;
        this.páginas=páginas;
        this.leído=leído;

    }
        //MÉTODOS.

public void mostrarInformacion(){

System.out.println("El título del libro es: " + Título);
System.out.println("El autor del libro es: " + autor);
System.out.println("El libro tiene: " + páginas + " páginas");
if (leído){
    System.out.println("El libro ya ha sido leído");
        }else{
        System.out.println("El libro no ha sido leído");
} 

    }

    public void marcarcomoleído(){

        leído=true;

        System.out.println("El libro ha sido marcado como leído");

    }

    public boolean esVoluminoso(){

        if (páginas>500){

           return true;

        } else {

                return false;
        }



    }

    public void cambioautor(){

        if (autor.equalsIgnoreCase("Carmen Mola")){

            autor="Agustín Martínez";

            System.out.println("El autor real de este libro es: " + autor);

        } else {

            System.out.println("El autor de este libro no ha cambiado");

        }


    }

}
