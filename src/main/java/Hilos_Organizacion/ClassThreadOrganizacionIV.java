package Hilos_Organizacion;

public class ClassThreadOrganizacionIV extends Thread {

	@Override
	public void run() {
		//aplicamos un bucle
		for(int d=1;d<=8;d++) {
			//imprimimos por pantalla
			System.out.print("E");
			try {
				ClassThreadOrganizacionIV.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  //fin del try....
		} //fin del bucle
		
	} //fin del metodo...
	
} //fin de la clase...
