public class Main {
    public static void main(String[] args) {
        EmpleadoTiempoCompleto empleado1 = new EmpleadoTiempoCompleto("Carlos Lopez", "EMP001", 12000, 1500);
        EmpleadoPorHoras empleado2 = new EmpleadoPorHoras("Maria Garcia", "EMP002", 80, 100);
        System.out.println("== EMPLEADO DE TIEMPO COMPLETO ==");
        empleado1.mostrarInformacion();
        empleado1.mostrarBono();
        System.out.println("\n== EMPLEADO POR HORAS ==");
        empleado2.mostrarInformacion();
        empleado2.mostrarHorasTrabajadas();
    }
}
