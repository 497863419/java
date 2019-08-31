package com.zyj.JdbcTest;

import java.sql.*;

/**
 * @Name：
 * @Author：ZYJ
 * @Date：2019-08-31-00:18
 * @Description:
 */
public class JdbcDemo1 {
    public static void main(String[] args) throws ClassNotFoundException {
        Connection conn=null;
        Statement stmt=null;
        try {
            //1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.定义sql语句
            String sql = "insert into stu values(null,'wangwu',3000)";
            //3.获取数据库连接对象
            conn = DriverManager.getConnection("jdbc:mysql:///db1","root","497863419");
            //4.获取执行sql对象
            stmt = conn.createStatement();
            //5.执行sql
            int count = stmt.executeUpdate(sql);
            //6.处理结果
            System.out.println(count);
            if (count > 0) {
                System.out.println("添加成功！");
            } else {
                System.out.println("添加失败！");

            }

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
        }


    }

}
