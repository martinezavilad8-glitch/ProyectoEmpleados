public class Empleado {
    protected String nombre;
    protected String identificacion;
    protected double salarioBase;

    public Empleado(String nombre, String identificacion, double salarioBase) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.salarioBase = salarioBase;
    }
    public double calcularSalario() { return salarioBase; }
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", ID: " + identificacion + ", Salario: $" + calcularSalario());
    }
}



