package taller8;

public class PruebaHerencia {
    public static void main(String[] args) {
        Coche coche = new Coche("Toyota", 180, 4);
        coche.mostrarInformacion();

        System.out.println();

        Estudiante estudiante = new Estudiante("Emmanuel", 20, "2026001");
        estudiante.mostrarDetalles();

        System.out.println();

        Empleado empleado = new Empleado("Carlos", 2500000);
        Gerente gerente = new Gerente("Laura", 4000000, "Sistemas");
        empleado.mostrarDetalles();
        gerente.mostrarDetalles();
    }
}
