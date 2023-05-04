package jobagency;

import java.util.Random;

public class PnD implements Observer {

    private String name;
    private int salary;

    public PnD(String name) {
        this.name = name;
        this.salary = new Random().nextInt(100);
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary) {
        if (salary <= this.getSalary()) {
            System.out.println(String.format("PnD %s: Я жду лучшей работы! (company, salary) = %s, %d", name, nameCompany, salary));
        } else {
            System.out.println(String.format("PnD %s: Хорошо. Я готов к этой работе! (company, salary) = %s, %d", name, nameCompany, salary));
        }
    }
}
