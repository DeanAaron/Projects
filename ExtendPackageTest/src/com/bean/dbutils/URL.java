package com.bean.dbutils;

/**
 * 各种数据库的编码方式
 * @author aaron
 *
 */
public class URL {

	/**
	枚举类型控制返回的url地址的不同
	1. Oracle	url示例:"jdbc:oracle:thin:@localhost:1521:orcl"
	2. Access	url示例:"jdbc:odbc:HANFENG"
	3. SQL Server	url示例:"jdbc:microsoft:sqlserver://localhost:1433;DatabaseName=pubs"
	4. DB2		url示例:"jdbc:db2://localhost:5000/sample"
	5. Informix搜索	url示例:"jdbc:informix-sqli://123.45.67.89:1533/testDB:INFORMIXSERVER=myserver"
	6. Sybase	url示例:"jdbc:sybase:Tds:localhost:5007/tsdata"
	7. MySQL	url示例:"jdbc:mysql://localhost/softforum?user=soft&password=soft1234&useUnicode=true&characterEncoding=8859_1"
	8. PostgreSQL	url示例:"jdbc:postgresql://localhost/soft"
	*/
    
    protected static final String UTF8 = "utf8";
    
    protected static final String GBK = "gbk";
    
    protected static final String GB2312 = "gb2312";
    
    protected static final String ISO8859_1 = "ISO8859_1";
    
    protected static String getURL(String host, String dbname, String unicode) {

    	String url = "";

    	return url;
    }
    
    private URL() {}
}