import java.sql.Connection;
import java.sql.DriverManager;

public class Lec1 {

    public static void main(String[] args) {
        
        Connection con = null;

        try {
            con = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Новый пользователь\\Desktop\\Lang-Prog\\Lec1.db");
            if(con != null){System.out.println("Have connection!");}
            
        } catch (Exception ex) {
            System.err.println(ex.getClass().getName()+";"+ex.getMessage());
            System.out.println("Not have connection!");
        }
    }
}