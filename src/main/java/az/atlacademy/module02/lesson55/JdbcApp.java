package az.atlacademy.module02.lesson55;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcApp {

    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
                    "postgres",
                    "mysecretpassword");
            //conn.beginRequest();
            conn.setAutoCommit(false);
            PreparedStatement preparedStatement1 = conn.prepareStatement("insert into students (name, surname, age)\n" +
                    "values ('Test1', 'Test1', 1);");
            int affectedRows1 = preparedStatement1.executeUpdate();
            System.out.println(affectedRows1);

            boolean check = false;
            if (check) {
                throw new SQLException();
            }

            PreparedStatement preparedStatement2 = conn.prepareStatement("insert into students (name, surname, age)\n" +
                    "values ('Test2', 'Test2', 2);");
            int affectedRows2 = preparedStatement2.executeUpdate();
            System.out.println(affectedRows2);
            conn.commit();
            conn.close();
        } catch (SQLException e) {
            conn.rollback();
        }
    }

}
