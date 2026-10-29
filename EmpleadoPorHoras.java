public class EmpleadoPorHoras extends Empleado {
    private int horasTrabajadas;
    private double pagoPorHora;
    public EmpleadoPorHoras(String nombre, String identificacion, int horasTrabajadas, double pagoPorHora) {
        super(nombre, identificacion, 0);
        this.horasTrabajadas = horasTrabajadas;
        this.pagoPorHora = pagoPorHora;
    }
    @Override
    public double calcularSalario() { return horasTrabajadas * pagoPorHora; }
    public void mostrarHorasTrabajadas() { System.out.println("Horas trabajadas: " + horasTrabajadas); }
}
