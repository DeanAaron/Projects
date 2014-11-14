package com.bean.dbutils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.Test;

import com.bean.dbutils.DBURL.DBType;

public class DBUtilsTest {
    
    private static final String user = "root";
    
    private static final String password = "root";
    
    @Test
    public void DBTest() {
	
	try {
	    
	    Connection connection = getInstance(DBDriver.MYSQL, DBURL.getURL(DBType.MYSQL, "localhost", "3306", "testdb", DBURL.UTF8), user, password);
	    
	    BeanListHandler<Users> beanListHandler = new BeanListHandler<Users>(Users.class);
	    QueryRunner queryRunner = new QueryRunner();
	    List<Users> userList = queryRunner.query(connection, "select * from users", beanListHandler);
	    
	    for (Users user : userList) {
		
		System.out.println(user.toString());
	    }
	    DbUtils.close(connection);
	} catch (SQLException e) {
	    
	    e.printStackTrace();
	}
	
    }
    
    @Test
    public void query() {
	
	
    }
    
    private Connection getInstance(String driverName, String url, String user, String password) throws SQLException {
	
	//加载数据库驱动
	DbUtils.loadDriver(driverName);
	//获取链接
	Connection connection = DriverManager.getConnection(url, user, password);
	
	return connection;
    }
}