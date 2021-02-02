package st;
import java.sql.*;
public class CreateDB
{
	public static final String DRIVER="com.mysql.cj.jdbc.Driver";
	public static final String URL="jdbc:mysql://localhost:3306/";
	public static final String USER_NAME="root";
	public static final String PASSWORD="toor";
	public static final String SQL="create database demo_db";


	public static void main(String[] args)
	{
		Connection con= null;
		Statement st=null;
		
		try {
			//Register the driver
			Class.forName(DRIVER);
			
			//2. Obtain connection Object
			con=DriverManager.getConnection(URL,USER_NAME,PASSWORD);
			
			//3.Obtain statement object
			st=con.createStatement();
			
			//4.Execute the querry
			st.executeUpdate(SQL);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				con.close();
				st.close();
				System.out.println("Database Created\n");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
