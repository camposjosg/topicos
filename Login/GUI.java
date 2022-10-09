import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class GUI extends JFrame implements ActionListener {


    private JButton btn1 = new JButton("Ingresar");
    private JButton btn2 = new JButton("Crear usuario");
    //JTextField campo = new JTextField("Adios..", 12);
    
    public GUI(){
    this.setLayout(new FlowLayout(FlowLayout.LEFT, 50,20));
    this.setSize(250,150);
    this.setTitle("IrvBook");
    this.setLocationRelativeTo(null);
    this.setResizable(false);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    this.add(btn1);
    this.add(btn2);
        
    this.setVisible(true);
}

    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btn1) {
          setTitle("boton 1");
        }
        if (e.getSource()==btn2) {
          setTitle("boton 2");
        }
      }

        public static void main(String[] args) {
            new GUI();
  
    }
}