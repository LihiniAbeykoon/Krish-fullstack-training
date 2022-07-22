import java.sql.Connection;
import java.sql.SQLException;

public class App {
    public static void main(String[]args) throws SQLException {

        long start;
        long end;

        DBManager dbManager= DBManager.getDbManager();
        System.out.println(dbManager);

        start=System.currentTimeMillis();
        Connection connection=dbManager.getConnection();
        end=System.currentTimeMillis();

        System.out.println(end-start);

        DBManager dbManager1=DBManager.getDbManager();

        start=System.currentTimeMillis();

        Connection connection1=dbManager1.getConnection();

        end=System.currentTimeMillis();

        System.out.println(end-start);

    }
}
