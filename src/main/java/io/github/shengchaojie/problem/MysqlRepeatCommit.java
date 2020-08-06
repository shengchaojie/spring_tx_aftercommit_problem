package io.github.shengchaojie.problem;

import java.sql.*;

/**
 * @author shengchaojie
 * @date 2020/8/3
 **/
public class MysqlRepeatCommit {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");

        //part1
        conn.setAutoCommit(false);
        Statement statement = conn.createStatement();
        statement.execute("INSERT INTO test.goods ( good_id, num) VALUES ( 'sku123', 0);");

        conn.commit();

        //part2
        statement = conn.createStatement();
        statement.execute("INSERT INTO test.goods ( good_id, num) VALUES ( 'sku123', 0);");

        conn.setAutoCommit(true);

        //part3
        try {
            statement = conn.createStatement();
            statement.execute("INSERT INTO test.goods ( good_id, num) VALUES ( 'sku123', 0);");
            int i = 1/0;
        }catch (Exception ex){
            System.out.println("there is an error");
        }
        conn.setAutoCommit(true);

        //part4
        conn.setAutoCommit(false);
        try {
            statement = conn.createStatement();
            statement.execute("INSERT INTO test.goods ( good_id, num) VALUES ( 'sku123', 0);");
            int i = 1/0;
        }catch (Exception ex){
            System.out.println("there is an error");
        }
        conn.setAutoCommit(true);
    }

}
