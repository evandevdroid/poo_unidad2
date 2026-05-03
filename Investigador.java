package contenido;

public class Actor {
    private String nombre;
    private String nacionalidad;
    private int edad;

    public Actor(String nombre, String nacionalidad, int edad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
    }

    public void mostrarInfo() {
        System.out.println("  Actor: " + nombre + " | Nacionalidad: " + nacionalidad + " | Edad: " + edad);
    }

    public String getNombre() { return nombre; }
    public String getNacionalidad() { return nacionalidad; }
    public int getEdad() { return edad; }
}
