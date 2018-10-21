import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import java.sql.*;

public class BasicJdbcDemo {


    public static void main(String[] args) {

    }


    private static Connection connection() throws ClassNotFoundException, SQLException {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUrl("jdbc:myslq://localhost:3306/userdb");
        dataSource.setUser("root");
        dataSource.setPassword("10chul");

        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(dataSource.getURL(),
                                                      dataSource.getUser(),
                                                  "10chul");
        conn.setAutoCommit(true);

        return conn;
    }

    private static void initDb() throws SQLException{

        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = connection();
            conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            conn.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
            conn.setAutoCommit(false);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }




}
