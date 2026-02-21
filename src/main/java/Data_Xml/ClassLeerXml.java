package Data_Xml;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class ClassLeerXml {

	//creamos un metodo leeexml
	public void leerXml() {
	
		//aplicamos  JAXB...
		try {
		JAXBContext leerxml=JAXBContext.newInstance(ClassTipoCliente.class);
		Unmarshaller leer=leerxml.createUnmarshaller();
		//aplicamos un clase file para ubicar
		//el archivo que se va  a dar lectura...
		File leerarchivoxml=new File("C:/archivoxml/cliente2026.xml");
		//creamos un objeto de tipo classtipocliente
		ClassTipoCliente tipoleer=(ClassTipoCliente) leer.unmarshal(leerarchivoxml);
		//aplicamos un bucle for...
		for(ClassCliente cli:tipoleer.getCliente()) {
			//imprimimos por pantalla los datos
			//recuperados del archivo...
			System.out.println("codigo "+cli.getIdcliente()+
					"\n"+" nombre "+cli.getNombre()+
					"\n"+" apellido "+cli.getApellido()+"\n"+" dni "
					+cli.getDni()+"\n"+" sexo "+cli.getSexo()+"\n"+
					" telefono "+cli.getTelefono());
		} //fin del bucle.....
		
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  //fin del catch.....
		
	} //fin del metodo...
	
	
}  //fin de la clase...
