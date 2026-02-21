package Hilos_Java;

public class ClassThreadParametros extends Thread {
//declaramos una variable global
	int num;
	//creamos un constructor
	public ClassThreadParametros(String nomhilo) {
		//aplicamos el metodo super...
		super(nomhilo);
	} //fin del constructor...
	//aplicamos  el metodo run...
	@Override
	public void run() {
		//acumulador
		int sumapares=0;
		//suma de los 10 primeros numeros pares
		//aplicamos un bucle for....
		for(int x=1;x<=num;x++) {
			//aplicamos una condicion
			if(x%2==0) {
				
				//imprimimos mensaje por pantalla
				System.out.println("pares "+x+" "+this.getName());
				sumapares=sumapares+x;
			} //fin de la condicion...
		} //fin del bucle
		//imprimimos la respuesta por pantalla
		System.out.println("la suma de los pares es "+sumapares);	
	} //fin del metodo run
	//creamos otro metodo
	public void agregarParam(int y) {
		this.num=y;
	} //fin del metodo
	
} //fin de la clase....
