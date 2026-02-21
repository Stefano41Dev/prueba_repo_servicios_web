package Data_flujos;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestStreamsEjemplo_II {

	public static void main(String[] args) throws IOException {
		//creamos una carpeta 
		//en la unidad "c"
		//nombre de la carpeta cursos2026
String ruta="C:/cursos2026/cursosprogramacion.txt";
  //aplicamos la clase fileoutputstream...
try {
	FileOutputStream archivo=new FileOutputStream(ruta);
	//vinculamos con la clase dataoutputstream....
	DataOutputStream entrada=new DataOutputStream(archivo);
	//asignamos valores en una variable de tipo string...
	String cursoprog="Cursos de programacion: Lenguaje de programacion I,"
			+ "Lenguaje de programacion II,Base de datos,"
			+ "Base de datos avanzado";
	//escribimos en el archivo
	entrada.writeUTF(cursoprog);
	//cerramos el flujo
	entrada.close();
	//realizamos la respectiva lectura...
	//aplicamos la clase fileinputstream....
	FileInputStream leerarchivo=new FileInputStream(ruta);
	//vinculamos la clase fileinputstream  con la clase datainputstream...
	DataInputStream lectura=new DataInputStream(leerarchivo);
	//imprimimos por pantalla
	System.out.println(lectura.readUTF());
	//cerramos el flujo
	lectura.close();
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


	} //fin del metodo.....

}
