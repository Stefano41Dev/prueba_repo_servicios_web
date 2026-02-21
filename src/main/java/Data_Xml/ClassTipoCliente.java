package Data_Xml;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ClassTipoCliente {
//declaramos los atributos...
	private int idcliente;
	private String nombre;
	//declaramos una variable de tipo
	//cliente
	
	private List<ClassCliente> cliente;
	
	public ClassTipoCliente() {
		
	} //fin del constructor vacio...

	//@XmlElement(name="cliente")
	
	public int getIdcliente() {
		return idcliente;
	}

	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<ClassCliente> getCliente() {
		return cliente;
	}

	public void setCliente(List<ClassCliente> cliente) {
		this.cliente = cliente;
	}
	
} //fin de  la clase...
