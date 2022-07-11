package сom.sergdalm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.concurrent.BlockingQueue;

public class HibernateRunner {
    public static void main(String[] args) throws SQLException {
        BlockingQueue<Connection> pool = null;

        DriverManager
                .getConnection("db.username", "db.username", "db.password");

    }
}
