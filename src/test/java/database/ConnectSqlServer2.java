package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ConnectSqlServer2 {

	
	//working successfully 
	@Test
	public void testDBConnectivity(){
		Connection conn= null;
		
		String dbUrl ="jdbc:sqlserver://localhost\\sqlexpress;DatabaseName=pubs";
		String user = "abhijit";
		String pass = "abhijit2727";
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Reporter.log("Driver loaded", true);
			conn= DriverManager.getConnection(dbUrl, user, pass);
			Reporter.log("Database connected", true);
			Statement st= conn.createStatement();
			ResultSet set = st.executeQuery("select * from employee");
			System.out.println(set);
			
			while(set.next()){
				//getString("column name eg: emp_id
				String col_data = set.getString("emp_id");
				System.out.println(col_data);
				
				//String col_data2 = set.getString("columnname");
				//System.out.println(col_data2);
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
