package dataDrivenByExcel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class NonselectQueryTest {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		Connection conn=null;
		int result=0;
		
		try {
			Driver driverRef= new Driver();
			//Register to the database
			DriverManager.registerDriver(driverRef);
			//connect to the database
			  conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "root");
			//create the statement
			Statement stat = conn.createStatement();
			//execute the query
			 result = stat.executeUpdate("insert into students_info(regno, firstname, middlename, lastname) values('1700','abc','ugf','uh')");
		}catch (Exception e) {
			// TODO: handle exception
		}finally {
			if(result==1) {
				System.out.println("succesfully added");
			}else {
				System.out.println("not added");
			}
			//close conn
			conn.close();
		}
		
	
	}

}
