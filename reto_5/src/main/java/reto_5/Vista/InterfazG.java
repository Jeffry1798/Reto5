package reto_5.Vista;
import javax.swing.*;
import java.awt.event.*;


public class InterfazG extends JFrame implements ActionListener{

    JPanel panel01;
    JButton b01;
    JButton b02;
    JButton b03;



    public InterfazG() {

        setTitle("CONSULTAS");
        setSize(500,100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);


        b01= new JButton("CONSULTA 1");
        b01.setBounds(50,15,120,40);
        b01.addActionListener(this);
        add(b01);

        b02= new JButton("CONSULTA 2");
        b02.setBounds(200,15,120,40);
        b02.addActionListener(this);
        add(b02);

        b03= new JButton("CONSULTA 3");
        b03.setBounds(340,15,120,40);
        b03.addActionListener(this);
        add(b03);

        panel01 =new JPanel();
        add(panel01);

       



        setVisible(true);

        
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b01){
            new Interfaz1();
            
        }

        if(e.getSource()==b02){
            new Interfaz2();
        
    }

    if(e.getSource()==b03){
        new Interfaz3();
    }
} 
}
