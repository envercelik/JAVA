package B3Inheritance.P6Example5;

public class Main {

    public static void main(String[] args) {

        CreditUI creditUI = new CreditUI();


        creditUI.calculateCredit(new FarmerCreditManager());
        creditUI.calculateCredit(new TeacherCreditManager());
        creditUI.calculateCredit(new StudentCreditManager());

    }

}
