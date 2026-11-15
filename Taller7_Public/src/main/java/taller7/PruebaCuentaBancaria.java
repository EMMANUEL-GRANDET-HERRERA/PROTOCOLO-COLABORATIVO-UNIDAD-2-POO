package taller7;

public class PruebaCuentaBancaria {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("12345", 500000, "Ahorros");
        cuenta.tipoCuenta = "Corriente";
        cuenta.setSaldo(650000);
        cuenta.mostrarDetalles();
    }
}
