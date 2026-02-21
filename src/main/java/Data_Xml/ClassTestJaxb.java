package Data_Xml;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class ClassTestJaxb {

	public static void main(String[] args) {
		//instanciamos las respectivas clase...
	List<ClassCliente> list=new ArrayList<ClassCliente>();
     ClassCliente cliente=new ClassCliente();
     //agregamos la data cliente
     cliente.setIdcliente(100);
     cliente.setNombre("rosa maria");
     cliente.setApellido("perez");
     cliente.setDni("10456663");
     cliente.setSexo("f");
     cliente.setTelefono("38146856");
     //agregamos al listado
     list.add(cliente);
     ClassCliente clientedos=new ClassCliente();
     //agregamos la data cliente
     clientedos.setIdcliente(200);
     clientedos.setNombre("richard");
     clientedos.setApellido("guevara");
     clientedos.setDni("10456663");
     clientedos.setSexo("m");
     clientedos.setTelefono("38146856");
     //agregamos al listado
     list.add(clientedos);
     ClassCliente clientetres=new ClassCliente();
     //agregamos la data cliente
     clientetres.setIdcliente(300);
     clientetres.setNombre("jazmin");
     clientetres.setApellido("rivera");
     clientetres.setDni("10456663");
     clientetres.setSexo("f");
     clientetres.setTelefono("38146856");
     //agregamos al listado
     list.add(clientetres);
     //instanciamos la clase tipo cliente
     ClassTipoCliente cltipo=new ClassTipoCliente();
     //asignamos al listado
     cltipo.setCliente(list);
     //aplicamos jaxb....
     try {
		JAXBContext con=JAXBContext.newInstance(ClassTipoCliente.class);
	//aplicamos la clase marshalling..
		//vinculamos marshaller con jaxbcont...
		Marshaller mar=con.createMarshaller();
        //preparamos el formato
		//para el archivo xml
		mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
		//aplicamos la clase file...
		File archivoxml=new File("C:/archivoxml/cliente2026.xml");
          mar.marshal(cltipo,archivoxml);
          //emitimos un mensaje por consola
          System.out.println("archivo convertido");
     } catch (JAXBException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}  //fin del catch.....
     
     
     
     
	} //fin del metodo...

} //fin de la clase...
