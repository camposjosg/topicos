import java.awt.*;
import javax.swing.*;

public class GUI {

    public static void main (String[]args){

        JButton btn1 = new JButton("Ingresar");
        JToggleButton btn = new JToggleButton("Como estan?");
        JLabel etiqueta = new JLabel("Saludos y");
        JTextField campo = new JTextField("Adios..", 12);
        JFrame marco = new JFrame();
        marco.setTitle("FlowLayout(int align, int hgap, int vgap)");
        marco.setSize(400,300);
        marco.setLocationRelativeTo(null);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
       
        marco.setLayout(new FlowLayout(FlowLayout.LEFT, 150,0) );
       
        marco.add(btn1);marco.add(btn);
        marco.add(etiqueta);marco.add(campo);

    }
}