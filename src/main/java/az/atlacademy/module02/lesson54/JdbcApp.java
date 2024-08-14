package az.atlacademy.module02.lesson54;

import java.sql.*;
import java.util.Optional;

public class JdbcApp {

    private static final String INSERT_STUDENTS = "insert into students (name, surname, age)\n" +
            "values (?, ?, ?);";

    private static final String FIND_STUDENT_BY_ID = "SELECT * FROM students WHERE id = ?;";

    public static void main(String[] args) {
        Student student = findById(2L).get();
        System.out.println(student);

    }

    public static Optional<Student> findById(Long id) {
        try (Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
                "postgres",
                "mysecretpassword")) {
            PreparedStatement preparedStatement = conn.prepareStatement(FIND_STUDENT_BY_ID);
            preparedStatement.setLong(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            //while (resultSet.next()){
            long studentId = resultSet.getLong("id");
            String name = resultSet.getString("name");
            String surname = resultSet.getString("surname");
            int age = resultSet.getInt("age");
            return Optional.of(new Student(studentId, name, surname, age));
            //}
        } catch (SQLException e) {
            return Optional.empty();
        }
    }

    public static void createStudent(Student student) {
        try (Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
                "postgres",
                "mysecretpassword")) {
            PreparedStatement preparedStatement = conn.prepareStatement(INSERT_STUDENTS);
            preparedStatement.setString(1, student.getName());
            preparedStatement.setString(2, student.getSurname());
            preparedStatement.setInt(3, student.getAge());
            int affectedRows = preparedStatement.executeUpdate();
            System.out.println(affectedRows);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
