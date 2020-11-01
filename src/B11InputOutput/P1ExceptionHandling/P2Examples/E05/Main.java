package B11InputOutput.P1ExceptionHandling.P2Examples.E05;

public class Main {
    public static void main(String[] args) {

        //birden fazla hata türünü - birden fazla catch bloğu ile yakalama
        //Üst class olan Exception ile tek cath bloğu ile de yakalanabilirdi.
        //*Bir ifade exception fırlattığında cath blokları yukarıdan aşağı doğru denenir ve uygun olan a girer.

        try {

           // int number = 10/0;

            int[] numbers = {1,2,3};
            System.out.println(numbers[10]);

        } catch (ArithmeticException e) {
            System.out.println("Divided zero Error"  );


        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Array index Error " );
        }




        System.out.println("This statement is working");

    }
}
