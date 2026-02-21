package Data_flujos;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestStreamEjemplo_III {

	public static void main(String[] args) throws IOException {
		//instanciamos la clase file...
		File objeto=new File("D:/notas.txt");
        try {
			FileOutputStream fos=new FileOutputStream(objeto);
			DataOutputStream  dops=new DataOutputStream(fos);
			//escribimos en la nota.txt
			dops.writeUTF("PERU");
			dops.writeInt(33);
			//cerramos
			dops.close();
			//recuperamos datos para ser leidos
			FileInputStream fis=new FileInputStream(objeto);
			DataInputStream dis=new DataInputStream (fis);
			String pais=dis.readUTF();
			int hab=dis.readInt();
			//imprimimos
System.out.println(pais+" tiene "+hab+" millones de habitantes");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}  //fin del metodo....

}
