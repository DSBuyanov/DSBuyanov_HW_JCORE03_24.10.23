package ru.gb.safronov;

public class Main {
    public static void main(String[] args) {
        // Создаем массив сотрудников
        Employee[] employees = new Employee[3];
        employees[0] = new Employee(50000, "2021-01-01");
        employees[1] = new Manager(70000, "2020-01-01");
        employees[2] = new Employee(60000, "2022-01-01");

        // Повышаем зарплату сотрудникам
        Manager.raiseSalary(employees);

        // Выводим информацию о сотрудниках
        for (Employee employee : employees) {
            System.out.println("Salary: " + employee.getSalary());
        }
    }
}
