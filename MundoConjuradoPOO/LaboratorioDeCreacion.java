package MundoConjuradoPOO;

public class LaboratorioDeCreacion {

public static void main (String [] args){

System.out.println("--------Comencemos con la creación de especies conjuradas--------");

EntidadMagica especie1=new EntidadMagica ("Gordon el bárbarisco", 456);
EntidadMagica especie2=new EntidadMagica ("Pez de perrera", 334);
Arcanofauno especie3=new Arcanofauno ("Crispin el persistente", 900, "B");
Arcanofauno especie4=new Arcanofauno ("Dorioto", 700, "B");


System.out.println("Os presentamos a " + especie1.getNombre() + " y a " + especie2.getNombre() + ", dos especies conjuradas primigenias.");
System.out.println("La primera de ellas tiene una energía vital de " + especie1.getEnergiaVital() + " y la segunda de ellas tiene una energía vital de " + especie2.getEnergiaVital());
System.out.println("---!Oh, camarada, ¿qué ven mis ojos? Estas pequeñas criaturas quieren pelear!------");
System.out.println("---Contemplemos, pues, esta batalla tan interesante entre especies conjuradas primigenias---");
System.out.println("-------------------------------------------------------------------------");
System.out.println("Parece que el Gordón está intentando atacar al pez, y parece que lo va a conseguir...");
System.out.println(especie1.getNombre() + " acaba de realizar un ataque contra " + especie2.getNombre() + " y a utilizado un ataque de fuerza 56.");

especie2.setataquerecibido(56);

System.out.println("OHH, vaya golpe más fuerte. El nuevo nivel de energia de " + especie2.getNombre() + " es de " + especie2.getEnergiaVital());
System.out.println("-------------------------------------------------------------------------");
especie1.setaumentoenerrgia(33);

System.out.println("Pero, ¿cómooooo? Gordón el barbarisco a aumentado su energia en 33 y ahora tiene de energía vital " + especie1.getEnergiaVital());
System.out.println("¿Cómo es posible?, ¿Cómo ha ocurrido eso?");

especie2.setaumentoenerrgia(100);

especie1.setataquerecibido(200);
System.out.println("-------------------------------------------------------------------------");
System.out.println("Increíble, Pez de perrera ha aumentado su energía en 100 y ahora tiene " + especie2.getEnergiaVital() + " de energía vital.");
System.out.println("Gordón el bárbarisco ha recibido un ataque de 200 y ahora tiene " + especie1.getEnergiaVital() + " de energía vital.");

System.out.println("-------------------------------------------------------------------------");
System.out.println("Pero, ¿qué ven mis lentes de cristales mágicos encantados de 4º generación?" + "\n Acaba de aparecer un arcanofauno de calificación SENO " + especie3.getclasificacionSENO() + " y de nombre " + especie3.getNombre());




























































}


}
