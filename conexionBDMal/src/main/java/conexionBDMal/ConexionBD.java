package conexionBDMal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/phoneland", "root", "");
			if (conn != null) {
				System.out.println("Conexión a base de datos ok");
				conn.close();
			}
		} catch (SQLException e) {
			System.out.println("Error en la conexión " + e.getMessage());
		}

	}
}
