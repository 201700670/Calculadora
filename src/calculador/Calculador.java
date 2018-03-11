/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculador;

import java.awt.Color;
import java.awt.FlowLayout;
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
        
        
        Composicion obj=new Composicion();
        obj.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        obj.getContentPane().setBackground(Color.YELLOW);
        obj.setSize(500,150);
        obj.setLocationRelativeTo(null);
        obj.setVisible(true);
       }
}
