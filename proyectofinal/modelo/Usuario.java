package modelo;

import java.io.Serializable;
//import java.util.ArrayList;
import java.util.List;

public class Usuario implements Serializable{
    private String id;
    private String nombre;
    private int edad;
    private List<Literatura> librosPrestados;

    public Usuario(String id, String nombre, int edad){
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
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
    public List<Literatura> getLibro(){
        return librosPrestados;
    }
    public void prestarLibro(Literatura literatura){
        if(librosPrestados.size() < 2){
            librosPrestados.add(literatura);
        }
    }
}