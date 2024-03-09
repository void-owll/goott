import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionTest {
    public static void main(String[] args) {
        Connection connection = null;

        try {
            // MariaDB JDBC 드라이버 로드
            Class.forName("org.mariadb.jdbc.Driver");

            // MariaDB에 연결
            String url = "jdbc:mariadb://localhost:3306/mysql";
            String user = "orca";
            String password = "qnjdqnjd12";
            connection = DriverManager.getConnection(url, user, password);

            System.out.println("MariaDB 연결 성공");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            System.err.println("MariaDB 연결 실패: " + e.getMessage());
        } finally {
            // 연결 해제
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
