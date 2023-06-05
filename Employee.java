package JavaMONEY;

public abstract class Employee {
    private String name;
    private double hourlyRate;

    public Employee(String name, double hourlyRate) {
        this.name = name;
        this.hourlyRate = hourlyRate;
    }

    public String getName() {
        return name;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public abstract double calculateSalary();

    @Override
    public String toString() {
        return "Сотрудник {" +
                "имя = '" + name + '\'' +
                ".Почасовая оплата = " + hourlyRate +
                '}';
    }
}


