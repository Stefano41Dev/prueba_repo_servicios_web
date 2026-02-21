package ClassServidorTelnet;

import java.io.IOException;

public class TestServidorTelnet {

	public static void main(String[] args) {
		//instanciamos la respectiva clase...
		ClassServidorTelnet clstelnet=new ClassServidorTelnet();
		//invocamos el metodo
		try {
			clstelnet.iniciar();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //fin del catch...

	} //fin del metodo....

} //fin de clase....
