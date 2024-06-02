package modelo;

import java.io.Serializable;
import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.List;

public class Usuario implements Serializable{
    private String id;
    private String nombre;
    private int edad;
    private List<Literatura> literaturaPrestada;

    public Usuario(String id, String nombre, int edad){
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.literaturaPrestada = new ArrayList<>();
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
    public List<Literatura> getLiteratura(){
        return literaturaPrestada;
    }

    public void devolverLiteratura(Literatura literatura) {
        if(literaturaPrestada.remove(literatura)){
            literatura.setDisponible(true);
        }else{
            throw new IllegalArgumentException("El libro no se encuentra en la lista de libros prestados del usuario.");
        }
    }
        
    public void prestarLiteratura(Literatura literatura){
        if(literaturaPrestada.size() < 2 && literatura.isDisponible()){
            literaturaPrestada.add(literatura);
            literatura.setDisponible(false);
        }
    }
}