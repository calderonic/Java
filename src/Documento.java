public class Documento {

    private String titulo;
    private String cuerpoDocumento;


    public Documento(String titulo, String cuerpoDocumento) {
        this.titulo = titulo;
        this.cuerpoDocumento = cuerpoDocumento;

    }

    public String getTitulo() {
        return titulo;
    }

    public String getCuerpoDocumento() {
        return cuerpoDocumento;
    }
}
