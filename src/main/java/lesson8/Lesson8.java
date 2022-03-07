package lesson8;

import org.sqlite.core.DB;

import java.sql.SQLException;

public class Lesson8 {
    public static void main(String[] args) {
        try {
            DBHandler dbHandler = new DBHandler();
            Employee employee = new Employee("Nadya", 12500, 15);

            dbHandler.addEmployee(employee);
            dbHandler.deleteEmployee(1);

            System.out.println(dbHandler.getAllEmployee());
            System.out.println(dbHandler.getAllEmployee().size());

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
