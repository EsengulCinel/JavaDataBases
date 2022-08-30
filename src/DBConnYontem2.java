import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnYontem2 {

    public static final String DB_Url = "jdbc:postgresql://localhost/Universite";
    public static final String DB_User = "postgres";
    public static final String DB_Password = "esen";

    public static void main(String[] args) {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(DB_Url, DB_User, DB_Password);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
