package st;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import util.DbUtil;

public class SelectDemo
{
	public static final String SQL="select * from demo_tbl";
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//try with resources
				try (
					//Connection con=DriverManager.getConnection(URL,USER_NAME,PASSWORD);
					Statement st=DbUtil.getConnection().createStatement();
					//Statement st=con.createStatement();
						){
					
					ResultSet rs=st.executeQuery(SQL);
					while(rs.next()) {
						System.out.println("ID is: "+rs.getInt(1));
						System.out.println("Name is: "+rs.getString(2));
						System.out.println("Password is: "+rs.getString(3));
						System.out.println("==========================");
						System.out.println("ID is: "+rs.getInt("id"));
						System.out.println("Name is: "+rs.getString("user_name"));
						System.out.println("Password is: "+rs.getString("password"));
					}
					System.out.println("Table fetched");
				} catch (SQLException | ClassNotFoundException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

	}

}
