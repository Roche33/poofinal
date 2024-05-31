package vista;

import java.awt.Color;

import javax.swing.*;
//import java.awt.*;
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
        altas.setBounds(10, 40, 100, 25);
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
                
            }
        });
        literatura =  new JButton("Literatura");
        literatura.setBounds(10, 190, 100, 25);
        literatura.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        frame.add(usuario);
        frame.add(literatura);
        frame.setVisible(true);
    }
    public void prestamos(){
        JFrame frame = new JFrame();
        frame.setTitle("Prestamos");
        frame.setSize(700,500);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setResizable(true);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.GRAY);


        frame.setVisible(true);
    }
    public void devolver(){
        JFrame frame = new JFrame();
        frame.setTitle("Devolver");
        frame.setSize(700,500);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setResizable(true);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.GRAY);


        frame.setVisible(true);
    }
    public void consulta(){
        JFrame frame = new JFrame();
        frame.setTitle("Consulta");
        frame.setSize(700,500);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setResizable(true);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.GRAY);


        frame.setVisible(true);
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
