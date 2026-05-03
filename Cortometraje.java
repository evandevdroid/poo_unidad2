package contenido;

import java.util.ArrayList;
import java.util.List;

// Hereda de ContenidoAudiovisual
// Agregación con Actor (los actores pueden existir sin la película)
public class Pelicula extends ContenidoAudiovisual {
    private String genero;
    private String director;
    private List<Actor> actores; // AGREGACIÓN

    public Pelicula(String titulo, int anioLanzamiento, String idioma, double duracionMinutos,
                    String genero, String director) {
        super(titulo, anioLanzamiento, idioma, duracionMinutos);
        this.genero = genero;
        this.director = director;
        this.actores = new ArrayList<>();
    }

    public void agregarActor(Actor actor) {
        actores.add(actor);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("=== PELÍCULA ===");
        System.out.println("Título: " + titulo);
        System.out.println("Año: " + anioLanzamiento);
        System.out.println("Idioma: " + idioma);
        System.out.println("Duración: " + duracionMinutos + " min");
        System.out.println("Género: " + genero);
        System.out.println("Director: " + director);
        System.out.println("Actores:");
        for (Actor a : actores) {
            a.mostrarInfo();
        }
    }

    public String getGenero() { return genero; }
    public String getDirector() { return director; }
    public List<Actor> getActores() { return actores; }
}
