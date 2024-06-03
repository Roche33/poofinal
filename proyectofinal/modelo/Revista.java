package modelo;

public class Revista extends Literatura{
    private String editores;
    private String editorial;
    private String volumen;

    public Revista(String id, String titulo, String editores, String editorial, String volumen) {
        super(id, titulo);
        this.editores = editores;
        this.editorial = editorial;
        this.volumen = volumen;
    }

    public String getEditores() {
        return editores;
    }
    public void setEditores(String editores){
        this.editores = editores;
    }
    public String getEditorial() {
        return editorial;
    }
    public void setEditorial(String editorial){
        this.editorial = editorial;
    }
    public String getVolumen() {
        return volumen;
    }
    public void setVolumen(String volumen){
        this.volumen = volumen;
    }
}
