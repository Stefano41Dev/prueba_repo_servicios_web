package WebService_Rest_BD;

public class TestCrudAutor {

	public static void main(String[] args) {
		//realizamos la respectiva instancia...
		ClassAutor clautor=new ClassAutor();
		ClassAutorImp climp=new ClassAutorImp();
		//************registrar
		//insertamos datos nuevos..
		//clautor.setNomautor("Ing. Jetli huanaco");
		//clautor.setDescripcion("ciberseguridad");
		//invocamos al metodo...
		//climp.registrarAutor(clautor);
		
		//*************actualizar....
		clautor.setIdautor(4);
		clautor.setNomautor("mauro");
		clautor.setDescripcion("inteligenci artificial");
		
		
		climp.actualizarAutor(clautor);

	} //fin del metodo....

}
