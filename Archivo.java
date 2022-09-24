import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Archivo {

    public String ver(File archivo) throws FileNotFoundException, IOException {
        BufferedReader obj = new BufferedReader(new FileReader(archivo));

        String strng;
        String salida = " ";
        while ((strng = obj.readLine()) != null) {
            salida += strng;
            System.out.println(strng);
        }

        obj.close();
        return salida.trim();
    }

    public String importar(String categoria, String extension) {
        JFileChooser elegirArchivo = new JFileChooser();
        elegirArchivo.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

        FileNameExtensionFilter imgFilter = new FileNameExtensionFilter(categoria, extension);
        elegirArchivo.setFileFilter(imgFilter);

        int result = elegirArchivo.showOpenDialog(null);

        if (result != JFileChooser.CANCEL_OPTION) {

            File fileName = elegirArchivo.getSelectedFile();

            if ((fileName == null) || (fileName.getName().equals(""))) {
                System.out.println("Error");
                return null;
            } else {
                try {
                    return this.ver(fileName);
                } catch (IOException ex) {
                    //Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return null;
    }
    
    public int guardar(String categoria, String extension, String contenido){
        JFileChooser elegirArchivo = new JFileChooser();
        elegirArchivo.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

        FileNameExtensionFilter imgFilter = new FileNameExtensionFilter(categoria, extension);
        elegirArchivo.setFileFilter(imgFilter);

        int result = elegirArchivo.showSaveDialog(null);

        if (result != JFileChooser.CANCEL_OPTION) {

            File fileName = elegirArchivo.getSelectedFile();

            if ((fileName == null) || (fileName.getName().equals(""))) {
                System.out.println("Error");
                return 2;
            } else {
                return escribir(fileName, contenido, extension);
            }
        }
        return 2;
    }

    public static int escribir(File archivo, String contenido, String extension) {
        try {
            // Si el archivo existe regresa un 1
            if (archivo.exists()) {
                return 1;
            }

            archivo.createNewFile();
            FileWriter fw = new FileWriter(archivo + ".txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
            return 2;
        }
        return 0;
    }

}