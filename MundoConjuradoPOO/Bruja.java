package MundoConjuradoPOO;

public class Bruja extends EntidadMagica{

private int nivelDeMagia;
private String familiarAsignado;


public Bruja (String nombre, int nivelDeMagia, int energiaVital, String familiarAsignado){


super (nombre, energiaVital);  //Primero siempre llamamos a los atributos de la clase entidad magica, es decir, de la clase padre, de quien heredamos, y después los elementos particulares. 
this.nivelDeMagia=nivelDeMagia;
this.familiarAsignado=familiarAsignado;

}

public String describir(){

String descripcionPadre= super.describir();

return descripcionPadre + ("Además soy un brujo con nivel de magia " + this.nivelDeMagia + " y mi arcanofauno familiar es " + this.familiarAsignado);


}

public void realizarAccionEspecial(){

System.out.println("Te voy a hacer un hechizo que te vas a cagar");


}
}