import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * @author ligen
 * @title: JDBCProperties
 * @projectName jdbc
 * @description:
 * @date 2019/10/916:59
 */
public class JDBCProperties {

    public static void main(String[] args) throws IOException, SQLException {
        String sql = "";
        executeSql(sql);

    }

    public static ResultSet executeSql(String sql) throws SQLException, IOException {
        Properties properties = new Properties();
        ClassLoader classLoader = JDBCProperties.class.getClassLoader();
        InputStream in = classLoader.getResourceAsStream("jdbc.properties");
        properties.load(in);
        String driver = properties.getProperty("jdbc.driver");
        String url = properties.getProperty("jdbc.url");
        String user = properties.getProperty("jdbc.username");
        String pass = properties.getProperty("jdbc.password");

        // 连接数据库
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection(url, user, pass);
            statement = connection.prepareStatement(sql);
            // 查
            resultSet = statement.executeQuery();
            // 增删改  返回影响行数
//            statement.executeUpdate();
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") + resultSet.getString("col1") + resultSet.getString("col2"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (resultSet != null) {
                resultSet.close();
            }
            if (connection != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
        return resultSet;

    }

}
