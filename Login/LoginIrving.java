import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class LoginIrving extends JFrame implements ActionListener{

  private JButton boton1,boton2,boton3;
  private BorderLayout border1;

  public LoginIrving(){
    
    initDisplay();
    initBotones();
    initAcciones();
    initHovers();
    initPantalla();
    

  }

    private void initPantalla(){
      
      setLayout(new GridLayout());
      setSize(500, 500);
      setTitle("Ejemplo 2: Botones");
      setResizable(true);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setVisible(true);
      
    }
    
    private void initDisplay(){

    }

    private void initBotones(){

      boton1=new JButton("1");
      boton1.setSize(50,10);
      add(boton1, BorderLayout.NORTH);
      boton1.addActionListener(this);
      
      boton2=new JButton("2");
      boton2.setSize(50,10);
      add(boton2, BorderLayout.CENTER);
      boton2.addActionListener(this);

      boton3=new JButton("3");
      boton3.setSize(50,10);
      add(boton3, BorderLayout.SOUTH);
      boton3.addActionListener(this);
      
    }

    private void initAcciones(){

    }

    private void initHovers(){

    }

   
  
    

    public void actionPerformed(ActionEvent e) {
      if (e.getSource()==boton1) {
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