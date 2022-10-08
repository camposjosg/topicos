import javax.swing.*;
import java.awt.event.*;

public class Prueba extends JFrame implements ActionListener {

JButton boton1;

  public Prueba() {

    //Layout absoluto
    setLayout(null);

    //Tamaño de la ventana
    setSize(400,500);

    //Título
    setTitle("Ejemplo 1: Botón");

    //No redimensionable
    setResizable(false);

    //Cerrar proceso al cerrar la ventana
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    //Botón
    boton1=new JButton("Finalizar");
    boton1.setBounds(300,250,100,30);
    add(boton1);
    boton1.addActionListener(this);

    //Muestro JFrame (lo último para que lo pinte todo correctamanete)
    setVisible(true);


  }

  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == boton1) {
    System.exit(0);
    }
  }

  public static void main(String[] args) {
    new Prueba();
  }
}

