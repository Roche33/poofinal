package modelo;

public class Libro extends Literatura{
    private String autor;
    private String isbn;
    private String genero;
    private String editorial;
    
    public Libro(String id,String titulo, String autor, String isbn, String genero, String editorial){
        super(id,titulo);
        this.autor = autor;
        this.isbn = isbn;
        this.genero = genero;
        this.editorial = editorial;
    }
    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public String getISBN(){
        return isbn;
    }
    public void setISBN(String isbn){
        this.isbn = isbn;
    }
    public String getGenero(){
        return genero;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    public String getEditorial(){
        return editorial;
    }
    public void setEditorial(String editorial){
        this.editorial = editorial;
    }
}
