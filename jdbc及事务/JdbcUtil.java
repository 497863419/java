package com.zyj.JdbcTest;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.Properties;

/**
 * @Name：  jdbc工具类
 *
 * 目的：简化代码
 * 分析:
 *      1,抽取方法注册驱动
 *      2,抽取方法获取连接对象
 *      3,抽取方法释放资源
 * 需求：不传递参数
 *       只需读取一次资源文件
 *      保证为工具类的通用性
 * @Author：ZYJ
 * @Date：2019-08-31-22:55
 * @Description:
 */
public class JdbcUtil {
    private static String url;
    private  static String user;
    private  static  String password;
    private  static  String driver;

    //使用静态代码块保证 类加载时将文件加载
    static {
        //1,创建Properties对象
        Properties properties = new Properties();
        //2,获取scr路径下的文件
          //2.1 获取本类的类加载器
        ClassLoader classLoader = JdbcUtil.class.getClassLoader();
          //2.2  使用类加载器传入 资源文件路径 获取文件 URL对象
        URL resource = classLoader.getResource("jdbc.Properties");
          //2.3  使用资源对象获取资源的字符串路径对象
        String path = resource.getPath();
        try {
            //3,加载文件
            properties.load(new FileReader(path));
            //4.获取数据赋值
            url=properties.getProperty("url");
            user= properties.getProperty("user");
            password= properties.getProperty("password");
            driver=properties.getProperty("driver");
          //注册驱动
          Class.forName(driver);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    //获取连接方法  用户只需调用本方法 用类名调用静态方法
    public  static Connection getConnection() throws SQLException {
        //将资源文件中获取到的 url，user，password 以参数的形式传入
        //DriverManager ：驱动管理对象
        //作用：1，注册驱动  2，获取数据库连接对象
        return DriverManager.getConnection(url,user,password);
        //Connection :数据库连接对象
        //作用 1,获取执行sql的对象 2,管理事物

    }

    //释放资源方法
    public  static void close(Statement statement,Connection connection) throws SQLException {
        //释放资源
        if (statement!=null){
            statement.close();
        }
        if (connection!=null){
            connection.close();
        }
    }
    public  static  void  close(Statement statement,Connection connection,ResultSet resultSet) throws SQLException {
        if (statement!=null){
            statement.close();
        }
        if (connection!=null){
            connection.close();
        }
        if (resultSet!=null){
            resultSet.close();
        }
    }

}
