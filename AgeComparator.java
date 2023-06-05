package JavaMONEY;

import java.util.Comparator;

public class AgeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee employee1, Employee employee2) {
        if (employee1 instanceof Freelancer && employee2 instanceof Freelancer) {
            int age1 = ((Freelancer) employee1).getAge();
            int age2 = ((Freelancer) employee2).getAge();
            return Integer.compare(age1, age2);
        }
        return 0;
    }
}
