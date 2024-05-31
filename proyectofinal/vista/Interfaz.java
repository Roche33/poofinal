package vista;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interfaz {
    
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
        frame.setSize(700,500);
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
        JButton usuario;
        JButton literatura;
        JFrame frame = new JFrame();
        frame.setTitle("Altas");
        frame.setSize(700,500);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setResizable(true);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.GRAY);

        usuario =  new JButton("Usuario");
        usuario.setBounds(10, 160, 100, 25);
        usuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                altaUsuario();
            }
        });
        literatura =  new JButton("Literatura");
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
        JLabel id,nombre,edad,librosprestados;
        JTextField campoID,camponombre,campoedad,campolibrosprestados;

        frame.setTitle("Alta Usuario");
        frame.setSize(700,500);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setResizable(true);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.GRAY);

        id = new JLabel("ID Usuario:");
        id.setBounds(10, 10,70,20);
        campoID = new JTextField();
        campoID.setBounds(150, 10,100,20);

        nombre = new JLabel("Nombre:");
        nombre.setBounds(10, 50,130,20);
        camponombre = new JTextField();
        camponombre.setBounds(150, 50,100,20);

        edad = new JLabel("Edad:");
        edad.setBounds(10, 90,130,20);
        campoedad = new JTextField();
        campoedad.setBounds(150, 90,100,20);

        librosprestados = new JLabel("Libros prestados:");
        librosprestados.setBounds(10, 130,130,20);
        campolibrosprestados = new JTextField();
        campolibrosprestados.setBounds(150, 130,100,20);

        frame.add(id);
        frame.add(campoID);
        frame.add(nombre);
        frame.add(camponombre);
        frame.add(edad);
        frame.add(campoedad);
        frame.add(librosprestados);
        frame.add(campolibrosprestados);

        frame.setVisible(true);
    }
    public void altaLiteratura(){
        JButton libro;
        JButton revista;
        JButton articulo;
        JFrame frame = new JFrame();
        frame.setTitle("Altas");
        frame.setSize(700,500);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setResizable(true);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.GRAY);

        libro =  new JButton("Libro");
        libro.setBounds(10, 150, 100, 25);
        libro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                altaLibro();
            }
        });
        revista =  new JButton("Revista");
        revista.setBounds(10, 180, 100, 25);
        revista.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                altaRevista();
            }
        });
        articulo =  new JButton("Articulo");
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
        JLabel id,titulo,autor,isbn,genero,editorial,disponible;
        JTextField campoID,campotitulo,campoautor,campoisbn,campogenero,campoeditorial,campodisponible;

        frame.setTitle("Alta Libro");
        frame.setSize(700,500);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setResizable(true);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.GRAY);

        id = new JLabel("ID del libro:");
        id.setBounds(10, 10,70,20);
        campoID = new JTextField();
        campoID.setBounds(150, 10,100,20);

        titulo = new JLabel("Titulo:");
        titulo.setBounds(10, 50,130,20);
        campotitulo = new JTextField();
        campotitulo.setBounds(150, 50,100,20);

        autor = new JLabel("Autor:");
        autor.setBounds(10, 90,130,20);
        campoautor = new JTextField();
        campoautor.setBounds(150, 90,100,20);

        isbn = new JLabel("ISBN:");
        isbn.setBounds(10, 130,130,20);
        campoisbn = new JTextField();
        campoisbn.setBounds(150, 130,100,20);

        genero = new JLabel("Genero:");
        genero.setBounds(10, 170,130,20);
        campogenero = new JTextField();
        campogenero.setBounds(150, 170,100,20);
        
        editorial = new JLabel("Editorial:");
        editorial.setBounds(10, 210,130,20);
        campoeditorial = new JTextField();
        campoeditorial.setBounds(150, 210,100,20);

        disponible = new JLabel("Disponible:");
        disponible.setBounds(10, 250,130,20);
        campodisponible = new JTextField();
        campodisponible.setBounds(150, 250,100,20);

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
        frame.add(disponible);
        frame.add(campodisponible);


        frame.setVisible(true);
    }

    public void altaRevista(){
        JFrame frame = new JFrame();
        JLabel id,titulo,editores,editorial,volumen,disponible;
        JTextField campoID,campotitulo,campoeditores,campoeditorial,campovolumen,campodisponible;

        frame.setTitle("Alta Revista");
        frame.setSize(700,500);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setResizable(true);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.GRAY);

        id = new JLabel("ID de la Revista:");
        id.setBounds(10, 10,70,20);
        campoID = new JTextField();
        campoID.setBounds(150, 10,100,20);

        titulo = new JLabel("Titulo:");
        titulo.setBounds(10, 50,130,20);
        campotitulo = new JTextField();
        campotitulo.setBounds(150, 50,100,20);

        editores = new JLabel("Editores:");
        editores.setBounds(10, 90,130,20);
        campoeditores = new JTextField();
        campoeditores.setBounds(150, 90,100,20);

        editorial = new JLabel("Editorial:");
        editorial.setBounds(10, 130,130,20);
        campoeditorial = new JTextField();
        campoeditorial.setBounds(150, 130,100,20);

        volumen = new JLabel("Volumen:");
        volumen.setBounds(10, 170,130,20);
        campovolumen = new JTextField();
        campovolumen.setBounds(150, 170,100,20);
        
        disponible = new JLabel("Disponible:");
        disponible.setBounds(10, 210,130,20);
        campodisponible = new JTextField();
        campodisponible.setBounds(150, 210,100,20);


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
        frame.add(disponible);
        frame.add(campodisponible);


        frame.setVisible(true);
    }

    public void altaArticulo(){
        JFrame frame = new JFrame();
        JLabel id,titulo,autor,doi,fecha,disponible;
        JTextField campoID,campotitulo,campoautor,campodoi,campofecha,campodisponible;

        frame.setTitle("Alta Articulo");
        frame.setSize(700,500);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setResizable(true);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.GRAY);

        id = new JLabel("ID de la Revista:");
        id.setBounds(10, 10,70,20);
        campoID = new JTextField();
        campoID.setBounds(150, 10,100,20);

        titulo = new JLabel("Titulo:");
        titulo.setBounds(10, 50,130,20);
        campotitulo = new JTextField();
        campotitulo.setBounds(150, 50,100,20);

        autor = new JLabel("Autor:");
        autor.setBounds(10, 90,130,20);
        campoautor = new JTextField();
        campoautor.setBounds(150, 90,100,20);

        doi = new JLabel("DOI:");
        doi.setBounds(10, 130,130,20);
        campodoi = new JTextField();
        campodoi.setBounds(150, 130,100,20);

        fecha = new JLabel("Fecha:");
        fecha.setBounds(10, 170,130,20);
        campofecha = new JTextField();
        campofecha.setBounds(150, 170,100,20);
        
        disponible = new JLabel("Disponible:");
        disponible.setBounds(10, 210,130,20);
        campodisponible = new JTextField();
        campodisponible.setBounds(150, 210,100,20);


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
        frame.add(disponible);
        frame.add(campodisponible);


        frame.setVisible(true);
    }

    public void prestamos(){
        JFrame frame = new JFrame();
        JLabel idusuario,idliteratura;
        JTextField campoID,campoliteratura;

        frame.setTitle("Prestamos");
        frame.setSize(700,500);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setResizable(true);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.GRAY);

        idusuario = new JLabel("ID Usuario:");
        idusuario.setBounds(10, 10,70,20);
        campoID = new JTextField();
        campoID.setBounds(150, 10,100,20);

        idliteratura = new JLabel("ID Literatura:");
        idliteratura.setBounds(10, 50,130,20);
        campoliteratura = new JTextField();
        campoliteratura.setBounds(150, 50,100,20);

        
        frame.add(idusuario);
        frame.add(campoID);
        frame.add(idliteratura);
        frame.add(campoliteratura);

        frame.setVisible(true);
    }
    public void devolver(){
        JFrame frame = new JFrame();
        JLabel idusuario,idliteratura;
        JTextField campoID,campoliteratura;

        frame.setTitle("Prestamos");
        frame.setSize(700,500);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setResizable(true);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.GRAY);

        idusuario = new JLabel("ID Usuario:");
        idusuario.setBounds(10, 10,70,20);
        campoID = new JTextField();
        campoID.setBounds(200, 10,100,20);

        idliteratura = new JLabel("ID Literatura a regresar:");
        idliteratura.setBounds(10, 50,180,20);
        campoliteratura = new JTextField();
        campoliteratura.setBounds(200, 50,100,20);

        
        frame.add(idusuario);
        frame.add(campoID);
        frame.add(idliteratura);
        frame.add(campoliteratura);

        frame.setVisible(true);
    }
    public void consulta(){
        JButton mUsuario;
        JButton mLiteratura;
        JButton bUsuario;
        JButton bLiteratura;
        JFrame frame = new JFrame();
        frame.setTitle("Consulta");
        frame.setSize(700,500);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setResizable(true);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.GRAY);

        mUsuario =  new JButton("Mostrar Usuarios");
        mUsuario.setBounds(10, 120, 160, 25);
        mUsuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarUsuario();
            }
        });
        mLiteratura =  new JButton("Mostrar Literatura");
        mLiteratura.setBounds(10, 150, 160, 25);
        mLiteratura.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        bUsuario =  new JButton("Buscar Usuario");
        bUsuario.setBounds(10, 180, 160, 25);
        bUsuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        bLiteratura =  new JButton("Buscar Literatura");
        bLiteratura.setBounds(10, 210, 160, 25);
        bLiteratura.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
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
        dataFrame.setSize(700, 500);
        dataFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        dataFrame.setResizable(true);
        dataFrame.setLayout(new BorderLayout());
        dataFrame.getContentPane().setBackground(Color.GRAY);

        DefaultTableModel tablaModelo = new DefaultTableModel(new String[]{"ID", "Nombre", "Edad", "Libros Prestados"}, 0);
        JTable usuariosTabla = new JTable(tablaModelo);
        JScrollPane scrollPane = new JScrollPane(usuariosTabla);
        dataFrame.add(scrollPane, BorderLayout.CENTER);

        dataFrame.setVisible(true);

    }
    public void modificar(){
        JFrame frame = new JFrame();
        frame.setTitle("Modificar");
        frame.setSize(700,500);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setResizable(true);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.GRAY);


        frame.setVisible(true);
    }
    public void eliminar(){
        JFrame frame = new JFrame();
        frame.setTitle("Eliminar");
        frame.setSize(700,500);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setResizable(true);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.GRAY);


        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new Interfaz();
        
    }
}
