package Hilos_Java;

public class TestClassThreadParametros {

	public static void main(String[] args) {
		//instanciamos la respectiva clase...
		ClassThreadParametros clasparam=new ClassThreadParametros("hilosconnumpares");
		//agregamos el valor que el programa tiene que sumar
		clasparam.agregarParam(5);
		//ejecutamos el hilo
		clasparam.start();

	} //fin del metodo principal...

} //fin de la clase...
