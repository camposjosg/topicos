import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//PRUEBASINCRO
public class LoginIrving extends JFrame implements ActionListener{

  private JButton boton1,boton2,boton3,boton4;
  private JTextField campo1;
  private JPasswordField campo2;
  private JLabel etiqueta1, etiqueta2, etiqueta3, etiqueta4;

  public LoginIrving(){
    
    initDisplay();
    initEtiquetas();
    initiCampo1();
    initEtiquetas2();
    initCampo2();
    initBotones();
    initAcciones();
    initHovers();
    initPantalla();

  }

    private void initPantalla(){

      setLayout(new GridLayout(11, 1, 1, 10));
      setSize(500, 500);
      setTitle("LogIrving");
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setVisible(true);
      
    }
    
    private void initDisplay(){

    }

   

    private void initEtiquetas(){

      etiqueta1 = new JLabel();
      etiqueta1.setText("Ingresa en los campos de texto de abajo"+
      " un usuario y una contraseña");
      setSize(10,10);
      add(etiqueta1);

      etiqueta2 = new JLabel();
      etiqueta2.setText("después, con los botones, elige qué quieres hacer.");
      setSize(10,10);
      add(etiqueta2);

      etiqueta3 = new JLabel();
      etiqueta3.setText("Usuario:");
      setSize(10,10);
      add(etiqueta3);

    }

    private void initiCampo1(){

      campo1=new JTextField("");
      setSize(10,10);
      add(campo1);
      campo1.addActionListener(this);

    }


    private void initEtiquetas2(){

      etiqueta4 = new JLabel();
      etiqueta4.setText("Contraseña:");
      setSize(10,10);
      add(etiqueta4);
    }

    private void initCampo2(){

      campo2=new JPasswordField("");
      campo2.setEchoChar('*');    
      setSize(10,10);
      add(campo2);
      campo2.addActionListener(this);


    }
    private void initBotones(){
      
      boton1=new JButton("Iniciar sesión");
      setSize(10,10);
      add(boton1);
      boton1.addActionListener(this);
      
      boton2=new JButton("Crear usuario");
      setSize(10,10);
      add(boton2);
      boton2.addActionListener(this);

      boton3=new JButton("Eliminar usuario");
      setSize(10,10);
      add(boton3);
      boton3.addActionListener(this);

      boton4=new JButton("Limpiar campos");
      setSize(10,10);
      add(boton4);
      boton4.addActionListener(this);
      
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
      if (e.getSource()==boton4) {
        campo1.setText("");
        campo2.setText("");
    }
  }
    public static void main(String[] args) {

      new LoginIrving();

    }

}