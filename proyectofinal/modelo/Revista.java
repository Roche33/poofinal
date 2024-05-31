package modelo;

public class Revista extends Literatura{
    private String editores;
    private String editorial;
    private int volumen;

    public Revista(String id, String titulo, String editores, String editorial, int volumen) {
        super(id, titulo);
        this.editores = editores;
        this.editorial = editorial;
        this.volumen = volumen;
    }

    public String getEditores() {
        return editores;
    }
    public void setEditories(String editores){
        this.editores = editores;
    }
    public String getEditorial() {
        return editorial;
    }
    public void setEditorial(String editorial){
        this.editorial = editorial;
    }
    public int getVolumen() {
        return volumen;
    }
    public void setVolumen(int volumen){
        this.volumen = volumen;
    }
}
