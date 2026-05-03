package contenido;

import java.util.ArrayList;
import java.util.List;

// Composición con Temporada (las temporadas no existen sin la serie)
public class SerieDeTV extends ContenidoAudiovisual {
    private String plataforma;
    private boolean enEmision;
    private List<Temporada> temporadas; // COMPOSICIÓN

    public SerieDeTV(String titulo, int anioLanzamiento, String idioma, double duracionMinutos,
                     String plataforma, boolean enEmision) {
        super(titulo, anioLanzamiento, idioma, duracionMinutos);
        this.plataforma = plataforma;
        this.enEmision = enEmision;
        this.temporadas = new ArrayList<>();
    }

    public void agregarTemporada(Temporada temporada) {
        temporadas.add(temporada);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("=== SERIE DE TV ===");
        System.out.println("Título: " + titulo);
        System.out.println("Año: " + anioLanzamiento);
        System.out.println("Idioma: " + idioma);
        System.out.println("Duración episodio: " + duracionMinutos + " min");
        System.out.println("Plataforma: " + plataforma);
        System.out.println("En emisión: " + (enEmision ? "Sí" : "No"));
        System.out.println("Temporadas:");
        for (Temporada t : temporadas) {
            t.mostrarInfo();
        }
    }

    public String getPlataforma() { return plataforma; }
    public boolean isEnEmision() { return enEmision; }
    public List<Temporada> getTemporadas() { return temporadas; }
}
