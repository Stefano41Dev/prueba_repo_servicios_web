package Hilos_Organizacion;

public class TestHilosOrganizacion {

	public static void main(String[] args) throws InterruptedException {
		//aplicamos los estados
		
		ClassThreadOrganizacionI hilo1=new ClassThreadOrganizacionI();
		ClassThreadOrganizacionII hilo2=new ClassThreadOrganizacionII();
		ClassThreadOrganizacionIII hilo3=new ClassThreadOrganizacionIII();
		ClassThreadOrganizacionIV hilo4=new ClassThreadOrganizacionIV();
		ClassThreadOrganizacionV hilo5=new ClassThreadOrganizacionV();
		ClassThreadOrganizacionVI hilo6=new ClassThreadOrganizacionVI();
		ClassThreadOrganizacionVII hilo7=new ClassThreadOrganizacionVII();
		ClassThreadOrganizacionVIII hilo8=new ClassThreadOrganizacionVIII();
		hilo1.start();
		hilo1.sleep(100);
		
		hilo2.start();
		hilo2.sleep(100);
		
		hilo3.start();
		hilo3.sleep(100);
		
		hilo4.start();
		hilo4.sleep(100);
		
		hilo5.start();
		hilo5.sleep(100);
		
		hilo6.start();
		hilo6.sleep(100);
		
		hilo7.start();
		hilo7.sleep(100);
		
		hilo8.start();
		hilo8.sleep(100);
		
		
	} //fin del metodo

}
