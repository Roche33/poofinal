package modelo;

import java.io.Serializable;

public class Literatura implements Serializable{
    private String id;
    private String titulo;
    private boolean disponible;

    public Literatura(String id, String titulo){
        this.id = id;
        this.titulo = titulo;
        this.disponible = true;
    }
    public String getID(){
        return id;
    }
    public void setID(String id){
        this.id = id;
    }
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public boolean isDisponible(){
        return disponible;
    }
    public void setDisponible(boolean disponible){
        this.disponible = disponible;
    }
    
}
