import javax.swing.JOptionPane;

public class Controlador {

    public String openFileTextPlain() {
        return new Documento().importar(".txt", "txt");
    }
    
    public String openFileCifrado(){
        return new Documento().importar(".vge", "vge");
    }

    public String cifrarTexto(String textoPlano) {
        return Cifrado.cifrar(textoPlano);
    }

    public String decifrarTexto(String textoCifrado) {
        return Cifrado.decifrar(textoCifrado);
    }

    public void guardarPlano(String textoPlano) {

        int r = new Documento().guardar(".txt" ,".txt", textoPlano);
        if (r == 1) {
            JOptionPane.showMessageDialog(null, "Ya existe un archivo con ese nombre",
                    "Documento ya existe", JOptionPane.ERROR_MESSAGE);
        }else if(r == 0){
            JOptionPane.showMessageDialog(null, "Documento guardado con exito",
                    "Documento guardado", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void guardarEncriptado(String textoCifrado) {
        int r = 0;
        r = new Documento().guardar(".vge", ".vge", textoCifrado);
        if (r == 1) {
            JOptionPane.showMessageDialog(null, "Ya existe un archivo con ese nombre",
                    "Documento ya existe", JOptionPane.ERROR_MESSAGE);
        }else if(r == 0){
            JOptionPane.showMessageDialog(null, "Documento guardado con exito",
                    "Documento guardado", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}