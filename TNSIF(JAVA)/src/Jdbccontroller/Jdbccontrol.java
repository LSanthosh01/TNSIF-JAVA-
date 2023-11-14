package Jdbccontroller;
import java.sql.*;
import Jdbc.Jdbcutil;

public class Jdbccontrol {
	static PreparedStatement p;
	static Connection conn;
	public static void create(String name,double salary)
	{
		conn=Jdbcutil.getConnection();
		try
		{
			p=conn.prepareStatement("INSERT INTO employees(name,salary)values(?,?)");
			p.setString(1, name);
			p.setDouble(2, salary);
			
			if(!p.execute())
			{
				System.out.println("Record inserted successfully!");
			}
		}
		catch(SQLException e)
		{
			System.err.println(e);
		}
	}
	public static void update(int empID,String name,double salary)
	{
		conn=Jdbcutil.getConnection();
		try
		{
			p=conn.prepareStatement("UPDATE employees SET name=?,salary=?where empID=?;");
			p.setString(1, name);
			p.setDouble(2, salary);
			p.setInt(3, empID);
			
			if(!p.execute())
			{
				System.out.println("Record updated successfully!");
			}
		}
		catch(SQLException e)
		{
			System.err.println(e);
		}
	}
	
	public static void delete(int empID)
	{
		conn=Jdbcutil.getConnection();
		try
		{
			p=conn.prepareStatement("DELETE FROM employees where empID=?");
			p.setInt(1, empID);
			
			if(!p.execute())
			{
				System.out.println("Record removed successfully!");
			}
		}
		catch(SQLException e)
		{
			System.err.println(e);
		}
	}
	
	public static void display()
	{
		conn=Jdbcutil.getConnection();
		try
		{
			p=conn.prepareStatement("SELECT * FROM employees ");
			ResultSet r=p.executeQuery();
			while(r.next())
			{
				
				System.out.printf("%-10s%-15s%-15s\n",r.getInt("empID"),r.getString("name"),r.getString("salary"));
			}
		}
		catch(SQLException e)
		{
			System.err.println(e);
		}
	}

}
