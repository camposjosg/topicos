public class Cifrado {

    public static String cifrar(String textoPlano) {
        
        String[] frases = textoPlano.trim().split("\\ ");
        String cifrado = " ";
        int ascciAux;

        for (int i = 0; i < frases.length; i++) {
            String aux_1 = "";
            String aux_2 = "";
            String aux_3 = "";

        
            for (int j = 0; j < frases[i].length(); j++) {
                ascciAux = (int) frases[i].charAt(j);

              
                if ((ascciAux >= 65 && ascciAux <= 90)
                        || (ascciAux >= 97 && ascciAux <= 122)) {
                    aux_1 += (char) ((int) frases[i].charAt(j) + 3);
                } else {
                    aux_1 += frases[i].charAt(j);
                }
            }

        
            aux_1 = truncado(aux_1);
            aux_2 = aux_1.substring((int) aux_1.length() / 2);

            for (int k = 0; k < aux_2.length(); k++) {
                aux_3 += (char) ((int) aux_2.charAt(k) - 1);
            }

          
            cifrado += aux_1.substring(0, (int) aux_1.length() / 2);
            cifrado += aux_3 + " ";
        }
        return cifrado;
    }
    
   
    public static String decifrar(String textoCifrado) {
      
        String[] frases = textoCifrado.trim().split("\\ ");
        String decifrado = " ";
        int ascciAux;

        for (int i = 0; i < frases.length; i++) {
            String aux_1 = "";
            String aux_2 = "";
            String aux_3 = "";
            
            aux_1 = frases[i].substring((int) frases[i].length() / 2);
            
            for (int k = 0; k < aux_1.length(); k++) {
                aux_2 += (char) ((int) aux_1.charAt(k) + 1);
            }
            
            aux_3 += frases[i].substring(0, (int) frases[i].length() / 2);
            aux_3 += aux_2;
            
            aux_3 = truncado(aux_3);

            for (int j = 0; j < aux_3.length(); j++) {
                ascciAux = (int) aux_3.charAt(j);
                
                if ((ascciAux >= 68 && ascciAux <= 93)
                        || (ascciAux >= 97 && ascciAux <= 125)) {
                    decifrado += (char) ((int) aux_3.charAt(j) - 3);
                } else {
                    decifrado += aux_3.charAt(j);
                }
            }

            decifrado += " ";
        }


        return decifrado;
    }


    public static String truncado(String cadena) {
        String cadenaInvertida = "";
        for (int x = cadena.length() - 1; x >= 0; x--) {
            cadenaInvertida = cadenaInvertida + cadena.charAt(x);
        }
        return cadenaInvertida;
    }
}