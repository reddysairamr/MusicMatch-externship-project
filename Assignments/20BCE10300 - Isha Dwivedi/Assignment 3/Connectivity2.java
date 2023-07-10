import java.sql.*;

public class Connectivity2 {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {		
		Connection conn = null;			
		Statement stmt = null;			
		ResultSet rs = null; 			
		
		try {
			//0. Load the database driver
			Class.forName("com.mysql.cj.jdbc.Driver");				
			
			// 1. Creating connection object 			
			String conn_string = "jdbc:mysql://localhost:3306/movies?" + "user=root&password=1402";
					
			// Passing conn_string to conn
			conn = DriverManager.getConnection(conn_string);		
			
			if (conn!=null) {										
				System.out.println("connection established!");
			}
			
			//2. Creating Statement object 
			stmt = conn.createStatement();							
			
			// 3. ResultSet - executeQuery()
			rs = stmt.executeQuery("select * from test");			
			
			
			// 4. 
			while(rs.next()) {
				String title = rs.getString("movie_title");
				String genre = rs.getString("genre");
				Date rel_date = rs.getDate("rel_date");
				System.out.println("Movie Title: " + title + " | Genre: " + genre + " | Release Date: " + rel_date);
			}
		}
		catch(SQLException ex) {
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
			
		}
		finally {
			
			// 5. Closing the connection 
			if(rs != null && stmt != null) {
				rs.close();
				stmt.close();
				rs = null;
				stmt = null;
			}
			conn.close();
		}
	}
}
