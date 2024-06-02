package vista;
import modelo.*;
import controlador.*;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

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
        panel.setBackground(Color.CYAN);
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
                    String nombre = camponombre.getText();
                    int edad = Integer.parseInt(campoedad.getText());
        
                    Usuario usuario = new Usuario(id, nombre, edad);
                    biblioteca.registrarUsuario(usuario);
        
                    campoID.setText("");
                    camponombre.setText("");
                    campoedad.setText("");
                    frame.dispose();
        
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Agregar datos correctos", "Error", JOptionPane.ERROR_MESSAGE);
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
                    String titulo = campotitulo.getText();
                    String autor = campoautor.getText();
                    String isbn = campoisbn.getText();
                    String genero = campogenero.getText();
                    String editorial = campoeditorial.getText();
        
                    Libro libro = new Libro( id, titulo,  autor,  isbn,  genero,  editorial);
                    biblioteca.registrarLiteratura(libro);
        
                    campoID.setText("");
                    campotitulo.setText("");
                    campoautor.setText("");
                    campoisbn.setText("");
                    campogenero.setText("");
                    campoeditorial.setText("");
                    frame.dispose();
        
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Agregar datos correctos", "Error", JOptionPane.ERROR_MESSAGE);
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
                    String titulo = campotitulo.getText();
                    String editores = campoeditores.getText();
                    String editorial = campoeditorial.getText();
                    int volumen = Integer.parseInt(campovolumen.getText());
                    
        
                    Revista revista = new Revista( id, titulo, editores, editorial, volumen);
                    biblioteca.registrarLiteratura(revista);
        
                    campoID.setText("");
                    campotitulo.setText("");
                    campoeditores.setText("");
                    campoeditorial.setText("");
                    campovolumen.setText("");
                    
                    frame.dispose();
        
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Agregar datos correctos", "Error", JOptionPane.ERROR_MESSAGE);
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
                    String titulo = campotitulo.getText();
                    String autor = campoautor.getText();
                    String doi = campodoi.getText();
                    String fecha = campofecha.getText();
                    
        
                    Articulo articulo = new Articulo( id, titulo, autor, doi, fecha);
                    biblioteca.registrarLiteratura(articulo);
        
                    campoID.setText("");
                    campotitulo.setText("");
                    campoautor.setText("");
                    campodoi.setText("");
                    campofecha.setText("");
                    
                    frame.dispose();
        
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Agregar datos correctos", "Error", JOptionPane.ERROR_MESSAGE);
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
            tablaModelo.addRow(new Object[]{u.getID(), u.getNombre(), u.getEdad(), u.getLiteratura()});
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

        JLabel nLiteratura = new JLabel("Nombre de la literatura:");
        nLiteratura.setBounds(10, 10,150,20);
        JTextField campoLiteratura = new JTextField();
        campoLiteratura.setBounds(180, 10,200,20);

        JButton bLiteratura =  new JButton("Buscar");
        bLiteratura.setBounds(10, 50, 100, 25);
        bLiteratura.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
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

        JButton bModificar =  new JButton("Buscar");
        bModificar.setBounds(10, 80, 100, 25);
        bModificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
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
                    biblioteca.eliminarUsuario(idUsuario);
                    frame.dispose();
                }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, "Agregar datos correctos", "Error", JOptionPane.ERROR_MESSAGE);
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
                    biblioteca.eliminarLiteratura(idLiteratura);
                    frame.dispose();
                }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, "Agregar datos correctos", "Error", JOptionPane.ERROR_MESSAGE);
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
