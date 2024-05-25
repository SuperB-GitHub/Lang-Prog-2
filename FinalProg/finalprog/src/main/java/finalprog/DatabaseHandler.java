package finalprog;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseHandler {

    Connection dbConnect = null;

    public Connection getDBConection() throws SQLException {
        dbConnect = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Новый пользователь\\Desktop\\Lang-Prog\\FinalProg\\finalprog\\src\\main\\resources\\finalprog\\FinalProg.db");
        if(dbConnect != null){System.out.println("Have connection!");}
        return dbConnect;
    }

}
