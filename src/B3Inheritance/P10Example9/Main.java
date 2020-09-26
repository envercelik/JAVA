package B3Inheritance.P10Example9;

public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic" , "Sausage" ,3.56 ,"White");

        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce" , 0.75);
        hamburger.addHamburgerAddition3("Cheese" , 1.13);

        System.out.println("Total burger price is : $" + hamburger.itemizeHamburger());

        HealthyHamburger healthyHamburger = new HealthyHamburger("Bacon" , 5.67);
        healthyHamburger.addHealthyHamburgerAddition1("Egg" , 5.43);
        healthyHamburger.addHealthyHamburgerAddition2("Lentils" ,3.41);
        System.out.println("Total healthy burger price is : $" + healthyHamburger.itemizeHamburger());

        DeluxeHamburger deluxeHamburger = new DeluxeHamburger();
        deluxeHamburger.itemizeHamburger();



    }
}
