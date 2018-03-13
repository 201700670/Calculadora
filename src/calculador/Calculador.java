/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculador;

import java.awt.Color;
import java.awt.FlowLayout;//paquetes del frame
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Andrea Palomo
 */
public class Calculador {
       
       public static void main(String[] args) {
        
        
        Composicion obj=new Composicion();//en la composición se encuentra todo el procedimiento de cada objeto
        obj.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);//se utiliza para salir por medio del ícono "x"
        obj.getContentPane().setBackground(Color.YELLOW);//se le coloca el color de fondo de la calculadora
        // obj.setLayout(null);
        obj.setTitle("CALCULADORA");
        obj.setSize(500,150);//el tamaño de la ventana
        obj.setLocationRelativeTo(null);//coloca la ventana al centro de la pantalla al ejecutar
        obj.setVisible(true);//al ser verdadero se ejecutará el frame
       }
}
