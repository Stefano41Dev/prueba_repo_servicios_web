package Hilos_Organizacion;

public class ClassThreadOrganizacionVI extends Thread {

	@Override
	public void run() {
		//aplicamos un bucle
		for(int g=1;g<=8;g++) {
			//imprimimos por pantalla
			System.out.print("T");
			try {
				ClassThreadOrganizacionVI.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  //fin del try....
		} //fin del bucle
		
	} //fin del metodo...
	
} //fin de la clase...
