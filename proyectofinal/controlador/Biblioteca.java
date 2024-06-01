package controlador;
import modelo.*;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Usuario> usuarios;
    private ArrayList<Literatura> literaturas;
    private Archivo archivoUsuarios;
    private Archivo archivoLiteratura;

    public Biblioteca(){
        archivoUsuarios = new Archivo("usuarios.dat");
        archivoLiteratura = new Archivo("literatura.dat");
        
        usuarios = archivoUsuarios.leerRegistros();
        literaturas = archivoLiteratura.leerRegistros();
    }
    public void guardarRegistros() {
        archivoUsuarios.guardarRegistros(usuarios);
        archivoLiteratura.guardarRegistros(literaturas);
    }
    public void registrarUsuario(Usuario usuario){
        usuarios.add(usuario);
        guardarRegistros();
    }
    public void registrarLiteratura(Literatura literatura){
        literaturas.add(literatura);
        guardarRegistros();
    }
    public void prestamoLiteratura(){
        //String idUsuario;
        //String idLit;
    }
    public ArrayList<Usuario> getUsuario() {
        return usuarios;
    }
    public ArrayList<Literatura> getLiteratura() {
        return literaturas;
    }

}
