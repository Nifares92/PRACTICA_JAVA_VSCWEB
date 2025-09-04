package MundoConjuradoPOO;

 public class Sombra extends EntidadMagica{ //CLASE DEL OBJETO, DE LA NUEVA CRERACIÓN. EXTENDS con la clase madre que es EntidadMagica, con la que comparte atributos como el nombre y el nivel de energia.

        //ATRIBUTO NUEVO DE LA SOMBRA.
        //Las sombras tienen un atributo exclusivo que es la negrura.

        private int Negrura;

        //CONSTRUCTOR DE LA SOMBRA.
        //El constructor de la sombra tiene que inicializar tanto los atributos heredados (nombre y energiaVital) como el nuevo atributo (Negrura).
        //Para inicializar los atributos heredados, tenemos que llamar al constructor de la clase padre (EntidadMagica) utilizando la palabra reservada "super".

        //El constructor de la clase padre (EntidadMagica) recibe dos parámetros: nombre y energiaVital.
        //Por lo tanto, el constructor de la clase Sombra también debe recibir esos dos parámetros, además del nuevo parámetro Negrura.

        //Por lo tanto, el constructor de la clase Sombra recibe tres parámetros: nombre, energiaVital y Negrura.

        //Dentro del constructor de la clase Sombra, llamamos al constructor de la clase padre (EntidadMagica) utilizando "super(nombre, energiaVital)".
        //Luego, inicializamos el nuevo atributo Negrura con "this.Negrura = Negrura".

        //De esta manera, cuando creamos una nueva instancia de Sombra, estamos inicializando correctamente todos los atributos necesarios.

        //Ejemplo de creación de una nueva sombra:
        //Sombra sombra1 = new Sombra("Sombra Oscura", 100, 50);
        //Esto crea una nueva sombra llamada "Sombra Oscura" con una energía vital de 100 y una negrura de 50.

        public Sombra (String nombre, int Negrura, int energiaVital){

        super (nombre, energiaVital);
        this.Negrura=Negrura;


}
      
        //Perfecto. Una de las habilidades de las sombras es la de cambiar el nombre a su antojo.
        //Como bien se dispone en uno de los códigos nomúrgicos más importantes del mundo conjurado, el "Código Nomúrgico de las Entidades Mágicas y sus Habilidades", las sombras pueden cambiar el nombre de cualquiera a su voluntad.
        //Solo hay una limitación: no pueden hacelo con las brujas. Siempre las brujas. 

        //Para ello vamos a hacer un método que cambie el nombre de una especie POR OTRO NOMBRE. será a través del método creado en EntidadMagica setcambiarNombre.

public void CambiodeNombre(EntidadMagica objetivo, String nuevoNombre){

        if (this.Negrura>100){

                objetivo.setcambiarNombre(nuevoNombre);

                


        }else {

                System.out.println("No tienes suficiente energia para cambiar el nombre!");

        }



}



}












