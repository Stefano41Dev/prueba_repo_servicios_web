package ServicioSocket;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ClassSocketServidor {

	public static void main(String[] args) throws ClassNotFoundException {
		//aplicamos la clase server socket...
		   //puertos 1024-65535
		try {
			ServerSocket servidor=new ServerSocket(4500);
			//emitimos  mensaje por consola...
			System.out.println("servidor a la escucha de peticiones");
			Socket clienteservidor=servidor.accept();//aceptamos la peticion...
			ObjectInputStream recibir=new ObjectInputStream(clienteservidor.getInputStream());
		     //imprimimos un mensaje por pantalla
			System.out.println("mensaje llegado con EXITO!!!!!");
		   //almacenamos el mensaje en variable de tipo cadena
			String mensaje=(String) recibir.readObject();
			//imprimimos el mensaje del cliente por pantalla
			System.out.println("mensaje desde el cliente "+mensaje);
			//salida desde el servidor...
			//streams
			ObjectOutputStream enviar=new ObjectOutputStream(clienteservidor.getOutputStream());
			//respondemos al cliente
			enviar.writeObject("hola cliente la capital del PERU ES LIMA");
			//cerramos
			clienteservidor.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	} //fin del metodo principal...

} //fin de  la clase....
