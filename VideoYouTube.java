package contenido;

// Subclase iniciativa del estudiante - hereda de ContenidoAudiovisual
public class Cortometraje extends ContenidoAudiovisual {
    private String director;
    private String festivalesGanados;
    private boolean esAnimado;
    private String productora;

    public Cortometraje(String titulo, int anioLanzamiento, String idioma, double duracionMinutos,
                        String director, String festivalesGanados, boolean esAnimado, String productora) {
        super(titulo, anioLanzamiento, idioma, duracionMinutos);
        this.director = director;
        this.festivalesGanados = festivalesGanados;
        this.esAnimado = esAnimado;
        this.productora = productora;
    }

    public void participarEnFestival(String festival) {
        System.out.println("El cortometraje '" + titulo + "' participó en: " + festival);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("=== CORTOMETRAJE ===");
        System.out.println("Título: " + titulo);
        System.out.println("Año: " + anioLanzamiento);
        System.out.println("Idioma: " + idioma);
        System.out.println("Duración: " + duracionMinutos + " min");
        System.out.println("Director: " + director);
        System.out.println("Festivales ganados: " + festivalesGanados);
        System.out.println("Animado: " + (esAnimado ? "Sí" : "No"));
        System.out.println("Productora: " + productora);
    }

    public String getDirector() { return director; }
    public String getFestivalesGanados() { return festivalesGanados; }
    public boolean isEsAnimado() { return esAnimado; }
    public String getProductora() { return productora; }
}
