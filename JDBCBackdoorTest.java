import java.sql.*;

public class JDBCBackdoorTest {
    public static void main(String[] argsStrings){
        try{
            // THIS IS NOT NEEDED - JDBC will load the driver automatically if it's in the classpath
            // Class.forName("jdbcbackdoor.JDBCDriverBackdoor");

            // connection string is irrelevant
            Connection conn = DriverManager.getConnection("jdbc:blah://localhost:31337/");
        } catch(Exception e) {
            // e.printStackTrace();
        }

        System.out.println("Test ran, now check for presence of /tmp/SECURITYFAIL.txt (C:\\SECURITYFAIL.txt on Windows)");
    }
}