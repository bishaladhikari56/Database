package st;

import java.sql.SQLException;
import java.sql.Statement;

import util.DbUtil;

public class UpdateDemo 
{

	public static final String SQL="update demo_tbl set user_name='krishna', password='kk' where id=2";
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//try with resources
				try (
					//Connection con=DriverManager.getConnection(URL,USER_NAME,PASSWORD);
					Statement st=DbUtil.getConnection().createStatement();
					//Statement st=con.createStatement();
						){
					
					st.executeUpdate(SQL);
					System.out.println("Data deleted");
				} catch (SQLException | ClassNotFoundException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

	}

}
