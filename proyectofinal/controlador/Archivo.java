package controlador;

import java.io.*;
import java.util.ArrayList;

public class Archivo {
    private File archivo;

    public Archivo(String nombre_archivo) {
        archivo = new File(nombre_archivo);
        try {
            archivo.createNewFile();
        } catch (IOException e) {
            System.out.println("Error al crear el archivo: " + e.getMessage());
        }
    }

    public <T> ArrayList<T> leerRegistros() {
        ArrayList<T> registros = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(archivo);
            ObjectInputStream ois = new ObjectInputStream(fis);
            registros = (ArrayList<T>)ois.readObject();
            ois.close();
            fis.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (EOFException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return registros;
    }
    public <T> void guardarRegistros(ArrayList<T> registros) {
        try {
            FileOutputStream fos = new FileOutputStream(archivo);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(registros);
            oos.close();
            fos.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
