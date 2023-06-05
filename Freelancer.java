package JavaMONEY;

public class Freelancer extends Employee {
    private int age;

    public Freelancer(String name, double hourlyRate, int age) {
        super(name, hourlyRate);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public double calculateSalary() {
        // Расчет зарплаты фрилансера

        return getHourlyRate() * 20; // Пример: зарплата в час * 20 рабочих дней
    }

    @Override
    public String toString() {
        return "Фрилансер {" +
                "Имя = '" + getName() + '\'' +
                ". Почасовая оплата = " + getHourlyRate() +
                ", Возраст = " + age +
                '}';
    }
}
