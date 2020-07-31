import org.apache.commons.dbcp.BasicDataSource;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author ligen
 * @title: JDBC_DBCP
 * @projectName jdbc
 * @description:
 * @date 2019/10/918:34
 */
public class JDBC_DBCP {
    public static void main(String[] args) throws IOException, SQLException {

        ClassLoader classLoader = JDBC_DBCP.class.getClassLoader();
        InputStream inPutStream = classLoader.getResourceAsStream("dbcp.properties");

        Properties properties = new Properties();
        properties.load(inPutStream);
        String initialSize = properties.getProperty("jdbc.dbcp.initialSize");
        String maxActive = properties.getProperty("jdbc.dbcp.maxActive");
        String maxIdle = properties.getProperty(" jdbc.dbcp.maxIdle");
        String minIdle = properties.getProperty("jdbc.dbcp.minIdle");
        String maxWait = properties.getProperty("jdbc.dbcp.maxWait");
        String poolPreparedStatements = properties.getProperty("jdbc.dbcp.poolPreparedStatements");
        String maxOpenPreparedStatements = properties.getProperty("jdbc.dbcp.maxOpenPreparedStatements");
        String minEvictableIdleTimeMillis = properties.getProperty("jdbc.dbcp.minEvictableIdleTimeMillis");
        String removeAbandonedTimeout = properties.getProperty("jdbc.dbcp.removeAbandonedTimeout");
        String removeAbandoned = properties.getProperty("jdbc.dbcp.removeAbandoned");


        BasicDataSource dataSource = new BasicDataSource();
        dataSource.getConnection();


    }
}
