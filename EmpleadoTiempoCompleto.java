public class EmpleadoTiempoCompleto extends Empleado {
    private double bono;
    public EmpleadoTiempoCompleto(String nombre, String identificacion, double salarioBase, double bono) {
        super(nombre, identificacion, salarioBase);
        this.bono = bono;
    }
    @Override
    public double calcularSalario() { return salarioBase + bono; }
    public void mostrarBono() { System.out.println("Bono: $" + bono); }
}
