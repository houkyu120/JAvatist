package MYSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MSL {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myemployees", "root","120482");
        String str = "delete from employees where last_name='K_ing'";
        Statement statement = con.createStatement();
        boolean a=statement.execute(str);
        System.out.println(a);
    }
}
