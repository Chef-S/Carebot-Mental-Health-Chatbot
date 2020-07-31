import java.sql.*;

public class RegisterDao {
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
 
public String insert(MemberBean memberBean) {
	loadDriver(db_driver);
	Connection con=getConnection();
	String sql="insert into userdb.memberbean values(?,?,?)";
	String result= "Registered Sucessfully!";
try {
	PreparedStatement ps=con.prepareStatement(sql);
	ps.setString(1, memberBean.getEmail());
	ps.setString(2,memberBean.getPsw());
	ps.setString(3,memberBean.getPsw_repeat());
	ps.executeUpdate();
	
	con.close();
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	result="Not Registered Sucessfully, Error Occured!";
} 
	return result;
	
}
}
