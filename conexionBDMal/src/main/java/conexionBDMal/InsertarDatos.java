package conexionBDMal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertarDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		Statement stmt = null;

		String sql = "INSERT INTO Profesores (id, nif, nombre, edad)" + "VALUES (1, '111111', 'Gabi', '28')";
		
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/Cenec", "root", "");
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			System.out.println("Datos insertados en la tabla Profesores");
			conn.close();
			stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
