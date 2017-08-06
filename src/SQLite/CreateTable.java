package SQLite;

import java.sql.*;

public class CreateTable {
    public static void main( String args[] ) {

        Connection conn = null;
        Statement stmt = null;

        final String dbName = "DateBase.db";

        try {
            // Class.forName simply loads a class, including running its static initializers
            Class.forName("org.sqlite.JDBC");

            //Если базы данных нет, то она создается
            conn = DriverManager.getConnection("jdbc:sqlite:" + dbName);

            stmt = conn.createStatement();

            String sql = "CREATE TABLE COMPANY " +
                    "(ID INT PRIMARY KEY     NOT NULL," +
                    " NAME           TEXT    NOT NULL, " +
                    " AGE            INT     NOT NULL, " +
                    " ADDRESS        CHAR(50), " +
                    " SALARY         REAL)";

            stmt.executeUpdate(sql);

            stmt.close();
            conn.close();
        }
        catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }

        System.out.println("Opened database successfully");
        System.out.println("Table created successfully");
    }
}