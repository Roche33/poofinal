package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Usuario implements Serializable{
    private String id;
    private String nombre;
    private int edad;
    private List<Libro> librosPrestados;

    public Usuario(String id, String nombre, int edad, List<Libro> librosPrestados){
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.librosPrestados = new ArrayList<>();
    }
    public String getID(){
        return id;
    }
    public void setID(String id){
        this.id = id;
    }
    public String getNombre(){
        return nombre;
    }
    public void setAutor(String nombre){
        this.nombre = nombre;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public List<Libro> getLibro(){
        return librosPrestados;
    }
    public void prestarLibro(Libro libro){
        if(librosPrestados.size() < 2){
            librosPrestados.add(libro);
        }
    }
}