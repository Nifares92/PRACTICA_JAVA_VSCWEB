package MundoConjuradoPOO;


public class Mago extends EntidadMagica{

private String tipovarita;

  public Mago (String nombre, int energiaVital, String tipovarita){
      
    super (nombre, energiaVital);
      this.tipovarita=tipovarita;
  }

  @Override

public String describir(){

String descripcionPadre= super.describir();

return descripcionPadre + ("Además soy un mago con una varita de tipo " + this.tipovarita);

}

public String getVarita(){

return this.tipovarita;

}

public void setVaritacambiar(String nuevavarita){

this.tipovarita=nuevavarita;

if(nuevavarita.equalsIgnoreCase("madera de roble") || nuevavarita.equalsIgnoreCase("madera de sauce") || nuevavarita.equalsIgnoreCase("madera de cerezo")){

System.out.println("Ese tipo de varitas no está permitido para magos de nivel bajo. Por favor, elige otra varita");

}


}
}








