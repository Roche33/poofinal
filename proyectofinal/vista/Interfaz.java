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
        JButton usuario;
        JButton literatura;
        JFrame frame = new JFrame();
        frame.setTitle("Altas");
        frame.setSize(700,600);
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
        frame.setSize(700,600);
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
        frame.setSize(700,600);
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
        frame.setSize(700,600);
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
        frame.setSize(700,600);
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
        frame.setSize(700,600);
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
        frame.setSize(700,600);
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
        frame.setSize(700,600);
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
        frame.setSize(700,600);
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
                mostrarLiteratura();
            }
        });
        bUsuario =  new JButton("Buscar Usuario");
        bUsuario.setBounds(10, 180, 160, 25);
        bUsuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buscarUsuario();
            }
        });
        bLiteratura =  new JButton("Buscar Literatura");
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

        dataFrame.setVisible(true);

    }
    public void mostrarLiteratura(){
        JTable tablaRevista;
        JTable tablaArticulo;
        JTable tablaLibro;
        DefaultTableModel tablaModeloRevista;
        DefaultTableModel tablaModeloArticulo;
        DefaultTableModel tablaModeloLibro;
        JPanel panel1;
        JPanel panel2;
        JPanel panel3;
        JFrame frame = new JFrame("Literatura Registrada");
        frame.setSize(700, 600);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setResizable(true);
        frame.setLayout(new GridLayout(3,1));
        frame.getContentPane().setBackground(Color.GRAY);

        panel1 = new JPanel();
        panel1.setBounds(0, 0, 700, 200);
        tablaModeloLibro = new DefaultTableModel(new String[]{"ID", "Titulo", "Autor", "ISBN", "Genero","Editorial","Disponible"}, 0);
        tablaLibro = new JTable(tablaModeloLibro);
        JScrollPane scrollPaneLibro = new JScrollPane(tablaLibro);
        panel1.add(scrollPaneLibro, BorderLayout.NORTH);

        panel2 = new JPanel();
        panel2.setBounds(0, 200, 700, 200);
        tablaModeloRevista = new DefaultTableModel(new String[]{"ID", "Titulo", "Editores", "Editorial", "Volumen","Disponible"}, 0);
        tablaRevista = new JTable(tablaModeloRevista);
        JScrollPane scrollPaneRevista = new JScrollPane(tablaRevista);
        panel2.add(scrollPaneRevista, BorderLayout.CENTER);

        panel3 = new JPanel();
        panel3.setBounds(0, 400, 700, 200);
        tablaModeloArticulo = new DefaultTableModel(new String[]{"ID", "Titulo", "Autor", "DOI", "Fecha","Disponible"}, 0);
        tablaArticulo = new JTable(tablaModeloArticulo);
        JScrollPane scrollPaneArticulo = new JScrollPane(tablaArticulo);
        panel3.add(scrollPaneArticulo, BorderLayout.SOUTH);

        
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        frame.setVisible(true);
    }
    public void buscarUsuario(){
        JButton bUsuario;
        JFrame frame = new JFrame();
        JLabel nUsuario;
        JTextField campoNombre;

        frame.setTitle("Buscar Usuario");
        frame.setSize(700,600);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setResizable(true);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.GRAY);

        nUsuario = new JLabel("Nombre Usuario:");
        nUsuario.setBounds(10, 10,150,20);
        campoNombre = new JTextField();
        campoNombre.setBounds(180, 10,200,20);

        bUsuario =  new JButton("Buscar");
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
        JButton bLiteratura;
        JFrame frame = new JFrame();
        JLabel nLiteratura;
        JTextField campoLiteratura;

        frame.setTitle("Buscar Literatura");
        frame.setSize(700,600);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setResizable(true);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.GRAY);

        nLiteratura = new JLabel("Nombre de la literatura:");
        nLiteratura.setBounds(10, 10,150,20);
        campoLiteratura = new JTextField();
        campoLiteratura.setBounds(180, 10,200,20);

        bLiteratura =  new JButton("Buscar");
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
        JButton bModificar;
        JFrame frame = new JFrame();
        JLabel idliteratura;
        JTextField campoliteratura;

        frame.setTitle("Modificar");
        frame.setSize(700,600);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setResizable(true);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.GRAY);


        idliteratura = new JLabel("ID Literatura a modificar:");
        idliteratura.setBounds(10, 40,180,20);
        campoliteratura = new JTextField();
        campoliteratura.setBounds(200, 40,100,20);

        bModificar =  new JButton("Buscar");
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
        JButton bUsuario;
        JButton bLiteratura;
        JFrame frame = new JFrame();
        frame.setTitle("Eliminar");
        frame.setSize(700,600);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setResizable(true);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.GRAY);

        bUsuario =  new JButton("Eliminar Usuario");
        bUsuario.setBounds(10, 50, 150, 25);
        bUsuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eliminarUsuario();
            }
        });
        bLiteratura =  new JButton("Eliminar Literatura");
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
        JButton bUsuario;
        JFrame frame = new JFrame();
        JLabel idUsuario;
        JTextField campoUsuario;

        frame.setTitle("Eliminar Usuario");
        frame.setSize(700,600);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setResizable(true);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.GRAY);


        idUsuario = new JLabel("ID Usuario:");
        idUsuario.setBounds(10, 40,180,20);
        campoUsuario = new JTextField();
        campoUsuario.setBounds(150, 40,100,20);

        bUsuario =  new JButton("Eliminar");
        bUsuario.setBounds(10, 80, 100, 25);
        bUsuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });

        frame.add(idUsuario);
        frame.add(campoUsuario);
        frame.add(bUsuario);
        frame.setVisible(true);
    }
    public void eliminarLiteratura(){
        JButton bLiteratura;
        JFrame frame = new JFrame();
        JLabel idLiteratura;
        JTextField campoLiteratura;

        frame.setTitle("Eliminar Literatura");
        frame.setSize(700,600);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setResizable(true);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.GRAY);


        idLiteratura = new JLabel("ID Literatura:");
        idLiteratura.setBounds(10, 40,180,20);
        campoLiteratura = new JTextField();
        campoLiteratura.setBounds(150, 40,100,20);

        bLiteratura =  new JButton("Eliminar");
        bLiteratura.setBounds(10, 80, 100, 25);
        bLiteratura.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
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
