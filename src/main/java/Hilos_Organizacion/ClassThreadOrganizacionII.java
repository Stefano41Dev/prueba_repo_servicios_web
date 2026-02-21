package Hilos_Organizacion;

public class ClassThreadOrganizacionII extends Thread {

	@Override
	public void run() {
		//aplicamos un bucle
		for(int b=1;b<=8;b++) {
			//imprimimos por pantalla
			System.out.print("I");
			try {
				ClassThreadOrganizacionII.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  //fin del try....
		} //fin del bucle
		
	} //fin del metodo...
	
} //fin de la clase...
