package modelo;

public class Articulo extends Literatura {
    private String autor;
    private String doi;
    private String fechaPublicacion;

    public Articulo(String id, String titulo, String autor, String doi, String fechaPublicacion) {
        super(id, titulo);
        this.autor = autor;
        this.doi = doi;
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public String getDoi() {
        return doi;
    }
    public void setDoi(String doi){
        this.doi = doi;
    }
    public String getFechaPublicacion() {
        return fechaPublicacion;
    }
    public void setFechaPublicacion(String fechaPublicacion){
        this.fechaPublicacion = fechaPublicacion;
    }
}
