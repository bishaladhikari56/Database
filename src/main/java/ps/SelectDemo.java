package ps;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import util.DbUtil;

public class SelectDemo {

	public static final String SQL="select * from demo_tbl where id=?";
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//try with resources
				try (
					//Connection con=DriverManager.getConnection(URL,USER_NAME,PASSWORD);
					PreparedStatement ps=DbUtil.getConnection().prepareStatement(SQL);
					//Statement ps=con.createStatement();
						){
					ps.setInt(1,4);
					ResultSet rs=ps.executeQuery();
					while(rs.next()) {
						System.out.println("ID is: "+rs.getInt(1));
						System.out.println("Name is: "+rs.getString(2));
						System.out.println("Password is: "+rs.getString(3));
						System.out.println("==========================");
						
					}
					System.out.println("Table fetched");
				} catch (SQLException | ClassNotFoundException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

	}

}
