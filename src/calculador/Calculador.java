/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculador;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Andrea Palomo
 */
public class Calculador {
    public static JTextField caja1;
    public static JTextField caja2;
    public static JTextField caja3;
    public static JButton botonmas;
    public static JButton botonmenos;
    public static JButton botondiv;
    public static JButton botonmul;
    public static JButton botonigual;
    public static void main(String[] args) {
        int r;
        JFrame f=new JFrame();
        
        f.setTitle("CALCULADORA");
        f.setBackground(Color.cyan);
        f.setSize(450,150);

        f.setLayout(new FlowLayout());
        JLabel L1=new JLabel("Número 1:");
        f.add(L1);
        caja1= new JTextField(6);
        caja1.setBounds(25,100,200,25);
        f.add(caja1);
        JLabel L2=new JLabel("Número 2:");
        f.add(L2);
        caja2= new JTextField(6);
        f.add(caja2);
        JLabel L3=new JLabel("Resultado:");
        f.add(L3);
        caja3= new JTextField(6);
        f.add(caja3);
        JLabel L4=new JLabel("Opciones:");
        f.add(L4);
        botonmas=new JButton(" + ");
        botonmas.setBounds(25,25,200,25);
        botonmas.setActionCommand("B1");
        f.add(botonmas);
        botonmenos=new JButton(" - ");
        botonmenos.setActionCommand("B2");
        f.add(botonmenos);
        botondiv=new JButton(" / ");
        botondiv.setActionCommand("B3");
        f.add(botondiv);
        botonmul=new JButton(" + ");
        botonmul.setActionCommand("B4");
        f.add(botonmul);
        botonigual=new JButton(" = ");
        botonigual.setActionCommand("B5");
        f.add(botonigual);
        if("B1".equals(botonmas)){
        }
        f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        
    }
}
