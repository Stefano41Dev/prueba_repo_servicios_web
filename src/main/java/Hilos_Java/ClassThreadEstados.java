package Hilos_Java;

public class ClassThreadEstados extends Thread {
@Override
public void run() {
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
			//hacemos un retardo de (2 segundos) 2000 milisegundos
			try {
				ClassThreadEstados.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //fin del catch....			
		} //fin de la condicion...
	} //fin del bucle

	//imprimimos por pantalla
	System.out.println("la suma de los impares es "+sumaimpares);

} //fin del metodo run....
} //fin de la clase
