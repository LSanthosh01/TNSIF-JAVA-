package Jdbc;
import java.sql.*;

public class Jdbcutil {
	
	static final String URL="jdbc:mysql://localhost:3306/jdbc";
	static final String USER="root";
	static final String PASSWORD="jdbc123";
	static Connection conn;
	
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			conn=DriverManager.getConnection(URL,USER,PASSWORD);
		}
		catch(SQLException | ClassNotFoundException e)
		{
			System.err.println(e);
		}
		return conn;
		
	}

}
