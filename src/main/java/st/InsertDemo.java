package st;

import java.sql.SQLException;
import java.sql.Statement;

import util.DbUtil;

public class InsertDemo 
{
	public static final String SQL="insert into demo_tbl(user_name, password)values('Gopal','GG')";
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
					System.out.println("Table inserted");
				} catch (SQLException | ClassNotFoundException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

	}

}
