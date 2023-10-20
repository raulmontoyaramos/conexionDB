package conexionBDMal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MostrarDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		Statement stmt = null;

		String sql = "SELECT * FROM Profesores";
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/Cenec", "root", "");
			stmt = conn.createStatement();
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next()) {
				int id=rs.getInt("id");
				String nif=rs.getString("nif");
				String nombre=rs.getString("nombre");
				String edad=rs.getString("edad");
				System.out.println("ID: "+id+"\nNIF: "+nif+"\nNombre: "+nombre+"\nEdad: "+edad);
				
			}
			conn.close();
			stmt.close();
			rs.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
