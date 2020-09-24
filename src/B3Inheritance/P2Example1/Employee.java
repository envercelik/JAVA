package B3Inheritance.P2Example1;

public class Employee extends Person{

    private double salary;

    public Employee(String id, String nameSurname, String phoneNumber, double salary) {
        super(id, nameSurname, phoneNumber);
        this.salary = salary;
    }


    @Override
    public void showInformation() {
        super.showInformation();
        System.out.println("Salary : " + this.salary);
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }



}
