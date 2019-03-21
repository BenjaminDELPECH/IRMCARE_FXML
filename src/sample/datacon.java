package sample;

import java.sql.DriverManager;
import java.sql.Connection;

public class datacon {
    private static Connection con;
    public static void Connectiondb(String user, String pass)throws Exception{
        Class.forName("oracle.jdbc.OracleDriver").newInstance();
        setCon(DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", user, pass));
    }


    public static Connection getCon() {
        return con;
    }

    public static void setCon(Connection con) {
        datacon.con = con;
    }
}
