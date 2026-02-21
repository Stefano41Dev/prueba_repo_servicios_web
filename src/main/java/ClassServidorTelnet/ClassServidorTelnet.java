package ClassServidorTelnet;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ClassServidorTelnet {

	//declaramos los objetos...
	ServerSocket server;
	Socket socket;
	int puerto=9001;
	DataOutputStream salida;
	BufferedReader entrada;
	//creamos un metodo  de nombre
	//iniciar...
	public void iniciar() throws IOException {
		//emitimos un mensaje por pantalla..
	System.out.println("esperando conexion desde  un cliente!!!!!!!1");
	server=new ServerSocket(puerto);
	socket=new Socket();
	socket=server.accept();
	entrada=new BufferedReader(new InputStreamReader(socket.getInputStream()));
	String mensaje=entrada.readLine();
	String resp="";
	//aplicamos un switch....
	switch(mensaje) {
	case "enero":
		resp="january";
		break;
	case "febrero":
		resp="february";
		break;
	case "marzo":
		resp="march";
		break;
	case "abril":
		resp="april";
		break;	
	case "mayo":
		resp="may";
		break;
	case "junio":
		resp="june";
		break;
	case "julio":
		resp="july";
		break;
		
	case "agosto":
		resp="august";
		break;	
	case "septiembre":
		resp="september";
		break;
	case "octubre":
		resp="october";
		break;
	case "noviembre":
		resp="november";
		break;
	case "diciembre":
		resp="december";
		break;
		default :
			resp="no se encuentra dentro del rango";
			break;
	} //fin del switch...
		//imprimimos en la consola
	System.out.println("mensaje del cliente "+mensaje);
	salida=new DataOutputStream(socket.getOutputStream());
	salida.writeUTF("el servidor contesta al cliente la traduccion de los meses  de year "+resp);
	//cerramos
	socket.close();
		
	} //fin del metodo....
	
	
	
} //fin de la clase....
