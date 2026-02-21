package Data_flujos;

import java.io.DataInputStream;
import java.io.IOException;

public class TestStreamsEjemplo_I {

	public static void main(String[] args) {
		//instanciamos la clase datainputstream....
		DataInputStream operacion=new DataInputStream(System.in);
         //declaramos numeros de tipos enteros
		//imprimimos un mensaje  por pantalla...
		System.out.println("ingrese los numeros solicitados");
		try {
			int a=Integer.parseInt(operacion.readLine());
			int b=Integer.parseInt(operacion.readLine());
			int c=Integer.parseInt(operacion.readLine());
			//calculamos la suma de los enteros correpondientes
			int suma=a+b+c;
			//imprimimos el resultado por pantalla
			System.out.println("la suma de los numeros es "+suma);
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	} //fin del metodo....

}
