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
    public void eliminarUsuario(String idUsuario){
        for(Usuario u: usuarios){
            if(u.getID().equals(idUsuario)){
                usuarios.remove(u);
                break;
            }
        }
        
        guardarRegistros();
    }
    public void eliminarLiteratura(String idLiteratura){
        for(Literatura l: literaturas){
            if(l.getID().equals(idLiteratura) && l.isDisponible()){
                literaturas.remove(l);
                break;
            }
        }
        
        guardarRegistros();
    }
    public void registrarLiteratura(Literatura literatura){
        literaturas.add(literatura);
        guardarRegistros();
    }
    public Literatura buscarLiteraturaPorId(String idliteratura){
        for(Literatura l : literaturas){
            if(l.getID().equals(idliteratura)){
                return l;
            }
        }
        return null;
    }
    public Usuario buscarUsuarioPorId(String id) {
        for (Usuario u : usuarios) {
            if (u.getID().equals(id)) {
                return u;
            }
        }
        return null;
    }
    public void prestamoLiteratura(String idusuario, String idliteratura){
        Usuario usuario = buscarUsuarioPorId(idusuario);
        if (usuario == null) {
            throw new IllegalArgumentException("Usuario no encontrado.");
        }

        Literatura literatura = buscarLiteraturaPorId(idliteratura);
        if (literatura == null) {
            throw new IllegalArgumentException("Literatura no encontrada.");
        }

        if (!literatura.isDisponible()) {
            throw new IllegalArgumentException("La literatura no está disponible.");
        }
        
        if (usuario.getLiteratura().size() >= 2) {
            throw new IllegalArgumentException("El usuario ya tiene el máximo de 2 libros prestados.");
        }
        usuario.prestarLiteratura(literatura);
        

        guardarRegistros();
        //System.out.println("Préstamo realizado exitosamente.");
    }
    public ArrayList<Usuario> getUsuario() {
        return usuarios;
    }
    public ArrayList<Literatura> getLiteratura() {
        return literaturas;
    }

}
