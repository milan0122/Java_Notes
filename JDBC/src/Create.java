import java.sql.*;
public class Create {
    public static void main(String[] args) {
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/MRS", "root","MySql46.@");
            Statement st = cn.createStatement();
            //String Sqldb = "Create table Movie(id int Primary key,tilte varchar(250),genre varchar(100),language varchar(100),duration time)";
            String sqldb = "Alter table Movie Modify Column duration double";
            st.executeUpdate(sqldb);
            System.out.println("table created sucessfully");
        } catch (SQLException se) {
            System.out.println(se.getMessage());
        }
    }
}
