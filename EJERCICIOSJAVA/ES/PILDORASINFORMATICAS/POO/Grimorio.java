package EJERCICIOSJAVA.ES.PILDORASINFORMATICAS.POO;

public class Grimorio {

    //ATRIBUTOS. 

    private String titulo;
    private String autor;
    private int nivelPeligro;
    private boolean sellado;

    //CONSTRUCTORES.

    public Grimorio (String titulo, String autor, int niveldepeligro){

        this.titulo=titulo;
        this.autor=autor;
        this.nivelPeligro=nivelPeligro;
        this.sellado=true;
    
    }
    //MÉTODOS.

    public String getTitulo(){

        return titulo;
    }

    public String getAutor(){

        return autor;
    }

    public int getNivelPeligro(){

        return nivelPeligro;
    }

    public boolean getEstasellado(){

        return sellado;
    }

public void setEstasellado(boolean estado){

}
    

public void getFicha(){

        if (this.sellado=false){

            System.out.println("[SELLADO]. Tratado de Escisiones\" por El Escriba Fracturado (Peligro: 8)");


        }else {

            System.out.println("[¡SUELTO!] \"Anatomía de las Sombras\" por El Nocturno (Peligro: 6)");

        }
    }

    public void mostrarEstado() {

        if (this.sellado) {

            System.out.println("[SELLADO]. Tratado de Escisiones\" por El Escriba Fracturado (Peligro: 8)");

        } else {

            System.out.println("[¡SUELTO!] \"Anatomía de las Sombras\" por El Nocturno (Peligro: 6)");

        }


    }

}






