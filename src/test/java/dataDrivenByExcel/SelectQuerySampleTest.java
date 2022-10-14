package dataDrivenByExcel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class SelectQuerySampleTest {

	public static void main(String[] args) throws Throwable {
		Connection conn=null;
		try {
			Driver driverRef= new Driver();
		//Register to the database
		DriverManager.registerDriver(driverRef);
		//connect to the database
		 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "root");
		//create the statement
		Statement stat = conn.createStatement();
		//execute the query
		ResultSet result = stat .executeQuery("select * from students_info");
		while(result.next()) {
			System.out.println(result.getInt(1)+"\t"+result.getString(2));
			
		}
			
		}catch (Exception e) {
			// TODO: handle exception
		}finally {
			//close the connection
			conn.close();
		}
		
		

	}

}
