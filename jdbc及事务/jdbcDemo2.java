package com.zyj.JdbcTest;

import java.sql.*;

/**
 * @Name：
 * @Author：ZYJ
 * @Date：2019-08-31-22:49
 * @Description:
 */
public class jdbcDemo2 {
    public static void main(String[] args) throws ClassNotFoundException {
        Connection conn=null;
        Statement stmt=null;
        ResultSet re=null;
        try {
            //1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.定义sql语句
            String sql = "select * from stu";
            //3.获取数据库连接对象
            conn = DriverManager.getConnection("jdbc:mysql:///db1","root","497863419");
            //4.获取执行sql对象
            stmt = conn.createStatement();
            //5.执行sql  执行DQL语句使用executeQuery(sql语句对象)  返回值为结果集对象
            //ResultSet 结果集对象 方法  读取下一行next()，获取数据 getXxx()
            re = stmt.executeQuery(sql);
            //6.处理结果
              //6.1 光标下移
              re.next();
              //6.2 获取数据
            int anInt = re.getInt(1);
            String name = re.getString("name");
            double aDouble = re.getDouble(3);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (stmt!=null){
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn!=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (re!=null){
                try {
                    re.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }


    }

}
