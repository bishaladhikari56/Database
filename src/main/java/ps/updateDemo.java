package ps;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import util.DbUtil;

public class updateDemo 
{
	public static final String SQL="update demo_tbl set user_name=?, password=? where id=?";
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//try with resources
				try (
					//Connection con=DriverManager.getConnection(URL,USER_NAME,PASSWORD);
					PreparedStatement ps=DbUtil.getConnection().prepareStatement(SQL);
					//Statement st=con.createStatement();
						){
					ps.setString(1, "manju");
					ps.setString(2, "MM");
					ps.setInt(3, 1);
					ps.executeUpdate();
					System.out.println("Data updated");
				} catch (SQLException | ClassNotFoundException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

	}
}
