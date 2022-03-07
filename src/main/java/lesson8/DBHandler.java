package lesson8;

import org.sqlite.JDBC;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBHandler {

    private final static String PATH_DB = "jdbc:sqlite:C:\\Users\\User\\IdeaProjects\\Java_Core\\src\\main\\java\\lesson8\\resources\\Employee.db";

    private Connection connection;

    public DBHandler() throws SQLException {
        DriverManager.registerDriver(new JDBC());
        this.connection = DriverManager.getConnection(PATH_DB);
    }

    //delete
    public void deleteEmployee(int id) throws SQLException {
        PreparedStatement statement = this.connection.prepareStatement(
                "DELETE FROM BaseInfoAboutEmployee WHERE ID = ?"
        );
        statement.setObject(1, id);

        statement.execute();

    }


    //add
    public void addEmployee(Employee employee) throws SQLException {
        PreparedStatement statement = this.connection.prepareStatement("" +
                "INSERT INTO BaseInfoAboutEmployee('name', 'salary', 'age')" +
                "VALUES(?, ?, ?)"
        );
        statement.setObject(1, employee.getName());
        statement.setObject(2, employee.getSalary());
        statement.setObject(3, employee.getAge());
        statement.execute();

    }


    //Select
    public List<Employee> getAllEmployee() throws SQLException {
        List<Employee> employees = new ArrayList<>();
        Statement statement = this.connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM BaseInfoAboutEmployee");

        while (resultSet.next()) {
            String name = resultSet.getString("name");
            double salary = resultSet.getDouble("salary");
            int age = resultSet.getInt("age");

            Employee employee = new Employee(name, salary, age);
            employees.add(employee);
        }
        statement.close();
        return employees;

    }
}
