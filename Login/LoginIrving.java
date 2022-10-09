import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class LoginIrving extends JFrame implements ActionListener{

  private JButton boton1,boton2,boton3;
  private JTextField etiqueta1, etiqueta2;

  public LoginIrving(){
    
    initDisplay();
    initEtiquetas();
    initBotones();
    initAcciones();
    initHovers();
    initPantalla();

  }

    private void initPantalla(){

      setLayout(new GridLayout(10, 1, 1, 10));
      setSize(500, 500);
      setTitle("LoginIrving");
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setVisible(true);
      
    }
    
    private void initDisplay(){

    }

    private void initBotones(){
      
      boton1=new JButton("1");
      setSize(10,10);
      add(boton1);
      boton1.addActionListener(this);
      
      boton2=new JButton("2");
      setSize(10,10);
      add(boton2);
      boton2.addActionListener(this);

      boton3=new JButton("3");
      setSize(10,10);
      add(boton3);
      boton3.addActionListener(this);
      
    }
    private void initEtiquetas(){

      etiqueta1=new JTextField("Usuario");
      setSize(10,10);
      add(etiqueta1);
      etiqueta1.addActionListener(this);

      etiqueta2=new JTextField("Contraseña");
      setSize(10,10);
      add(etiqueta2);
      etiqueta2.addActionListener(this);

    }

    private void initAcciones(){

    }

    private void initHovers(){

    }

    public void actionPerformed(ActionEvent e) {
      if (e.getSource()==boton1) {
        etiqueta1.setText("");
        etiqueta2.setText("");
        setTitle("boton 1");
      }
      if (e.getSource()==boton2) {
        setTitle("boton 2");
      }
      if (e.getSource()==boton3) {
        setTitle("boton 3");
      }
    }

    public static void main(String[] args) {

      new LoginIrving();

    }

}