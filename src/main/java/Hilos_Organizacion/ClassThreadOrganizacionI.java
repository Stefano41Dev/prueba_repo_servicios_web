package Hilos_Organizacion;

public class ClassThreadOrganizacionI extends Thread {

	@Override
	public void run() {
		//aplicamos un bucle
		for(int a=1;a<=8;a++) {
			//imprimimos por pantalla
			System.out.print("C");
			try {
				ClassThreadOrganizacionI.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  //fin del try....
		} //fin del bucle
		
	} //fin del metodo...
	
} //fin de la clase...
