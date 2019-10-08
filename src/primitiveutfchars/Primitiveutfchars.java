
package primitiveutfchars;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class Primitiveutfchars {

   
    public static void main(String[] args) throws FileNotFoundException, IOException {
        /*Propoñovos un exercicio que consistirá grabar unha mesma cadea  de texto tres veces usando dous metodos distintos (writeUTF e writeChars) nun ficheiro denominado text6.txt para posteriormente recuperalos.
Lembrade que para recuperar unha cadea de gravada con witeUTF debedes usar readUTF
Pero para recuperar unha cadea escrita con writeChars debedes usar readChar() que so lé un caracter de cada vez , isto implca que debedes usar un bucle que faga tantas lecturas como caracteres ten a cadea orixinal.
*/
        FileOutputStream escritura = null;
        BufferedOutputStream escrituraBuffer = null;
        DataOutputStream escrituraData = null;
        
        FileInputStream leer = null;
        BufferedInputStream leerBuffered = null;
        DataInputStream leerData = null;
        String lectura = "";
        
        
        escritura = new FileOutputStream("/home/oracle/Desktop/Eje6/texto5.txt");
        escrituraBuffer = new BufferedOutputStream (escritura);
        escrituraData = new DataOutputStream ( escrituraBuffer);
        
        
        leer = new FileInputStream ("/home/oracle/Desktop/Eje6/texto5.txt");
        leerBuffered = new BufferedInputStream (leer);
        leerData = new DataInputStream(leerBuffered);
        
        
         String frase = "Esta en casa";
        escrituraData.writeUTF(frase);
        escrituraData.writeChars(frase);
        escrituraData.writeUTF(frase);
        escrituraData.close();
        
        
        System.out.println(leerData.readUTF());
         for (int i = 0; i < frase.length(); i++) {
            System.out.print(leerData.readChar());
         }
         
         System.out.println("\n" + leerData.readUTF());
    }
    
}
