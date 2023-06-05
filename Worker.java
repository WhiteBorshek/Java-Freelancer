package JavaMONEY;

public class Worker extends Employee {
    private int hoursWorked;

    public Worker(String name, double hourlyRate, int hoursWorked) {
        super(name, hourlyRate);
        this.hoursWorked = hoursWorked;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        // Расчет зарплаты работника
        return getHourlyRate() * hoursWorked; // Пример: зарплата в час * отработанные часы
    }

    @Override
    public String toString() {
        return "Рабочий {" +
                "Имя = '" + getName() + '\'' +
                ".Почасовая Оплата = " + getHourlyRate() +
                ",Отработанные часы = " + hoursWorked +
                '}';
    }
}
