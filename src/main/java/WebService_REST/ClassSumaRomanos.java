package WebService_REST;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/operacion")
public class ClassSumaRomanos {
@GET
@Path("/Romanos")
@Produces(MediaType.APPLICATION_JSON)
public Response resultado(@QueryParam("num1") int a,
		@QueryParam("num2") int b) {
	//hacemos el respectivo calculo
	int resultado=a+b;
	//declaramos una variable de tipo string....
	String numromano="";
	//aplicamos un switch....
        switch(resultado) {
        case 2:
        	numromano="II";
        	//salimos
        	break;
        case 3:
        	numromano="III";
        	//salimos
        	break;	
        case 4:
        	numromano="IV";
        	//salimos
        	break;
        case 5:
        	numromano="V";
        	//salimos
        	break;	
        case 6:
        	numromano="VI";
        	//salimos
        	break;	
        case 7:
        	numromano="VII";
        	//salimos
        	break;	
        case 8:
        	numromano="VII";
        	//salimos
        	break;	
        case 9:
        	numromano="IX";
        	//salimos
        	break;	
        case 10:
        	numromano="X";
        	//salimos
        	break;	
        	default:
        		numromano="fuera de rango";
        	
        } //fin del switch....
        //retornamos la suma
        //de 2 numeros en romano
        return Response.ok(numromano).build();
} //fin del metodo.....
}  //fin de la clase...
