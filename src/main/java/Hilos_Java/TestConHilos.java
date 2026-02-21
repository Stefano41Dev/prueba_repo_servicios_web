package Hilos_Java;

public class TestConHilos {

	public static void main(String[] args) {
		//instanciamos la respectiva clases...
		  //clase thread...
		ClassThreadHilos classherencia=new ClassThreadHilos();
		  //interface...
		Thread classinterface=new Thread(new ClassRunnableHilos());

		//ejecutamos los respectivos hilos
		classherencia.start();
		classinterface.start();
		
	} //fin del metodo principal...

} //fin de la clase...
