import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class LoginDao {

	private String  db_url="jdbc:mysql://localhost:3307/userdb";
	private String db_name="root";
	private String db_password="shefali";
	private String db_driver="com.mysql.jdbc.Driver";
	
	public void loadDriver(String dbDriver) {
		try {
			Class.forName(dbDriver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Connection getConnection() {
	Connection con=null;
		try {
		con = DriverManager.getConnection(db_url,db_name,db_password);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
		return con;
	}
 
public int  validate(MemberBean memberBean2) {
	loadDriver(db_driver);
	Connection con=getConnection();
	
	int result2= 1;
try {
	String sql2 ="SELECT * FROM userdb.memberbean WHERE email = ? and psw = ? "; 
	 PreparedStatement preparedStatement = con.prepareStatement(sql2);

	     
		preparedStatement.setString(1, memberBean2.getEmail());
		preparedStatement.setString(2,memberBean2.getPsw());
			
	     preparedStatement.executeQuery();
	     
	
	
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	result2=0;
} 
    try {
		con.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return result2;
	
}
}

