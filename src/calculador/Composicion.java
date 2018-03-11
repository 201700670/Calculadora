/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculador;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Andrea Palomo
 */
public class Composicion extends JFrame{
    private JTextField caja1;
    private JTextField caja2;
    private JTextField caja3;
    private JButton botonmas;
    private JButton botonmenos;
    private JButton botondiv;
    private JButton botonmul;
    private JButton botonigual;
    private String a;
    private int r;
        public Composicion() {
      setLayout(new FlowLayout());
        JLabel L1=new JLabel("Número 1:");
        add(L1);
        caja1= new JTextField(6);
        caja1.setBounds(25,100,200,25);
        add(caja1);
        caja1.setBackground(Color.ORANGE);
        JLabel L2=new JLabel("Número 2:");
        add(L2);
        caja2= new JTextField(6);
        add(caja2);
        caja2.setBackground(Color.ORANGE);
        JLabel L3=new JLabel("Resultado:");
        add(L3);
        caja3= new JTextField(12);
        caja3.setBackground(Color.ORANGE);
        add(caja3);
        JLabel L4=new JLabel("Opciones:");
        add(L4);
        botonmas=new JButton(" + ");
        botonmas.setBounds(25,25,200,25);
        add(botonmas);
        botonmenos=new JButton(" - ");
        add(botonmenos);
        botondiv=new JButton(" / ");
        add(botondiv);
        botonmul=new JButton(" * ");
        add(botonmul);
        botonigual=new JButton(" = ");
        add(botonigual);
        Accionar manejo=new Accionar();
        botonmas.addActionListener(manejo);
        botonmenos.addActionListener(manejo);
        botondiv.addActionListener(manejo);
        botonmul.addActionListener(manejo);
        botonigual.addActionListener(manejo);
        }

    void getForeground(Color CYAN) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        private class Accionar implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
           
            if(ae.getSource()==botonmas){
                r=(Integer.parseInt(caja1.getText()))+((Integer.parseInt(caja2.getText())));
                a=String.valueOf(r);
                caja3.setText(a);
            }else if(ae.getSource()==botonmenos){
                r=(Integer.parseInt(caja1.getText()))-((Integer.parseInt(caja2.getText())));
                a=String.valueOf(r);
                caja3.setText(a);
            }else if(ae.getSource()==botonmul){
                r=(Integer.parseInt(caja1.getText()))*((Integer.parseInt(caja2.getText())));
                a=String.valueOf(r);
                caja3.setText(a);
            }else if(ae.getSource()==botondiv){
                if(((Integer.parseInt(caja2.getText())))<=0){
                    caja3.setText("Error Matemático");
                } else {
                    r=(Integer.parseInt(caja1.getText()))/((Integer.parseInt(caja2.getText())));
                    a=String.valueOf(r);
                    caja3.setText(a);
                }
            }else if(ae.getSource()==botonigual){
                if((Integer.parseInt(caja1.getText()))==((Integer.parseInt(caja2.getText())))){
                    caja3.setText("N1 y N2 son iguales");
                }else{
                    caja3.setText("N1 y N2 no son iguales");
                }
            }
        }
    }
        void Capturar(){
            r=(Integer.parseInt(caja1.getText()))+((Integer.parseInt(caja2.getText())));
        }
}