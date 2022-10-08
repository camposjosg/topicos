import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

public class GUI {

    public static void main (String[]args){

        

        JFrame ventana = new JFrame("Login para apps");
        JButton panelN = new JButton("Norte");
        JButton panelS = new JButton("Sur");
        JButton panelE = new JButton("Este");
        JLabel panelO = new JLabel("Oeste");
        JLabel panelC = new JLabel("Centro");
        JButton panelON = new JButton("Oeste Norte");

        panelO.setBackground(Color.BLUE);
        panelO.add(panelON, BorderLayout.NORTH);

        //ventana.add(panelN, BorderLayout.NORTH);
        //ventana.add(panelS, BorderLayout.SOUTH);
        //ventana.add(panelE, BorderLayout.EAST);
        ventana.add(panelO, BorderLayout.WEST);
        ventana.add(panelC, BorderLayout.CENTER);

        


        ventana.setSize(500, 500);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
        ventana.setResizable(false);

    }
}