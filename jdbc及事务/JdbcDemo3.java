package com.zyj.JdbcTest;

import java.sql.*;

/**
 * @Name：
 * @Author：ZYJ
 * @Date：2019-09-01-00:28
 * @Description:
 */
public class JdbcDemo3 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pres = null;
        ResultSet resultSet = null;
        try {
            //1.加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2，定义sql语句 用？表示占位符
            String sql = "select * from stu where ?=?";
            //3，获取数据库连接对象
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1");
            //4.获取执行sql对象
            pres = conn.prepareStatement(sql);
            //5.执行sql
            resultSet = pres.executeQuery();
            //6.读取结果集
            resultSet.next();
            //7.使用执行执行数据库对象为 ? 设置值
            pres.setString(1, "id");
            pres.setInt(2, 2);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //关闭所有资源
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (pres != null) {
                try {
                    pres.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }

            }

        }
    }
}
