package database;

import java.sql.Connection;
import java.sql.DriverManager;
	
import org.testng.annotations.Test;
//import com.microsoft.sqlserver.jdbc.SQLServerDriver;

import java.*;

public class ConnectSqlServer1 {

	
	@Test
	public void testSqldb(){
	
		//String url = jdbc:sqlserver://LENOVO-PC;instanceName=SQLEXPRESS;DatabaseName=POPS
		
		String url = "jdbc:sqlserver://127.0.0.1:1433;DatabaseName=POPS";
		
		String databaseName= "POPS";
		
		String username = "abhijit";
		
		//String username = "LENOVO-PC\\Abhijit";
		
		String password = "abhijit2727";
		
		Connection con = null;
		
		try{
			
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con= DriverManager.getConnection(url, username, password);
			
		}catch(Exception e){
			System.out.println(e);
		}
		finally{
			if(con!=null){
				con=null;
			}
		}
		
		
	}
}
