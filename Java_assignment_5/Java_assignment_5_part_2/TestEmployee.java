public class TestEmployee {
    public static void main(String[] args) {
        NormalEmployee normalEmployee = new NormalEmployee("Harshit Jain", "Mumbai", 1300000);
        BonusEmployee bonusEmployee = new BonusEmployee("Tim Cook", "Pune", 10000, 25);

        System.out.println("Normal Employee:");
        System.out.println("Name: " + normalEmployee.getName());
        System.out.println("Address: " + normalEmployee.getAddress());
        System.out.println("Monthly Salary: " + normalEmployee.calculateMonthlySalary());

        System.out.println();

        System.out.println("Bonus Employee:");
        System.out.println("Name: " + bonusEmployee.getName());
        System.out.println("Address: " + bonusEmployee.getAddress());
        System.out.println("Monthly Salary: " + bonusEmployee.calculateMonthlySalary());
    }
}