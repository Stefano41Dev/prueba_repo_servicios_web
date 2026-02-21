package WebService_Rest_BD;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class ClassAutorImp implements IAutor {
	@Override
	public void registrarAutor(ClassAutor classautor) {
		//realizamos la cadena....
		String sql="insert into tbl_autor values(null,?,?)";
		//la interface para la bd...
		PreparedStatement ps=null;
		//vinculamos con la bd...
		try {
			ps=ConectarBD.getConexion().prepareCall(sql);
			//pasamos los parametros..
			ps.setString(1,classautor.getNomautor());
			ps.setString(2,classautor.getDescripcion());
			//realizamos la ejecucion...
			int x=ps.executeUpdate();
			//aplicamos una condicion...
			if(x>0) {
				//emitimos mensaje por consola..
				System.out.println("Dato registrado en bd !!!!");
			} //fin de la condicion...
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //fin del catch....
		
	}  //fin del metodo

	@Override
	public void actualizarAutor(ClassAutor classautor) {
		//realizamos la cadena....
				String sql="update tbl_autor set nomautor=?,descripcion=? where idautor=?";
				//la interface para la bd...
				PreparedStatement ps=null;
				//vinculamos con la bd...
				try {
					ps=ConectarBD.getConexion().prepareCall(sql);
					//pasamos los parametros..
					ps.setString(1,classautor.getNomautor());
					ps.setString(2,classautor.getDescripcion());
					ps.setInt(3,classautor.getIdautor());
					//realizamos la ejecucion...
					int x=ps.executeUpdate();
					//aplicamos una condicion...
					if(x>0) {
						//emitimos mensaje por consola..
						System.out.println("Dato actualizado en bd !!!!");
					} //fin de la condicion...
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} //fin del catch....
		
	} //fin del metodo

	@Override
	public void eliminarAutor(ClassAutor classautor) {

		//realizamos la cadena....
				String sql="delete from tbl_autor where idautor=?";
				//la interface para la bd...
				PreparedStatement ps=null;
				//vinculamos con la bd...
				try {
					ps=ConectarBD.getConexion().prepareCall(sql);
					//pasamos el parametro..
				       ps.setInt(1,classautor.getIdautor());
					//realizamos la ejecucion...
					int x=ps.executeUpdate();
					//aplicamos una condicion...
					if(x>0) {
						//emitimos mensaje por consola..
						System.out.println("Dato eliminado en bd !!!!");
					} //fin de la condicion...
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} //fin del catch....
		
	} //fin del metodo....

	@Override
	public ClassAutor buscarAutor(ClassAutor classautor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ClassAutor> listadoAutor() {
		// TODO Auto-generated method stub
		return null;
	} //fin del metodo...

}
