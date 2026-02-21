package Hilos_Organizacion;

public class ClassThreadOrganizacionVIII extends Thread {

	@Override
	public void run() {
		//aplicamos un bucle
		for(int m=1;m<=8;m++) {
			//imprimimos por pantalla
			System.out.println("C");
			try {
				ClassThreadOrganizacionVIII.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  //fin del try....
		} //fin del bucle
		
	} //fin del metodo...
	
} //fin de la clase...
