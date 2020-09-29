import com.mysql.cj.jdbc.PreparedStatementWrapper;

import java.sql.*;

/**
 * @author ligen
 * @title: JDBCDemo
 * @projectName jdbc
 * @description:
 * @date 2019/10/916:12
 */
public class JDBCDemo {

    public static void main(String[] args) throws SQLException {
        PreparedStatement statement = null;
        Connection connection = null;
        ResultSet resultSet = null;
        try {
            // 触发了com.mysql.cj.jdbc.Driver的 静态代码块。将Mysql 注册到DraverManage 中
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://118.25.153.63:3306/druidtest?useUnicode=true&characterEncoding=utf8", "root", "root");
            //sql
            String sql = "select * from test where id=1";
            statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String col1 = resultSet.getString("col1");
                String col2 = resultSet.getString("col2");
                System.out.println(id+col1+col2);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (resultSet != null) {
                resultSet.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
    }

}





