import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Barra extends JFrame
{
    private JTextArea ta;
    private JTextField tf;
    JScrollPane jp;

    public Barra()
    {
       super("Text Area");
       tf=new JTextField();
       tf.setBounds(100,350,300,30);
       add(tf);
       ta=new JTextArea();
       ta.setBounds(100,100,300,200);
       jp= new JScrollPane(ta);
       add(jp);
       setLayout(null);
       setSize(500,500);
       setVisible(true);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }

   public static void main(String...s)
   {
      new Barra();
   }
}
