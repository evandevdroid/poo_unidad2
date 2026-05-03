package contenido;

public abstract class ContenidoAudiovisual {
    protected String titulo;
    protected int anioLanzamiento;
    protected String idioma;
    protected double duracionMinutos;

    public ContenidoAudiovisual(String titulo, int anioLanzamiento, String idioma, double duracionMinutos) {
        this.titulo = titulo;
        this.anioLanzamiento = anioLanzamiento;
        this.idioma = idioma;
        this.duracionMinutos = duracionMinutos;
    }

    public abstract void mostrarInfo();

    public String getTitulo() { return titulo; }
    public int getAnioLanzamiento() { return anioLanzamiento; }
    public String getIdioma() { return idioma; }
    public double getDuracionMinutos() { return duracionMinutos; }

    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setAnioLanzamiento(int anioLanzamiento) { this.anioLanzamiento = anioLanzamiento; }
    public void setIdioma(String idioma) { this.idioma = idioma; }
    public void setDuracionMinutos(double duracionMinutos) { this.duracionMinutos = duracionMinutos; }
}
