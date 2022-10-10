import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;

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

    private void Exportar() {
      try {
      JFileChooser archivo = new JFileChooser(System.getProperty("user.dir"));
      archivo.showSaveDialog(this);
      if (archivo.getSelectedFile() != null) {
      try (FileWriter guardado = new FileWriter(archivo.getSelectedFile())) {
      guardado.write(campo1.getText());
      JOptionPane.showMessageDialog(rootPane, "El archivo fue guardado con éxito en la ruta establecida");
      }
      }
      } catch (IOException ex) {
      JOptionPane.showMessageDialog(this, ex.getMessage());
      }
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
    private void setModificar()
   {
      if (guardado.exists())
      {
         String clave = JOptionPane.showInputDialog("Dame clave a modificar");
         try {
            ArrayList<String> lineas = new ArrayList<>();
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            String linea = br.readLine();
            while (linea != null)
            {
               if (linea.startsWith(clave))
               {
                  int confirmar = JOptionPane.showConfirmDialog(null, "Se ha encontrado:\n"
                        + linea + "\n¿Seguro que quiere modificar?", "Confirmar Modificacion", JOptionPane.YES_NO_OPTION);
                  if (confirmar == JOptionPane.YES_OPTION)
                  {
                     lineas.add(getLineaModificada(linea));
                  }
                  else//No quiere modificar
                     lineas.add(linea);
               }
               else//Linea no coincide con clave
                  lineas.add(linea);
               
               linea = br.readLine();
            }
            br.close();
            //Guardamos los cambios en el archivo.
            if (archivo.delete())
            {
               BufferedWriter bw = new BufferedWriter(new FileWriter(archivo, true));
               for (String line: lineas)
               {
                  bw.write(line);
                  bw.newLine();
               }
               bw.close();
               JOptionPane.showMessageDialog(null, "Los cambios se han guardado");
            }
            else//Por algun motivo, no se ha podido borrar el archivo
            {
               JOptionPane.showMessageDialog(null, "No se ha podido modificar el archivo: " + archivo.getAbsolutePath());
            }

         }catch(Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
         }
      }
      else//No existe archivo
         JOptionPane.showMessageDialog(null, "No existe fichero: " + archivo.getAbsolutePath());
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
        Exportar();
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