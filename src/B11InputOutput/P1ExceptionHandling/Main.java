package B11InputOutput.P1ExceptionHandling;

public class Main {
    public static void main(String[] args) {


        try {

            int[] numbers = new int[]{1,2,3};
            System.out.println(numbers[5]);

        } catch (Exception exception) {

            System.out.println("Hata : " + exception);

        }





        try {

            int[] numbers = new int[]{1,2,3};
            System.out.println(numbers[5]);

        } catch (StringIndexOutOfBoundsException exception) {
            System.out.println(exception);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println(exception);
        } catch(Exception exception) {
            System.out.println("Hata : " + exception);
        } finally {
            System.out.println("try da çalışsa cath e de düşse ben her türlü çalışırım");
        }





    }
}

/*

-Hatalı kodlar çalışma anında hata fırlatırlar. try-cath blogu sayesinde hata fırlatılabilecek kodlar kontrol
 edilir ve hata fırlatırsa yakalanır. Bu sayede eğer hata olmussa bir işlem hata olmamışsa başka işlem
 yaparak yolumuza devam ederiz.

-try bloğundaki hata outputa basılmak yerine cath bloğuna parametre olarak verilir.

-tyr-catch yanına birde finaly bloğu varsa bu blok her türlü çalışır

-Tüm exceptionlar Exception sınıfından türemiştir.

-birden fazla catch bloğu ile birden fazla türde exception yakalanabilir ve hata türüne göre işlem yapılabilir.


*/
