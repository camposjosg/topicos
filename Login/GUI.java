import java.awt.*;
import javax.swing.*;


public class GUI {

    public static void main (String[]args){

        JButton btn1 = new JButton("Ingresar");
        JButton btn2 = new JButton("Crear usuario");
        JLabel etiqueta1 = new JLabel("IrvBook");
        JLabel etiqueta2 = new JLabel("¿Listo para navegar?");
        //JTextField campo = new JTextField("Adios..", 12);
        JFrame ventana = new JFrame();

        ventana.setTitle("IrvBook");
        ventana.setSize(400,300);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
        
        ventana.setLayout(new FlowLayout(FlowLayout.LEFT, 150,20) );
       
        ventana.add(etiqueta1);
        ventana.add(etiqueta2);
        ventana.add(btn1);
        ventana.add(btn2);
        

    }

}