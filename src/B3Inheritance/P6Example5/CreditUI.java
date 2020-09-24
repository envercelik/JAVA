package B3Inheritance.P6Example5;



public class CreditUI {


    public void calculateCredit(BaseCreditManager creditManager) {



        double result = creditManager.calculate(1000);

        System.out.println(result);
    }


}

