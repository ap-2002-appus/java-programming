import java.sql.*;


public class database_java {
	static final String JDBC_Driver="com.mysql.cj.jdbc.Driver";
	static final String DB_URL="jdbc:mysql://localhost:3306/CustomText";
	
	static final String USER="ibin_siby";
	static final String PWD="Appu@2006";
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException{
		Connection con=null;
		Statement statement=null;
			//register JDBC driver
			Class.forName(JDBC_Driver);
			System.out.println("Coonnecting to database..,");
			con = DriverManager.getConnection(DB_URL,USER,PWD);
			
			System.out.println("Creating database..");
			statement = con.createStatement();
			
			String sql = "create table user " +

			"(roll_number integer not null, " +

			" first_name varchar(50), " +

			" last_name varchar(50), " +

			" age integer, " +

			" primary key ( roll_number ))";
			
			boolean result = statement.execute(sql);
			System.out.println(result);
			System.out.println("Table created successfully...");
			
	
			
			if(statement !=null)
				statement.close();
			if(con != null)
				con.close();
		
	}
}
