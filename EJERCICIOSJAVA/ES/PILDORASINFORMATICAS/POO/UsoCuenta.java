package EJERCICIOSJAVA.ES.PILDORASINFORMATICAS.POO;


public class UsoCuenta {

    public static void main(String[] args) {

        // 1. Creamos dos instancias (objetos) de la clase CuentaCorriente.
        // Al usar 'new', estamos llamando al constructor que programamos antes.
        
        CuentaCorriente cuenta1 = new CuentaCorriente("Serafín B.", 5000.75);
        CuentaCorriente cuenta2 = new CuentaCorriente("Lestter M.", 2500.50);

        // 2. Mostramos los datos iniciales de ambas cuentas.
        // Llamamos al método getDatosCuenta() de cada objeto.
        
        System.out.println("--- ESTADO INICIAL DE LAS CUENTAS ---");
        System.out.println(cuenta1.getDatosCuenta());
        System.out.println(cuenta2.getDatosCuenta());
        
        System.out.println("\n... Realizando transferencia de 200€ de Cuenta1 a Cuenta2 ...\n");

        // 3. Hacemos la transferencia.
        // El objeto 'cuenta1' ejecuta su método 'realizarTransferencia'
        // y le pasamos el objeto 'cuenta2' y el importe.
        
        
        
        // 4. Mostramos los datos finales para ver el resultado.
    

        System.out.println("\n--- ESTADO FINAL DE LAS CUENTAS ---");
        System.out.println(cuenta1.getDatosCuenta());
        System.out.println(cuenta2.getDatosCuenta());
    }
}