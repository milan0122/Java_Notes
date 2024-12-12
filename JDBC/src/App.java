import java.sql.*;

public class App {
    public static void main(String[] args) throws Exception {
       try {
        //Class.forName("com.mysqli.jdbc.driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/Student", "root","MySql46.@");
        System.err.println("connection established");
        Statement st = conn.createStatement();
        // String query = "Insert into user values('3','Bibas Dangi','12534','Tulsipur')";
        // st.executeUpdate(query);
        // ResultSet rs = st.executeQuery("Select name,address from user");
        // while(rs.next()){
        //     String name = rs.getString("Name");
        //     String address =rs.getString("Address");
        //     System.out.print("\nName :"+name);
        //     System.out.print("\tEmail :"+address);
        // }
        // rs.close();

        //delete the data of table
        // String delSql = "Delete from user where Name = 'Milan Dangi'";
        // st.executeUpdate(delSql);

        //update the query
        String upQuery = "Update  user set name = 'Chet Kumari Dangi' where uid = '2' ";
        st.executeUpdate(upQuery);
        conn.close();
       } 
       catch (SQLException e) {
        e.printStackTrace();
       }
    }
}
