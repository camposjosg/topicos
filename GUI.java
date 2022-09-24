import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.*;
import java.awt.*;

public class GUI {

    JFrame ventana = new JFrame();
    JPanel panel = new JPanel();
    JScrollPane panelDeslizable = new JScrollPane();
    JTextArea textoPlano = new JTextArea();
    JTextArea textoCifrado = new JTextArea();
    JButton botonCargarPlano = new JButton();
    JButton botonCargarEncriptado = new JButton();
    JButton botonGuardarPlano = new JButton();
    JButton botonGuardarEncriptado = new JButton();
    JButton botonEncriptar = new JButton();
    JButton botonDesencriptar = new JButton();
    JLabel labelTitulo = new JLabel();
    JLabel labelPlano = new JLabel();
    JLabel labelEncriptado = new JLabel();
    Controller manejador = new Controller();

    public GUI() {
        initFrame();
        initPanel();
        initTextBox();
        initButtons();
        initLabels();
        eventos();

        addComponents();
    }

    private void initFrame() {
        ventana.setTitle("CifradoIrving");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(1000, 600);
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);

        ventana.setVisible(true);
    }

    private void initPanel() {
        panel.setLayout(null);
    }

    private void initTextBox() {
        textoPlano.setBounds(30, 50, 925, 100);
        textoPlano.setBackground(Color.white);
        textoPlano.setLineWrap(true);
        textoPlano.setWrapStyleWord(true);
        textoPlano.setFont(new Font("Monospace", Font.PLAIN, 16));

        textoCifrado.setBounds(30, 240, 925, 100);
        textoCifrado.setBackground(Color.cyan);
        textoCifrado.setLineWrap(true);
        textoCifrado.setWrapStyleWord(true);
        textoCifrado.setFont(new Font("Monospace", Font.PLAIN, 16));

    }


    private void initButtons() {
        botonEncriptar.setText("CIFRAR");
        botonEncriptar.setFont(new Font("Arial", Font.BOLD, 12));
        botonEncriptar.setBounds(855, 150, 100, 50);

        botonDesencriptar.setText("DESCRIFRAR");
        botonDesencriptar.setFont(new Font("Arial", Font.BOLD, 12));
        botonDesencriptar.setBounds(805, 340, 150, 50);

        botonCargarPlano.setText("Cargar");
        botonCargarPlano.setBounds(29, 150, 120, 30);

        botonGuardarPlano.setText("Guardar");
        botonGuardarPlano.setBounds(160, 150, 120, 30);

        botonCargarEncriptado.setText("Cargar");
        botonCargarEncriptado.setBounds(29, 340, 120, 30);

        botonGuardarEncriptado.setText("Guardar");
        botonGuardarEncriptado.setBounds(160, 340, 120, 30);
    }

    private void initLabels() {
        labelPlano.setText("Plano");
        labelPlano.setFont(new Font("Arial", Font.BOLD, 18));
        labelPlano.setBounds(-95, 10, 300, 50);
        labelPlano.setHorizontalAlignment(JLabel.CENTER);


        labelEncriptado.setText("Cifrado");
        labelEncriptado.setFont(new Font("Arial", Font.BOLD, 18));
        labelEncriptado.setBounds(-87, 200, 300, 50);
        labelEncriptado.setHorizontalAlignment(JLabel.CENTER);

        panelDeslizable.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        panelDeslizable.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

    }

    private void addComponents() {
        panel.add(panelDeslizable);
        panel.add(textoPlano);
        panel.add(textoCifrado);
        panel.add(botonEncriptar);
        panel.add(botonDesencriptar);
        panel.add(botonCargarPlano);
        panel.add(botonCargarEncriptado);
        panel.add(botonGuardarPlano);
        panel.add(botonGuardarEncriptado);
        panel.add(labelTitulo);
        panel.add(labelPlano);
        panel.add(labelEncriptado);


        ventana.add(panel);
    }

    // Eventos
    // importar texto plano
    public void eventos() {
        botonCargarPlano.addActionListener((ActionEvent e) -> {
            textoPlano.setText(manejador.openFileTextPlain());
        });

        botonCargarEncriptado.addActionListener((ActionEvent e) -> {
            textoCifrado.setText(manejador.openFileCifrado());
        });

        botonGuardarPlano.addActionListener((ActionEvent e) -> {
            manejador.guardarPlano(textoPlano.getText());
        });

        botonGuardarEncriptado.addActionListener((ActionEvent e) -> {
            manejador.guardarEncriptado(textoCifrado.getText());
        });

        botonEncriptar.addActionListener((ActionEvent e) -> {
            textoCifrado.setText(manejador.cifrarTexto(textoPlano.getText()));
        });

        botonDesencriptar.addActionListener((ActionEvent e) -> {
            textoPlano.setText(manejador.decifrarTexto(textoCifrado.getText()));
        });
    }

    public static void main(String[] args) {
        new GUI();
    }
}
