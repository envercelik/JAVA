package B3Inheritance.P6Example5;

public class StudentCreditManager extends BaseCreditManager{

    @Override
    public double calculate(double amount) {
        System.out.println("Credit calculated (student credit manager)");
        return amount * 1.12;
    }
}
