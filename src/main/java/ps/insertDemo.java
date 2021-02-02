package ps;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import util.DbUtil;

public class insertDemo {

	public static final String SQL="insert into demo_tbl(user_name, password)values(?,?)";
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//try with resources
				try (
					//Connection con=DriverManager.getConnection(SURL,USER_NAME,PASSWORD);
					PreparedStatement ps=DbUtil.getConnection().prepareStatement(SQL);
					//Statement st=con.createStatement();
						){
					
					ps.setString(1,"mohan");
					ps.setString(2, "mm");
					ps.executeUpdate();
					System.out.println("Data inserted");
				} catch (SQLException | ClassNotFoundException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

	}
}
