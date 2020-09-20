package B2Classes.Classes7;

public class Main {

    public static void main(String[] args) {

        Ram ram = new Ram("xx" , 2048);
        DisplayCard displayCard = new DisplayCard("xx" , 1024);
        MotherBoard motherBoard = new MotherBoard("xx" , ram , displayCard);

        Display display = new Display("xx" , "1920X180");


        Computer computer = new Computer(motherBoard,display);

        String resulation = computer.getDisplay().getResulation();
        System.out.println(resulation);


    }

}


/*

Compositon : Bir classin başka bir classi özelliği olarak kullanmasıdır. Bu konsept bir bütünü parçlardan
             oluştururken kullanışlıdır. Bu classlar arasında sahiplik ilişkisi oluşur. (has a)

Örneğin bir bilgisayar ekran , anakartdan ... oluşur. Bir bilgisayar ekran ve anakarta sahiptir diyebiliriz.






*/