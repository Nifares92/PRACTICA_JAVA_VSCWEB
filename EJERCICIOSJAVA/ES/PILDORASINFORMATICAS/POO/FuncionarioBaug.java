package EJERCICIOSJAVA.ES.PILDORASINFORMATICAS.POO;

public class FuncionarioBaug {

        //ATRIBUTOS.

        private String nombre;
        private String cargo;
        private int Niveljerarquico;
        private int ExpedientesGestionados;
        private boolean reflejoEspejo;
        

    
        //CONSTRUCTORES.

public FuncionarioBaug (String nombre, String cargo, int Niveljerarquico){

this.nombre=nombre;
this.cargo=cargo;
this.Niveljerarquico=Niveljerarquico;
this.ExpedientesGestionados=0;
this.reflejoEspejo=false;

}

        //MÉTODOS.


public void gestionarExpediente(){

    this.ExpedientesGestionados++;

    System.out.println("El funcionario con nombre " + this.nombre + " ha tramitado un nuevo expediente. Total: " + this.ExpedientesGestionados);
}


 public void reflejoEspejo(){

if(this.reflejoEspejo=true){

System.out.println("El funcionario "+this.nombre+" tiene el reflejo espejo activado.");

}else {

System.out.println("El funcionario "+this.nombre+" no tiene el reflejo espejo activado.");

}

}

public void destruirReflejo(){

    if (this.reflejoEspejo==true){

        this.reflejoEspejo=false;

        System.out.println("El reflejo del espejo se ha destruido");

    }else {

        System.out.println("No hay ningún reflejo activo que destruir.");

    }

}

public void promocionar(){

if(this.Niveljerarquico<10){

    this.Niveljerarquico++;
    System.out.println("Felicidades! " + this.nombre + " Has promocionado al nivel " + this.Niveljerarquico);

    }else {
        System.out.println ("El funcionario ya está en el nivel máximo");
    }
}

public void mostrarEstado(){

System.out.println ("El funcionario " + this.nombre + " tiene el cargo de " + this.cargo + ", con el nivel " + this.Niveljerarquico + ", " + this.ExpedientesGestionados + " expedientes gestionados, y " + this.reflejoEspejo + " de reflejo en el espejo.");

}

}
