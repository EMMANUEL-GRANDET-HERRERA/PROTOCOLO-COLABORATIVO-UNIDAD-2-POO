package taller7;

public class PruebaEmpleado {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Emmanuel", 1800000);
        empleado.nombre = "Emmanuel Grandet";
        empleado.setSalario(2000000);

        System.out.println("Nombre: " + empleado.nombre);
        System.out.println("Salario: " + empleado.getSalario());
    }
}
