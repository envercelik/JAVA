package B11InputOutput.P1ExceptionHandling.P3Examples.E07;

public class Main {
    public static void main(String[] args) {

        try {
            function1();

        } catch (Exception e) {

        }


    }


    public static void function1() {
        function2();
    }

    public static void function2() {
        function3();
    }

    public static void function3() {
            int number = 10/0;
    }

}


/*
function3 bir Artihmetic exception fırlatır. Biz bu exception ı main dahil istediğimiz methodda yakalayabiliriz.
Eğer mainde de yakalamassak program paket olur. Bi zahmet bir yerde yakala yani

*methodlar sırayla çağrılırken stackte tutulur. En son method çalıştıktan sonra exception fırlata fırlata geri
döner.(stackten çıkar)
*/
