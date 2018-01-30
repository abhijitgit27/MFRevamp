package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class ConnectSqlServer {

	@Test
	public static void testDB() throws SQLException, ClassNotFoundException{
		
		
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Reporter.log("Driver loaded", true);
			//server name:LENOVO-PC\SQLEXPRESS
			//username LENOVO-PC\Abhijit  F@lcon27
			//jdbc:sqlserver://localhost:1434","Abhijit","F@lcon27"
			//try with this:url="jdc:sqlserver://LENOVO-PC\SQLEXPRESS;databaseName=POPS";
			Connection con = DriverManager.getConnection("jdbc:sqlserver://LENOVO-PC\\sqlexpress;database=POPS;IntegratedSecurity=true");
			Reporter.log("Database connected", true);
			Statement st= con.createStatement();
			ResultSet set= st.executeQuery("select * from employees");
			
			while(set.next()){
				String col_data = set.getString("columnname");
				System.out.println(col_data);
				
				String col_data2 = set.getString("columnname");
				System.out.println(col_data2);
			}
		
		
	}
}
