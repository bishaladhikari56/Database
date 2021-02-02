package ps;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import util.DbUtil;

public class DeleteDemo 
{
	public static final String SQL="delete from demo_tbl where id=?";
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//try with resources
				try (
					//Connection con=DriverManager.getConnection(URL,USER_NAME,PASSWORD);
					PreparedStatement ps=DbUtil.getConnection().prepareStatement(SQL);
					//Statement st=con.createStatement();
						){
					ps.setInt(1,3);
					ps.executeUpdate();
					System.out.println("Data deleted");
				} catch (SQLException | ClassNotFoundException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

	}

}
