package ru.gb.safronov;

public class Manager extends Employee {

    public Manager(int salary, String dateOfJoining) {
        super(salary, dateOfJoining);
    }

    // Метод для повышения зарплаты сотрудникам, кроме руководителей
    public static void raiseSalary(Employee[] employees) {
        for (Employee employee : employees) {
            if (!(employee instanceof Manager)) {
                employee.salary += 5000;
            }
        }
    }
}
