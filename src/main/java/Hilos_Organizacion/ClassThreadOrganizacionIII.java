package Hilos_Organizacion;

public class ClassThreadOrganizacionIII extends Thread {

	@Override
	public void run() {
		//aplicamos un bucle
		for(int c=1;c<=8;c++) {
			//imprimimos por pantalla
			System.out.print("B");
			try {
				ClassThreadOrganizacionIII.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  //fin del try....
		} //fin del bucle
		
	} //fin del metodo...
	
} //fin de la clase...
