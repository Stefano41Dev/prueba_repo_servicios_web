package WebService_Rest_BD;

public class ClassAutor {
	//declaramos los atributos...
	private int idautor;
	private String nomautor;
	private String descripcion;
	
	public ClassAutor() {
		
	} //fin del constructor vacio...
	
	
	public ClassAutor(int idautor, String nomautor, String descripcion) {
		//super();
		this.idautor = idautor;
		this.nomautor = nomautor;
		this.descripcion = descripcion;
	}  //fin de constructor....


	public int getIdautor() {
		return idautor;
	}
	public void setIdautor(int idautor) {
		this.idautor = idautor;
	}
	public String getNomautor() {
		return nomautor;
	}
	public void setNomautor(String nomautor) {
		this.nomautor = nomautor;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	

}  //fin de la clase...
