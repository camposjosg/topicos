import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUI {

    public static void main (String[]args){

        

        JFrame ventana = new JFrame("Login para apps");
        JLabel panelN = new JLabel();
        JLabel panelS = new JLabel();
        JLabel panelE = new JLabel();
        JLabel panelO = new JLabel();
        JLabel panelC = new JLabel();

        panelN.setBackground(Color.BLUE);

       

        ventana.add(panelN, BorderLayout.NORTH);
        ventana.add(panelS, BorderLayout.SOUTH);
        ventana.add(panelE, BorderLayout.EAST);
        ventana.add(panelO, BorderLayout.WEST);
        ventana.add(panelC, BorderLayout.CENTER);

        ventana.setSize(900, 600);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);

    }
}