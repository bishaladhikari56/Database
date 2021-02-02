package st;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import util.DbUtil;

public class CreateTable
{

	public static final String DRIVER="com.mysql.cj.jdbc.Driver";
	public static final String URL="jdbc:mysql://localhost:3306/demo_db";
	public static final String USER_NAME="root";
	public static final String PASSWORD="toor";
	public static final String SQL="create table demo_tbl(id int not null auto_increment, user_name varchar(45), password varchar (45),primary key(id))";


	public static void main(String[] args) throws ClassNotFoundException
	{
		//try with resources
		try (
			//Connection con=DriverManager.getConnection(URL,USER_NAME,PASSWORD);
			Statement st=DbUtil.getConnection().createStatement();
			//Statement st=con.createStatement();
				){
			
			st.executeUpdate(SQL);
			System.out.println("Table Created");
		} catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
