package Hilos_Java;

public class TestClassThreadEstados {

	public static void main(String[] args) {
		//hacemos las respectivas intancias...
		//1er estado crear el objeto sin ejecutar..
		ClassThreadEstados hilo1=new ClassThreadEstados();
		ClassThreadEstados hilo2=new ClassThreadEstados();
        //segundo estado
		//es cuando se ejecuta el hilo
		hilo1.start();
		//tercer estado
		try {
			hilo1.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //fin del catch...
		//aplicamos el segundo estado
		hilo2.start();
		//cuarto estado
		//hilo2.stop();
	} //fin del metodo principal...

} //fin de la clas....
