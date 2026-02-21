package Hilos_Organizacion;

public class ClassThreadOrganizacionV extends Thread {

	@Override
	public void run() {
		//aplicamos un bucle
		for(int f=1;f<=8;f++) {
			//imprimimos por pantalla
			System.out.print("R");
			try {
				ClassThreadOrganizacionV.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  //fin del try....
		} //fin del bucle
		
	} //fin del metodo...
	
} //fin de la clase...
