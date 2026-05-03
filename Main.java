package contenido;

public class Investigador {
    private String nombre;
    private String especialidad;
    private String institucion;

    public Investigador(String nombre, String especialidad, String institucion) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.institucion = institucion;
    }

    public void mostrarInfo() {
        System.out.println("  Investigador: " + nombre +
                " | Especialidad: " + especialidad +
                " | Institución: " + institucion);
    }

    public String getNombre() { return nombre; }
    public String getEspecialidad() { return especialidad; }
    public String getInstitucion() { return institucion; }
}
