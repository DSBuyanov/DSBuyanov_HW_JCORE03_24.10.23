package ru.gb.safronov;

public class Employee {
    int salary;
    private String dateOfJoining;

    public Employee(int salary, String dateOfJoining) {
        this.salary = salary;
        this.dateOfJoining = dateOfJoining;
    }

    public int getSalary() {
        return salary;
    }

    public String getDateOfJoining() {
        return dateOfJoining;
    }

    // Метод для сравнения дат без использования условного оператора
    public int compareDates(String date1, String date2) {
        return date1.compareTo(date2);
    }
}
