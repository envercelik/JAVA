package B01Introduction.P4TypeCasting;

public class Main {
    public static void main(String[] args) {

        // Oto type casting : kucuk veri tipi buyuk veri tipine otomatik olarak dönüşür.

        byte    number1 =   111;
        short   number2 = number1;
        int     number3 = number2;
        long    number4 = number3;

        int     number5 = 1250;
        float   number6 = number5;
        double  number7 = number6;


        short j = 1000;
        int i = (j/2);  // j/2 --> short/int --> int otomatik dönüşür
        int k = j;      // j otomatik olarak int veri tipine dönüştürülüp atanır.





        // Zorunlu type casting : veri kaybı yaşanabilir.

        int     number8 = 121;
        byte    number9 = (byte) number8;  //int olan 121 değeri byte veri tipine sığdığından veri kaybı yaşanmadı

        int     number10 = 1453;
        byte    number11 = (byte) number10; //veri kaybı yaşandı

        double  number12 = 25.78;
        int     number13 = (int) number12; //veri kaybı yaşandı

        short   number14 = 1250;
        short   number15 = (short) (number14 / 2);
        //burada 2 intdir (default)    short/int = int  otomatik olarak büyük veri tipine dönüşür.





        // Fonksiyon ile typecasting

        String   number16 = "150";
        int      number17 = Integer.parseInt(number16); //alternatif: valueOf()
        System.out.println(number17 + 10);






    }
}


/*


Oto dönüşüm :

byte -> short -> int -> long   (soldan sağa otomatik dönüşür)
int -> float -> double         (soldan sağa otomatik dönüşür)

byte/int = int
int + double = double
...


int = short (otomatik olarak int e dönüşür)
double = int (otomatik olarak double a dönüşür)
...




*/

