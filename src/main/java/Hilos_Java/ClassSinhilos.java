package Hilos_Java;

public class ClassSinhilos {

	public static void main(String[] args) {
		 //*********proceso uno
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
	
	//******** proceso dos
		//suma de los primeros numeros impares del 1 al 10
		//acumulador
		int sumaimpares=0;
		//aplicamos un bucle
		for(int y=1;y<=10;y++) {
			//aplicamos una condicion
			if(y%2!=0) {
				//imprimimos mensaje por panta....
				System.out.println("impares "+y);
				sumaimpares=sumaimpares+y;
			}
		} //fin del bucle
	
		//imprimimos por pantalla
		System.out.println("la suma de los impares es "+sumaimpares);
	
	} //fin del metodo....
	
	
	
} //fin de la clase.....
