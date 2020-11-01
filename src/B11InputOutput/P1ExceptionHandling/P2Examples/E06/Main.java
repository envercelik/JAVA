package B11InputOutput.P1ExceptionHandling.P2Examples.E06;

public class Main {
    public static void main(String[] args) {


        try {

           // int number = 10/0;

        } catch (Exception exception) {
            System.out.println(exception);

        } finally {
            System.out.println("try da çalışsa cath e de düşse ben her türlü çalışırım");
        }



    }
}
