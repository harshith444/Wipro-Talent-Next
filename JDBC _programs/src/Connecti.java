import java.sql.*;
public class Connecti{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String s="jdbc:mysql://localhost:3306/blue_bus";
		Connection con=DriverManager.getConnection(s,"root","Harshith@123");
		System.out.println("Database connected Successfully");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from demo1");
		while(rs.next())
		{
			System.out.println("id "+rs.getInt(1)+"Name: "+rs.getString(2));
		}
		//String k="create table from_eclipse(id int,name varchar(20));";
		//stmt.executeUpdate(k);
	    //System.out.println("Created");
		
		
	}
	catch(Exception e)
	{
		System.out.println("Not Connected");
	}
	}

}
