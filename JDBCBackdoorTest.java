import java.sql.*;

public class JDBCBackdoorTest {
    public static void main(String[] argsStrings){
        try{
            // Class.forName("jdbcbackdoor.JDBCDriverBackdoor"); // shouldn't need this!

            // connection string is irrelevant, JDBC will query all the registered drivers
            Connection conn = DriverManager.getConnection("jdbc:blah://localhost:31337/");
        } catch(Exception e) {
            // e.printStackTrace();
        }

        System.out.println("Test ran, now check for presence of /tmp/SECURITYFAIL.txt (C:\\SECURITYFAIL.txt on Windows)");
    }
}