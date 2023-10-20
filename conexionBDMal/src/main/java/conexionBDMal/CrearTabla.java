package conexionBDMal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CrearTabla {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;

		String sql = "CREATE TABLE Profesores (id INT PRIMARY KEY," + "nif VARCHAR(10) NOT NULL,"
				+ "nombre VARCHAR(60) NOT NULL," + "edad VARCHAR(2))";
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/Cenec", "root", "");
			stmt = conn.createStatement();
			stmt.execute(sql);
			System.out.println("Creada la tabla Profesores");
			conn.close();
			stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
