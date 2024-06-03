package vista;
import modelo.*;
import controlador.*;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interfaz {
    private Biblioteca biblioteca = new Biblioteca();
    
    public Interfaz(){
        JButton altas;
        JButton prestamos;
        JButton devolver;
        JButton consulta;
        JButton modificar;
        JButton eliminar;
        JButton salir;

        JFrame frame = new JFrame();
        frame.setTitle("Biblioteca");
        frame.setSize(700,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.GRAY);

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 400, 400);
        panel.setBackground(Color.GRAY);
        panel.setLayout(null);


        altas = new JButton("Altas");
        altas.setBounds(10, 10, 100, 25);
        altas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                altas();
            }
        });
        
        
        prestamos =  new JButton("Prestamos");
        prestamos.setBounds(10, 40, 100, 25);
        prestamos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                prestamos();
            }
        });
        devolver =  new JButton("Devolver");
        devolver.setBounds(10, 70, 100, 25);
        devolver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                devolver();
            }
        });
        consulta =  new JButton("Consulta");
        consulta.setBounds(10, 100, 100, 25);
        consulta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                consulta();
            }
        });
        modificar =  new JButton("Modificar");
        modificar.setBounds(10, 130, 100, 25);
        modificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modificar();
            }
        });
        eliminar =  new JButton("Eliminar");
        eliminar.setBounds(10, 160, 100, 25);
        eliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eliminar();
            }
        });
        salir =  new JButton("Salir");
        salir.setBounds(10, 190, 100, 25);
        salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                System.exit(0);
            }
        });

        panel.add(altas);
        panel.add(prestamos);
        panel.add(devolver);
        panel.add(consulta);
        panel.add(modificar);
        panel.add(eliminar);
        panel.add(salir);
        
        frame.add(panel);
        frame.setVisible(true);
    }
    public void altas(){
        
        JFrame frame = new JFrame();
        frame.setTitle("Altas");
        frame.setSize(700,600);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setResizable(true);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.GRAY);

        JButton usuario =  new JButton("Usuario");
        usuario.setBounds(10, 160, 100, 25);
        usuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                altaUsuario();
            }
        });
        JButton literatura =  new JButton("Literatura");
        literatura.setBounds(10, 190, 100, 25);
        literatura.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                altaLiteratura();
            }
        });
        frame.add(usuario);
        frame.add(literatura);
        frame.setVisible(true);
    }
    public void altaUsuario(){
        JFrame frame = new JFrame();
        frame.setTitle("Alta Usuario");
        frame.setSize(700,600);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setResizable(true);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.GRAY);

        JLabel id = new JLabel("ID Usuario:");
        id.setBounds(10, 10,70,20);
        JTextField campoID = new JTextField();
        campoID.setBounds(150, 10,100,20);

        JLabel nombre = new JLabel("Nombre:");
        nombre.setBounds(10, 50,130,20);
        JTextField camponombre = new JTextField();
        camponombre.setBounds(150, 50,100,20);

        JLabel edad = new JLabel("Edad:");
        edad.setBounds(10, 90,130,20);
        JTextField campoedad = new JTextField();
        campoedad.setBounds(150, 90,100,20);


        JButton bGuardar =  new JButton("Guardar");
        bGuardar.setBounds(10, 170, 100, 25);
        bGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String id = campoID.getText();
                    if (id.isEmpty()){
                        throw new StringVacioExcepcion("El nombre no puede estar vacio");
                    }
                    String nombre = camponombre.getText();
                    if (nombre.isEmpty()){
                        throw new StringVacioExcepcion("El nombre no puede estar vacio");
                    }
                    int edad = Integer.parseInt(campoedad.getText());
        
                    Usuario usuario = new Usuario(id, nombre, edad);
                    biblioteca.registrarUsuario(usuario);
        
                    campoID.setText("");
                    camponombre.setText("");
                    campoedad.setText("");
                    frame.dispose();
        
                } catch (IllegalArgumentException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }catch(StringVacioExcepcion ex){
                    JOptionPane.showMessageDialog(null, "Quedo un campo sin rellenar", "Error", JOptionPane.ERROR_MESSAGE);
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Quedo un campo sin rellenar", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        frame.add(id);
        frame.add(campoID);
        frame.add(nombre);
        frame.add(camponombre);
        frame.add(edad);
        frame.add(campoedad);
        frame.add(bGuardar);

        frame.setVisible(true);
    }
    public void altaLiteratura(){
        JFrame frame = new JFrame();
        frame.setTitle("Altas Literatura");
        frame.setSize(700,600);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setResizable(true);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.GRAY);

        JButton libro =  new JButton("Libro");
        libro.setBounds(10, 150, 100, 25);
        libro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                altaLibro();
            }
        });
        JButton revista =  new JButton("Revista");
        revista.setBounds(10, 180, 100, 25);
        revista.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                altaRevista();
            }
        });
        JButton articulo =  new JButton("Articulo");
        articulo.setBounds(10, 210, 100, 25);
        articulo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                altaArticulo();
            }
        });
        frame.add(libro);
        frame.add(revista);
        frame.add(articulo);
        frame.setVisible(true);
    }
    public void altaLibro(){
        JFrame frame = new JFrame();

        frame.setTitle("Alta Libro");
        frame.setSize(700,600);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setResizable(true);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.GRAY);

        JLabel id = new JLabel("ID del libro:");
        id.setBounds(10, 10,70,20);
        JTextField campoID = new JTextField();
        campoID.setBounds(150, 10,100,20);

        JLabel titulo = new JLabel("Titulo:");
        titulo.setBounds(10, 50,130,20);
        JTextField campotitulo = new JTextField();
        campotitulo.setBounds(150, 50,100,20);

        JLabel autor = new JLabel("Autor:");
        autor.setBounds(10, 90,130,20);
        JTextField campoautor = new JTextField();
        campoautor.setBounds(150, 90,100,20);

        JLabel isbn = new JLabel("ISBN:");
        isbn.setBounds(10, 130,130,20);
        JTextField campoisbn = new JTextField();
        campoisbn.setBounds(150, 130,100,20);

        JLabel genero = new JLabel("Genero:");
        genero.setBounds(10, 170,130,20);
        JTextField campogenero = new JTextField();
        campogenero.setBounds(150, 170,100,20);
        
        JLabel editorial = new JLabel("Editorial:");
        editorial.setBounds(10, 210,130,20);
        JTextField campoeditorial = new JTextField();
        campoeditorial.setBounds(150, 210,100,20);

        JButton bGuardar =  new JButton("Guardar");
        bGuardar.setBounds(10, 290, 100, 25);
        bGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String id = campoID.getText();
                    if (id.isEmpty()){
                        throw new StringVacioExcepcion("No se registro algun dato");
                    }
                    String titulo = campotitulo.getText();
                    if (titulo.isEmpty()){
                        throw new StringVacioExcepcion("No se registro algun dato");
                    }
                    String autor = campoautor.getText();
                    if (autor.isEmpty()){
                        throw new StringVacioExcepcion("No se registro algun dato");
                    }
                    String isbn = campoisbn.getText();
                    if (isbn.isEmpty()){
                        throw new StringVacioExcepcion("No se registro algun dato");
                    }
                    String genero = campogenero.getText();
                    if (genero.isEmpty()){
                        throw new StringVacioExcepcion("No se registro algun dato");
                    }
                    String editorial = campoeditorial.getText();
                    if (editorial.isEmpty()){
                        throw new StringVacioExcepcion("No se registro algun dato");
                    }
        
                    Libro libro = new Libro( id, titulo,  autor,  isbn,  genero,  editorial);
                    biblioteca.registrarLiteratura(libro);
        
                    campoID.setText("");
                    campotitulo.setText("");
                    campoautor.setText("");
                    campoisbn.setText("");
                    campogenero.setText("");
                    campoeditorial.setText("");
                    frame.dispose();
        
                } catch (IllegalArgumentException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }catch(StringVacioExcepcion ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        frame.add(id);
        frame.add(campoID);
        frame.add(titulo);
        frame.add(campotitulo);
        frame.add(autor);
        frame.add(campoautor);
        frame.add(isbn);
        frame.add(campoisbn);
        frame.add(genero);
        frame.add(campogenero);
        frame.add(editorial);
        frame.add(campoeditorial);
        frame.add(bGuardar);

        frame.setVisible(true);
    }

    public void altaRevista(){
        JFrame frame = new JFrame();

        frame.setTitle("Alta Revista");
        frame.setSize(700,600);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setResizable(true);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.GRAY);

        JLabel id = new JLabel("ID de la Revista:");
        id.setBounds(10, 10,70,20);
        JTextField campoID = new JTextField();
        campoID.setBounds(150, 10,100,20);

        JLabel titulo = new JLabel("Titulo:");
        titulo.setBounds(10, 50,130,20);
        JTextField campotitulo = new JTextField();
        campotitulo.setBounds(150, 50,100,20);

        JLabel editores = new JLabel("Editores:");
        editores.setBounds(10, 90,130,20);
        JTextField campoeditores = new JTextField();
        campoeditores.setBounds(150, 90,100,20);

        JLabel editorial = new JLabel("Editorial:");
        editorial.setBounds(10, 130,130,20);
        JTextField campoeditorial = new JTextField();
        campoeditorial.setBounds(150, 130,100,20);

        JLabel volumen = new JLabel("Volumen:");
        volumen.setBounds(10, 170,130,20);
        JTextField campovolumen = new JTextField();
        campovolumen.setBounds(150, 170,100,20);

        JButton bGuardar =  new JButton("Guardar");
        bGuardar.setBounds(10, 250, 100, 25);
        bGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String id = campoID.getText();
                    if (id.isEmpty()){
                        throw new StringVacioExcepcion("No se registro algun dato");
                    }
                    String titulo = campotitulo.getText();
                    if (titulo.isEmpty()){
                        throw new StringVacioExcepcion("No se registro algun dato");
                    }
                    String editores = campoeditores.getText();
                    if (editores.isEmpty()){
                        throw new StringVacioExcepcion("No se registro algun dato");
                    }
                    String editorial = campoeditorial.getText();
                    if (editorial.isEmpty()){
                        throw new StringVacioExcepcion("No se registro algun dato");
                    }
                    String volumen = campovolumen.getText();
                    if (volumen.isEmpty()){
                        throw new StringVacioExcepcion("No se registro algun dato");
                    }
                    if (volumen.matches("[a-zA-Z]+")){
                        throw new Exception("No se registro algun dato");
                    }
                    
        
                    Revista revista = new Revista( id, titulo, editores, editorial, volumen);
                    biblioteca.registrarLiteratura(revista);
        
                    campoID.setText("");
                    campotitulo.setText("");
                    campoeditores.setText("");
                    campoeditorial.setText("");
                    campovolumen.setText("");
                    
                    frame.dispose();
        
                } catch (IllegalArgumentException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }catch (StringVacioExcepcion ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        frame.add(id);
        frame.add(campoID);
        frame.add(titulo);
        frame.add(campotitulo);
        frame.add(editores);
        frame.add(campoeditores);
        frame.add(editorial);
        frame.add(campoeditorial);
        frame.add(volumen);
        frame.add(campovolumen);
        frame.add(bGuardar);


        frame.setVisible(true);
    }

    public void altaArticulo(){
        JFrame frame = new JFrame();

        frame.setTitle("Alta Articulo");
        frame.setSize(700,600);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setResizable(true);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.GRAY);

        JLabel id = new JLabel("ID de la Revista:");
        id.setBounds(10, 10,70,20);
        JTextField campoID = new JTextField();
        campoID.setBounds(150, 10,100,20);

        JLabel titulo = new JLabel("Titulo:");
        titulo.setBounds(10, 50,130,20);
        JTextField campotitulo = new JTextField();
        campotitulo.setBounds(150, 50,100,20);

        JLabel autor = new JLabel("Autor:");
        autor.setBounds(10, 90,130,20);
        JTextField campoautor = new JTextField();
        campoautor.setBounds(150, 90,100,20);

        JLabel doi = new JLabel("DOI:");
        doi.setBounds(10, 130,130,20);
        JTextField campodoi = new JTextField();
        campodoi.setBounds(150, 130,100,20);

        JLabel fecha = new JLabel("Fecha:");
        fecha.setBounds(10, 170,130,20);
        JTextField campofecha = new JTextField();
        campofecha.setBounds(150, 170,100,20);

        JButton bGuardar =  new JButton("Guardar");
        bGuardar.setBounds(10, 250, 100, 25);
        bGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String id = campoID.getText();
                    if (id.isEmpty()){
                        throw new StringVacioExcepcion("No se registro algun dato");
                    }
                    String titulo = campotitulo.getText();
                    if (titulo.isEmpty()){
                        throw new StringVacioExcepcion("No se registro algun dato");
                    }
                    String autor = campoautor.getText();
                    if (autor.isEmpty()){
                        throw new StringVacioExcepcion("No se registro algun dato");
                    }
                    String doi = campodoi.getText();
                    if (doi.isEmpty()){
                        throw new StringVacioExcepcion("No se registro algun dato");
                    }
                    String fecha = campofecha.getText();
                    if (fecha.isEmpty()){
                        throw new StringVacioExcepcion("No se registro algun dato");
                    }
                    
        
                    Articulo articulo = new Articulo( id, titulo, autor, doi, fecha);
                    biblioteca.registrarLiteratura(articulo);
        
                    campoID.setText("");
                    campotitulo.setText("");
                    campoautor.setText("");
                    campodoi.setText("");
                    campofecha.setText("");
                    
                    frame.dispose();
        
                } catch (IllegalArgumentException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }catch(StringVacioExcepcion ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        frame.add(id);
        frame.add(campoID);
        frame.add(titulo);
        frame.add(campotitulo);
        frame.add(autor);
        frame.add(campoautor);
        frame.add(doi);
        frame.add(campodoi);
        frame.add(fecha);
        frame.add(campofecha);
        frame.add(bGuardar);

        frame.setVisible(true);
    }

    public void prestamos(){
        JFrame frame = new JFrame();

        frame.setTitle("Prestamos");
        frame.setSize(700,600);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setResizable(true);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.GRAY);

        JLabel idusuario = new JLabel("ID Usuario:");
        idusuario.setBounds(10, 10,70,20);
        JTextField campoID = new JTextField();
        campoID.setBounds(150, 10,100,20);

        JLabel idliteratura = new JLabel("ID Literatura:");
        idliteratura.setBounds(10, 50,130,20);
        JTextField campoliteratura = new JTextField();
        campoliteratura.setBounds(150, 50,100,20);

        JButton bPrestar =  new JButton("Prestar");
        bPrestar.setBounds(10, 250, 100, 25);
        bPrestar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String idusuario = campoID.getText();
                    String idliteratura = campoliteratura.getText();

                    biblioteca.prestamoLiteratura(idusuario,idliteratura);
                    JOptionPane.showMessageDialog(frame, "Préstamo realizado.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                    frame.dispose();
                }catch(IllegalArgumentException ex){
                    JOptionPane.showMessageDialog(frame, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "Ha ocurrido un error inesperado.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        frame.add(idusuario);
        frame.add(campoID);
        frame.add(idliteratura);
        frame.add(campoliteratura);
        frame.add(bPrestar);

        frame.setVisible(true);
    }
    public void devolver(){
        JFrame frame = new JFrame();

        frame.setTitle("Devolver");
        frame.setSize(700,600);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setResizable(true);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.GRAY);

        JLabel idusuario = new JLabel("ID Usuario:");
        idusuario.setBounds(10, 10,70,20);
        JTextField campoID = new JTextField();
        campoID.setBounds(200, 10,100,20);

        JLabel idliteratura = new JLabel("ID Literatura a regresar:");
        idliteratura.setBounds(10, 50,180,20);
        JTextField campoliteratura = new JTextField();
        campoliteratura.setBounds(200, 50,100,20);

        JButton bDevolver =  new JButton("Devolver");
        bDevolver.setBounds(10, 250, 100, 25);
        bDevolver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String idusuario = campoID.getText();
                    String idliteratura = campoliteratura.getText();

                    biblioteca.devolverLiteratura(idusuario,idliteratura);
                    JOptionPane.showMessageDialog(frame, "Literatura devuelta.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                    frame.dispose();
                }catch(IllegalArgumentException ex){
                    JOptionPane.showMessageDialog(frame, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "Ha ocurrido un error inesperado.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        frame.add(idusuario);
        frame.add(campoID);
        frame.add(idliteratura);
        frame.add(campoliteratura);
        frame.add(bDevolver);
        frame.setVisible(true);
    }
    public void consulta(){
        JFrame frame = new JFrame();
        frame.setTitle("Consulta");
        frame.setSize(700,600);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setResizable(true);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.GRAY);

        JButton mUsuario =  new JButton("Mostrar Usuarios");
        mUsuario.setBounds(10, 120, 160, 25);
        mUsuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarUsuario();
            }
        });
        JButton mLiteratura =  new JButton("Mostrar Literatura");
        mLiteratura.setBounds(10, 150, 160, 25);
        mLiteratura.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarLiteratura();
            }
        });
        JButton bUsuario =  new JButton("Buscar Usuario");
        bUsuario.setBounds(10, 180, 160, 25);
        bUsuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buscarUsuario();
            }
        });
        JButton bLiteratura =  new JButton("Buscar Literatura");
        bLiteratura.setBounds(10, 210, 160, 25);
        bLiteratura.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buscarLiteratura();
            }
        });
        frame.add(mUsuario);
        frame.add(mLiteratura);
        frame.add(bUsuario);
        frame.add(bLiteratura);
        frame.setVisible(true);
    }
    public void mostrarUsuario(){
        JFrame dataFrame = new JFrame("Usuarios Registrados");
        dataFrame.setSize(700, 600);
        dataFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        dataFrame.setResizable(true);
        dataFrame.setLayout(new BorderLayout());
        dataFrame.getContentPane().setBackground(Color.GRAY);

        DefaultTableModel tablaModelo = new DefaultTableModel(new String[]{"ID", "Nombre", "Edad", "Libros Prestados"}, 0);
        JTable usuariosTabla = new JTable(tablaModelo);
        JScrollPane scrollPane = new JScrollPane(usuariosTabla);
        dataFrame.add(scrollPane, BorderLayout.CENTER);

        for (Usuario u : biblioteca.getUsuario()) {
            StringBuilder librosPrestados = new StringBuilder();
            for (Literatura l : u.getLiteratura()) {
                librosPrestados.append(l.getTitulo()).append(", ");
            }
            if (librosPrestados.length() > 0) {
                librosPrestados.setLength(librosPrestados.length() - 2);
            }
            tablaModelo.addRow(new Object[]{u.getID(), u.getNombre(), u.getEdad(), librosPrestados.toString()});
        }

        dataFrame.setVisible(true);

    }
    public void mostrarLiteratura(){
        JFrame frame = new JFrame("Literatura Registrada");
        frame.setSize(700, 600);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setResizable(true);
        frame.setLayout(new GridLayout(3,1));
        frame.getContentPane().setBackground(Color.GRAY);

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.RED);
        panel1.setBounds(0, 0, 700, 200);
        DefaultTableModel tablaModeloLibro = new DefaultTableModel(new String[]{"ID", "Titulo", "Autor", "ISBN", "Genero","Editorial","Disponible"}, 0);
        JTable tablaLibro = new JTable(tablaModeloLibro);
        JScrollPane scrollPaneLibro = new JScrollPane(tablaLibro);
        panel1.add(scrollPaneLibro, BorderLayout.NORTH);
        for (Literatura l : biblioteca.getLiteratura()) {
            if ( l instanceof Libro){
                Libro libro = (Libro) l;
                tablaModeloLibro.addRow(new Object[]{libro.getID(), libro.getTitulo(), libro.getAutor(), libro.getISBN(), libro.getGenero(), libro.getEditorial(), libro.isDisponible()});
            }
        }
        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.GRAY);
        panel2.setBounds(0, 200, 700, 200);
        DefaultTableModel tablaModeloRevista = new DefaultTableModel(new String[]{"ID", "Titulo", "Editores", "Editorial", "Volumen","Disponible"}, 0);
        JTable tablaRevista = new JTable(tablaModeloRevista);
        JScrollPane scrollPaneRevista = new JScrollPane(tablaRevista);
        panel2.add(scrollPaneRevista, BorderLayout.CENTER);
        for (Literatura l : biblioteca.getLiteratura()) {
            if ( l instanceof Revista){
                Revista revista = (Revista) l;
                tablaModeloRevista.addRow(new Object[]{revista.getID(), revista.getTitulo(), revista.getEditores(), revista.getEditorial(), revista.getVolumen(), revista.isDisponible()});
            }
        }
        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.BLUE);
        panel3.setBounds(0, 400, 700, 200);
        DefaultTableModel tablaModeloArticulo = new DefaultTableModel(new String[]{"ID", "Titulo", "Autor", "DOI", "Fecha","Disponible"}, 0);
        JTable tablaArticulo = new JTable(tablaModeloArticulo);
        JScrollPane scrollPaneArticulo = new JScrollPane(tablaArticulo);
        panel3.add(scrollPaneArticulo, BorderLayout.SOUTH);
        for (Literatura l : biblioteca.getLiteratura()) {
            if ( l instanceof Articulo){
                Articulo articulo = (Articulo) l;
                tablaModeloArticulo.addRow(new Object[]{articulo.getID(), articulo.getTitulo(), articulo.getAutor(), articulo.getDoi(), articulo.getFechaPublicacion(), articulo.isDisponible()});
            }
        }
        
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        frame.setVisible(true);
    }
    public void buscarUsuario(){
        JFrame frame = new JFrame();

        frame.setTitle("Buscar Usuario");
        frame.setSize(700,600);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setResizable(true);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.GRAY);

        JLabel nUsuario = new JLabel("Nombre Usuario:");
        nUsuario.setBounds(10, 10,150,20);
        JTextField campoNombre = new JTextField();
        campoNombre.setBounds(180, 10,200,20);

        JButton bUsuario =  new JButton("Buscar");
        bUsuario.setBounds(10, 50, 100, 25);
        bUsuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String nombre = campoNombre.getText();
                    if (nombre.isEmpty()){
                        throw new StringVacioExcepcion("No se registro el nombre");
                    }
                    List<Usuario> usuariosEncontrados = biblioteca.buscarPorNombre(nombre);

                    DefaultTableModel tableModel = new DefaultTableModel(new String[]{"ID", "Nombre", "Edad", "Libros Prestados"}, 0);
                    JTable usuarioTable = new JTable(tableModel);
                    JScrollPane scrollPane = new JScrollPane(usuarioTable);
                    scrollPane.setBounds(10, 90, 680, 200); 

                    for (Usuario u : usuariosEncontrados) {
                        StringBuilder librosPrestados = new StringBuilder();
                        for (Literatura l : u.getLiteratura()) {
                            librosPrestados.append(l.getTitulo()).append(", ");
                        }
                        if (librosPrestados.length() > 0) {
                            librosPrestados.setLength(librosPrestados.length() - 2); 
                        }
                        tableModel.addRow(new Object[]{u.getID(), u.getNombre(), u.getEdad(), librosPrestados.toString()});
                    }
                    frame.getContentPane().removeAll(); 
                    frame.getContentPane().add(scrollPane);
                    frame.revalidate(); 
                    frame.repaint(); 

                }catch(StringVacioExcepcion ex){
                    JOptionPane.showMessageDialog(frame, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        frame.add(nUsuario);
        frame.add(campoNombre);
        frame.add(bUsuario);
        frame.setVisible(true);
    }
    public void buscarLiteratura(){
        JFrame frame = new JFrame();
       
        frame.setTitle("Buscar Literatura");
        frame.setSize(700,600);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setResizable(true);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.GRAY);

        JLabel nLiteratura = new JLabel("Titulo de la literatura:");
        nLiteratura.setBounds(10, 10,150,20);
        JTextField campoLiteratura = new JTextField();
        campoLiteratura.setBounds(180, 10,200,20);

        JButton bLiteratura =  new JButton("Buscar");
        bLiteratura.setBounds(10, 50, 100, 25);
        bLiteratura.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    
                    String titulo = campoLiteratura.getText();
                    if (titulo.isEmpty()){
                        throw new StringVacioExcepcion("No se registro el titulo");
                    }
                    List<Literatura> literaturaEncontrada = biblioteca.buscarPorTituloLiteratura(titulo);
                    if (literaturaEncontrada.isEmpty()){
                        throw new Exception("No se encontro el titulo en la base de datos.");
                    }
                    DefaultTableModel tablaModeloLibro = new DefaultTableModel(new String[]{"ID", "Titulo", "Autor", "ISBN","Genero","Editorial","Disponibilidad"}, 0);
                    JTable libroTabla = new JTable(tablaModeloLibro);
                    JScrollPane scrollPaneLibro = new JScrollPane(libroTabla);
                    scrollPaneLibro.setBounds(10, 0, 680, 180);

                    for (Literatura libros : literaturaEncontrada) {
                        if ( libros instanceof Libro){
                            Libro libro = (Libro) libros;
                            tablaModeloLibro.addRow(new Object[]{libro.getID(), libro.getTitulo(), libro.getAutor(), libro.getISBN(), libro.getGenero(), libro.getEditorial(), libro.isDisponible()});
                        }
                    }

                    DefaultTableModel tablaModeloRevista = new DefaultTableModel(new String[]{"ID", "Titulo", "Editores", "Editorial","Volumen","Disponibilidad"}, 0);
                    JTable revistaTabla = new JTable(tablaModeloRevista);
                    JScrollPane scrollPaneRevista = new JScrollPane(revistaTabla);
                    scrollPaneRevista.setBounds(10, 190, 680, 180); 
                    for (Literatura revistas : literaturaEncontrada) {
                        if ( revistas instanceof Revista){
                            Revista revista = (Revista) revistas;
                            tablaModeloRevista.addRow(new Object[]{revista.getID(), revista.getTitulo(), revista.getEditores(), revista.getEditorial(), revista.getVolumen(), revista.isDisponible()});
                        }
                    }

                    DefaultTableModel tablaModeloArticulo = new DefaultTableModel(new String[]{"ID", "Titulo", "Autor", "DOI","Fecha de publicacion","Disponibilidad"}, 0);
                    JTable articuloTabla = new JTable(tablaModeloArticulo);
                    JScrollPane scrollPaneArticulo = new JScrollPane(articuloTabla);
                    scrollPaneArticulo.setBounds(10, 380, 680, 180); 
                    for (Literatura articulos : literaturaEncontrada) {
                        if ( articulos instanceof Articulo){
                            Articulo articulo = (Articulo) articulos;
                            tablaModeloArticulo.addRow(new Object[]{articulo.getID(), articulo.getTitulo(), articulo.getAutor(), articulo.getDoi(), articulo.getFechaPublicacion(), articulo.isDisponible()});
                        }
                    }

                    frame.getContentPane().removeAll(); 
                    frame.getContentPane().add(scrollPaneLibro);
                    frame.getContentPane().add(scrollPaneRevista);
                    frame.getContentPane().add(scrollPaneArticulo); 
                    frame.revalidate(); 
                    frame.repaint();  

                }catch(StringVacioExcepcion ex){
                    JOptionPane.showMessageDialog(frame, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(frame, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        frame.add(nLiteratura);
        frame.add(campoLiteratura);
        frame.add(bLiteratura);
        frame.setVisible(true);
    }

    public void modificar(){
        JFrame frame = new JFrame();

        frame.setTitle("Modificar");
        frame.setSize(700,600);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setResizable(true);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.GRAY);

        JLabel idliteratura = new JLabel("ID Literatura a modificar:");
        idliteratura.setBounds(10, 40,180,20);
        JTextField campoliteratura = new JTextField();
        campoliteratura.setBounds(200, 40,100,20);

        JButton bModificar =  new JButton("Modificar");
        bModificar.setBounds(10, 80, 100, 25);
        bModificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String idliteratura = campoliteratura.getText();
                    Literatura literatura = biblioteca.buscarLiteraturaPorId(idliteratura);

                    if (literatura == null) {
                        JOptionPane.showMessageDialog(frame, "Literatura no encontrada.", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    if (!literatura.isDisponible()) {
                        JOptionPane.showMessageDialog(frame, "La literatura está en préstamo y no puede ser modificada.", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    frame.getContentPane().removeAll();
                    frame.revalidate();
                    frame.repaint();

                    JLabel datosActuales = new JLabel("Datos actuales:");
                    datosActuales.setBounds(10, 10,150,20);

                    JLabel cid = new JLabel("ID: ");
                    cid.setBounds(10, 30,100,20);
                    JTextField id = new JTextField(literatura.getID());
                    id.setBounds(150, 30,150,20);
                    id.setEditable(false);

                    JLabel ctitulo = new JLabel("Titulo: ");
                    ctitulo.setBounds(10, 50,100,20);
                    JTextField titulo = new JTextField(literatura.getTitulo());
                    titulo.setBounds(150, 50,150,20);

                    frame.add(cid);
                    frame.add(ctitulo);
                    frame.add(datosActuales);
                    frame.add(id);
                    frame.add(titulo);

                    JTextField autor = new JTextField();
                    JTextField isbn = new JTextField();
                    JTextField genero = new JTextField();
                    JTextField editorial = new JTextField();
                    JTextField editores = new JTextField();
                    JTextField volumen = new JTextField();
                    JTextField cdoi = new JTextField();
                    JTextField cfecha = new JTextField();
                    
                    if(literatura instanceof Libro){

                        JLabel cautor = new JLabel("Autor: ");
                        cautor.setBounds(10, 70,100,20);
                        autor = new JTextField(((Libro)literatura).getAutor());
                        autor.setBounds(150, 70,150,20);
                        String autors = autor.getText();
                        if (autors.isEmpty()){
                            throw new StringVacioExcepcion("No se registro algun dato");
                        }

                        JLabel cisbn = new JLabel("ISBN: ");
                        cisbn.setBounds(10, 90,100,20);
                        isbn = new JTextField(((Libro)literatura).getISBN());
                        isbn.setBounds(150, 90,150,20);
                        String isbns = isbn.getText();
                        if (isbns.isEmpty()){
                            throw new StringVacioExcepcion("No se registro algun dato");
                        }
                        
                        JLabel cgenero = new JLabel("Genero: ");
                        cgenero.setBounds(10, 110,100,20);
                        genero = new JTextField(((Libro)literatura).getGenero());
                        genero.setBounds(150, 110,150,20);
                        String generos = genero.getText();
                        if (generos.isEmpty()){
                            throw new StringVacioExcepcion("No se registro algun dato");
                        }

                        JLabel ceditorial = new JLabel("Editorial: ");
                        ceditorial.setBounds(10, 130,100,20);
                        editorial = new JTextField(((Libro)literatura).getEditorial());
                        editorial.setBounds(150, 130,150,20);
                        String editorials = editorial.getText();
                        if (editorials.isEmpty()){
                            throw new StringVacioExcepcion("No se registro algun dato");
                        }

                        JButton bGuardar =  new JButton("Guardar");
                        bGuardar.setBounds(10, 290, 100, 25);
                        bGuardar.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                try {
                                    literatura.setTitulo(titulo.getText());
                                    
                                    ((Libro) literatura).setAutor(autors);
                                    ((Libro) literatura).setISBN(isbns);
                                    ((Libro) literatura).setGenero(generos);
                                    ((Libro) literatura).setEditorial(editorials);
                                    biblioteca.actualizarLiteratura(literatura);
                                    frame.dispose();
                                }catch(Exception ex){
                                    JOptionPane.showMessageDialog(frame, "Error al guardar la literatura modificada.", "Error", JOptionPane.ERROR_MESSAGE);
                                }//catch(StringVacioExcepcion ex){
                                    //JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                                //}
                            }
                        });
                        
                        frame.add(autor);
                        frame.add(isbn);
                        frame.add(genero);
                        frame.add(editorial);
                        frame.add(cautor);
                        frame.add(cisbn);
                        frame.add(cgenero);
                        frame.add(ceditorial);
                        frame.add(bGuardar);
                        
                    }else if(literatura instanceof Revista){

                        JLabel ceditores = new JLabel("Editores: ");
                        ceditores.setBounds(10, 70,100,20);
                        editores = new JTextField(((Revista)literatura).getEditores());
                        editores.setBounds(150, 70,150,20);
                        String editoress = editores.getText();

                        JLabel ceditorial = new JLabel("Editorial: ");
                        ceditorial.setBounds(10, 90,100,20);
                        editorial = new JTextField(((Revista)literatura).getEditorial());
                        editorial.setBounds(150, 90,150,20);
                        String editorials = editorial.getText();

                        JLabel cvolumen = new JLabel("Volumen: ");
                        cvolumen.setBounds(10, 110,100,20);
                        volumen = new JTextField(((Revista)literatura).getVolumen());
                        volumen.setBounds(150, 110,150,20);
                        String volumens = volumen.getText();

                        JButton bGuardar =  new JButton("Guardar");
                        bGuardar.setBounds(10, 290, 100, 25);
                        bGuardar.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                try {
                                    literatura.setTitulo(titulo.getText());
                                    ((Revista) literatura).setEditores(editoress);
                                    ((Revista) literatura).setEditorial(editorials);
                                    ((Revista) literatura).setVolumen(volumens);
                                    
                                    biblioteca.actualizarLiteratura(literatura);
                                    frame.dispose();
                                }catch(Exception ex){
                                    JOptionPane.showMessageDialog(frame, "Error al guardar la literatura modificada.", "Error", JOptionPane.ERROR_MESSAGE);
                                }
                            }
                        });
                        
                        frame.add(editores);
                        frame.add(editorial);
                        frame.add(volumen);
                        frame.add(ceditores);
                        frame.add(ceditorial);
                        frame.add(cvolumen);
                        frame.add(bGuardar);
                        
                    }
                    else if(literatura instanceof Articulo){

                        JLabel cautor = new JLabel("Autor: ");
                        cautor.setBounds(10, 70,150,20);
                        autor = new JTextField(((Articulo)literatura).getAutor());
                        autor.setBounds(150, 70,150,20);
                        String autors = autor.getText();

                        JLabel doi = new JLabel("DOI: ");
                        doi.setBounds(10, 90,150,20);
                        cdoi = new JTextField(((Articulo)literatura).getDoi());
                        cdoi.setBounds(150, 90,150,20);
                        String dois = cdoi.getText();

                        JLabel fecha = new JLabel("Fecha de publicacion: ");
                        fecha.setBounds(10, 110,200,20);
                        cfecha = new JTextField(((Articulo)literatura).getFechaPublicacion());
                        cfecha.setBounds(150, 110,150,20);
                        String fechas = cfecha.getText();

                        JButton bGuardar =  new JButton("Guardar");
                        bGuardar.setBounds(10, 290, 100, 25);
                        bGuardar.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                try {
                                    literatura.setTitulo(titulo.getText());
                                    ((Articulo) literatura).setAutor(autors);
                                    ((Articulo) literatura).setDoi(dois);
                                    ((Articulo) literatura).setFechaPublicacion(fechas);
                                    
                                    biblioteca.actualizarLiteratura(literatura);
                                    frame.dispose();
                                }catch(Exception ex){
                                    JOptionPane.showMessageDialog(frame, "Error al guardar la literatura modificada.", "Error", JOptionPane.ERROR_MESSAGE);
                                }//catch(StringVacioExcepcion ex){
                                    //JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                                //}
                            }
                        });

                        frame.add(autor);
                        frame.add(doi);
                        frame.add(fecha);
                        frame.add(cautor);
                        frame.add(cdoi);
                        frame.add(cfecha);
                        frame.add(bGuardar);
                        
                    }
                    
                } catch (StringVacioExcepcion ex) {
                    JOptionPane.showMessageDialog(frame, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        frame.add(idliteratura);
        frame.add(campoliteratura);
        frame.add(bModificar);
        frame.setVisible(true);
    }
    public void eliminar(){
        JFrame frame = new JFrame();
        frame.setTitle("Eliminar");
        frame.setSize(700,600);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setResizable(true);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.GRAY);

        JButton bUsuario =  new JButton("Eliminar Usuario");
        bUsuario.setBounds(10, 50, 150, 25);
        bUsuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eliminarUsuario();
            }
        });
        JButton bLiteratura =  new JButton("Eliminar Literatura");
        bLiteratura.setBounds(10, 100, 150, 25);
        bLiteratura.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eliminarLiteratura();
            }
        });

        frame.add(bUsuario);
        frame.add(bLiteratura);
        
        frame.setVisible(true);
    }
    public void eliminarUsuario(){
        JFrame frame = new JFrame();

        frame.setTitle("Eliminar Usuario");
        frame.setSize(700,600);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setResizable(true);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.GRAY);

        JLabel idUsuario = new JLabel("ID Usuario:");
        idUsuario.setBounds(10, 40,180,20);
        JTextField campoUsuario = new JTextField();
        campoUsuario.setBounds(150, 40,100,20);
        

        JButton bUsuario =  new JButton("Eliminar");
        bUsuario.setBounds(10, 80, 100, 25);
        bUsuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String idUsuario = campoUsuario.getText();
                    if (idUsuario.isEmpty()){
                        throw new StringVacioExcepcion("No se registro algun dato");
                    }
                    biblioteca.eliminarUsuario(idUsuario);
                    frame.dispose();
                }catch(IllegalArgumentException ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }catch(StringVacioExcepcion ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        frame.add(idUsuario);
        frame.add(campoUsuario);
        frame.add(bUsuario);
        frame.setVisible(true);
    }
    public void eliminarLiteratura(){
        JFrame frame = new JFrame();
        
        frame.setTitle("Eliminar Literatura");
        frame.setSize(700,600);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setResizable(true);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.GRAY);


        JLabel idLiteratura = new JLabel("ID Literatura:");
        idLiteratura.setBounds(10, 40,180,20);
        JTextField campoLiteratura = new JTextField();
        campoLiteratura.setBounds(150, 40,100,20);

        JButton bLiteratura =  new JButton("Eliminar");
        bLiteratura.setBounds(10, 80, 100, 25);
        bLiteratura.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String idLiteratura = campoLiteratura.getText();
                    if (idLiteratura.isEmpty()){
                        throw new StringVacioExcepcion("No se registro algun dato");
                    }
                    biblioteca.eliminarLiteratura(idLiteratura);
                    frame.dispose();
                }catch(IllegalArgumentException ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }catch(StringVacioExcepcion ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        frame.add(idLiteratura);
        frame.add(campoLiteratura);
        frame.add(bLiteratura);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new Interfaz();
        
    }
}
