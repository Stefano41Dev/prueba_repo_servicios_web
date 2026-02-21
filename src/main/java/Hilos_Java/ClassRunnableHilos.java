package Hilos_Java;

public class ClassRunnableHilos implements Runnable {

	@Override
	public void run() {
		//acumulador
				int sumapares=0;
				//suma de los 10 primeros numeros pares
				//aplicamos un bucle for....
				for(int x=1;x<=10;x++) {
					//aplicamos una condicion
					if(x%2==0) {
						//imprimimos mensaje por pantalla
						System.out.println("pares "+x);
						sumapares=sumapares+x;
					} //fin de la condicion...
				} //fin del bucle
				//imprimimos la respuesta por pantalla
				System.out.println("la suma de los pares es "+sumapares);
		
	} //fin del metodo....

}  //fin de la clase....
