package MundoConjuradoPOO;

public class LaboratorioDeCreacion {

public static void main (String [] args){

System.out.println("--------Comencemos con la creación de especies conjuradas--------");

EntidadMagica especie1=new EntidadMagica ("Gordon el bárbarisco", 456);
EntidadMagica especie2=new EntidadMagica ("Pez de perrera", 334);

System.out.println("La primera criatura se llama " +especie1.getNombre() + "\n Tiene un nivel de magia " + especie1.getEnergiaVital());
System.out.println("La segunda criatura se llama " + especie2.getNombre() + "\n Tiene un nivel de magia " + especie2.getEnergiaVital());

System.out.println("---!Oh, camarada, ¿qué ven mis ojos? Estas pequeñas criaturas quieren pelear!------");
System.out.println("---Contemplemos, pues, esta batalla tan interesante entre especies conjuradas primigenias---");
System.out.println("Parece que el Gordón está intentando atacar al pez, y parece que lo va a conseguir...");

especie2.getNuevodano(10);

System.out.println("OHH, vaya golpe más fuerte. El nuevo nivel de energia de " + especie2.getNombre() + " es de " + especie2.nuev);

especie1.setCambiarenergia(466);

System.out.println("Pero, ¿cómooooo? Gordón el barbarisco a aumentado su energia en 33 y ha dejado a Pez KAO.");

}


}
