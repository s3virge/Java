package SQLite; /**
 * Created by s3virge on 30.07.17.
 */
import java.sql.*;

public class Select {

        public static void main( String args[] ) {

            Connection conn = null;
            Statement stmt = null;

            final String dbName = "DateBase.db";

            try {
                Class.forName("org.sqlite.JDBC");
                //Если базы данных нет, то она создается
                conn = DriverManager.getConnection("jdbc:sqlite:" + dbName);

                conn.setAutoCommit(false);

                System.out.println("Opened database successfully");

                stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery( "SELECT * FROM COMPANY;" );

                while ( rs.next() ) {
                    int id          = rs.getInt("id");
                    String  name    = rs.getString("name");
                    int age         = rs.getInt("age");
                    String  address = rs.getString("address");
                    float salary    = rs.getFloat("salary");

                    System.out.println( "ID = " + id );
                    System.out.println( "NAME = " + name );
                    System.out.println( "AGE = " + age );
                    System.out.println( "ADDRESS = " + address );
                    System.out.println( "SALARY = " + salary );
                    System.out.println();
                }

                rs.close();
                stmt.close();
                conn.close();
            }
            catch ( Exception e ) {
                System.err.println( e.getClass().getName() + ": " + e.getMessage() );
                System.exit(0);
            }
            System.out.println("Operation done successfully");
        }
    }