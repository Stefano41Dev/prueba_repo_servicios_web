package Hilos_Organizacion;

public class ClassThreadOrganizacionVII extends Thread {

	@Override
	public void run() {
		//aplicamos un bucle
		for(int h=1;h<=8;h++) {
			//imprimimos por pantalla
			System.out.print("E");
			try {
				ClassThreadOrganizacionVII.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  //fin del try....
		} //fin del bucle
		
	} //fin del metodo...
	
} //fin de la clase...
