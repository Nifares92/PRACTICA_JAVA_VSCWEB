package MundoConjuradoPOO;

public class LaboratorioDeCreacion {

public static void main (String [] args){

System.out.println("--------Comencemos con la creación de especies conjuradas--------");

EntidadMagica especie1=new EntidadMagica ("Gordon el bárbarisco", 456);
EntidadMagica especie2=new EntidadMagica ("Pez de perrera", 334);
Arcanofauno especie3=new Arcanofauno ("Crispin el persistente", 900, "B");
Arcanofauno especie4=new Arcanofauno ("Dorioto", 700, "B");
Sombra especie5=new Sombra("osdfkjhsadhfasdfahk", 1230, 300);
Mago especie6=new  Mago ("Colorete del Marenguete", 43, "madera de fuego");

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

especie3.setCambiarenergia(734);

System.out.println("Acaba de aumentar su energia en " + especie3.getEnergiaVital() + " y se dispone a atacar al pez de perrera");

especie2.setataquerecibido(300);

System.out.println("El pobre " + especie2.getNombre() + " está que no puede con él.");
System.out.println("Su nueva energía vital es de " + especie2.getEnergiaVital());

System.out.println("--------------------[[En otro lugar. el Registro especular de energias arcanas]]--------------");
System.out.println("-Raúl, ¿qué tal las vaciones?, ¿qué tal ese crucero por pro el mar de las tinieblas en Transilvania" + "\n ¿Llegaste a conocer a Drácula?" + "\n -Pues la verdad es que no, pero me encontré con un arcanofauno de clasificación SENO " + especie4.getclasificacionSENO() + " que me dijo que te enviaba saludos. Se llama " + especie4.getNombre() + ".");
System.out.println("!Anda!, !cuanto tiempo!");

System.out.println("-Espera un momento, Raúl. ¿Has visto lo que aparecía ahí en el espejo especular cuarto?" + "\n -No, Astuco, ¿qué era?");
System.out.println("Pues que " + especie1.getNombre() + " se está enfrentando a algo extraño, algo asi como una sombra, ¿verdad?");
System.out.println("-Déjame que lo compruebe...");
System.out.println("...........");
System.out.println("...........");
System.out.println("...........");
System.out.println ("OH DIOS MIO, estamos hablando de una " + especie5.getNombre());
System.out.println ("Todos sabemos que las sombras, y más concretamente las " + especie5.getNombre() + " disponen de una energía vital de " + especie5.getEnergiaVital() + ", algo que es muy superior a la media de criaturas concjuradas, e incluso arcanofaunos, como pueden ser " + especie3.getNombre() + " y " + especie4.getNombre());

especie5.CambiodeNombre(especie3, "LolaLolita la cantaora");

System.out.println("Oh nooooooo!!! " + especie5.getNombre() + " le ha cambiado el nombre, y ahora se llama " + especie3.getNombre());

System.out.println("Buenos días compañeros, soy " + especie6.getNombre() + " y tengo una varita de " + especie6.getVarita());

especie6.setVaritacambiar("madera de roble");

System.out.println("Mi varita es " + especie6.getVarita());


// Archivo: LaboratorioDeCreacion.java (al final del main)

System.out.println("\n--- Catálogo de Entidades (Demostración de Polimorfismo) ---");

// Creamos un array del tipo PADRE.
EntidadMagica[] catalogo = new EntidadMagica[5];

// Pero dentro, podemos guardar objetos de CUALQUIERA de sus clases HIJAS.
catalogo[0] = new EntidadMagica("Esencia Pura", 100);
catalogo[1] = new Arcanofauno("Crispín el Persistente", 200, "Clase A");
catalogo[2] = new Sombra("Umbra, la Incorpórea", 150, 300); // Asumiendo que Sombra ya existe
catalogo[3]=new Mago ("Billy el colilla", 400, "madera de roble");
catalogo[4]=new Bruja ("Tatiana la desesperada", 17, 700, "Pelusilla Dracoris");

// Ahora, recorremos el catálogo y pedimos a cada entidad que se describa.
for (EntidadMagica entidadActual : catalogo) {
    // Llamamos AL MISMO MÉTODO 'describir()' en todos los objetos...
    System.out.println(entidadActual.describir());
}





































}


}
