package WebService_Rest_BD;

import java.util.List;

public interface IAutor {
//declaramos los metodos...
	void registrarAutor(ClassAutor classautor);
	void actualizarAutor(ClassAutor classautor);
	void eliminarAutor(ClassAutor classautor);
	ClassAutor buscarAutor(ClassAutor classautor);
	List<ClassAutor> listadoAutor();
	
}  //fin de la interface...
