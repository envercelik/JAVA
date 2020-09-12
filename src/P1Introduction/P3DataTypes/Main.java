package P1Introduction.P3DataTypes;

public class Main {
    public static void main(String[] args) {



        int intByte     = Integer.BYTES;
        int intMaxValue = Integer.MAX_VALUE;
        int intMinValue = Integer.MIN_VALUE;

        System.out.println("int byte :      " + intByte);
        System.out.println("int max value : " + intMaxValue);
        System.out.println("int min value : " + intMinValue);
        //...


        int     number1 = 1240;  //default tam sayı değeri int olduğundan 1240 int dir.
     // int     number2 =  2147483648;  hata :  int bir değişkenin alabileceği max değerin üzerinde

        double  number3 = 12.74; //default ondalıklı sayı değeri
        double  number4 = 12.74d;

        float   number5 = 12.74f;
     // float   number6 = 12.74; //hata 12.74 default olarak double dir. Double bir değer float değişkene atanamaz.

        long    number7 = 1234567891; //int sayı otomatik olarak long sayıya dönüştürüldü
     // long    number8 = 12345678912; //hata : int sınırını aştık sonuna L koymak zorundayız
        long    number9 = 12345678912L;


        //Max değere +1 eklersek en kucuk sayıya (Min değer) döner.
        System.out.println("Max int value + 1  = " + (intMaxValue +1) );
        System.out.println("Min int value - 1  = " + (intMinValue-1) );


        int     number10 = 5 / 3;
        float   number11 = 5f /3f;
        double  number12 = 5d / 3d;

        System.out.println(number10);
        System.out.println(number11);
        System.out.println(number12);



        char myChar1 = 'D';
        char myChar2 = '\u0044';
        char myChar3 = 68;

        System.out.println(myChar1);
        System.out.println(myChar2);
        System.out.println(myChar3);



    }

}


/*

PRIMITIVE DATA TYPES : Memory'de  tutacağı alan belli olan basit veri tipleridir.

boolean : 1 byte    true - false
char    : 2 bytes   single character (unicode)
byte    : 1 byte    integer
short   : 2 bytes   integer
int     : 4 bytes   integer
long    : 8 bytes   integer
float   : 4 bytes   floating-point number
double  : 8 bytes   floating-point number



Her primitive data type ın bir Wrapper class i vardır.

int   -   Integer
char  -   Character
...



Not : Bir ondalıklı sayının double olduğunu belirtmek için sonuna d harfi float olduğunu belirtmek için f harfi konur.

Not : Default tam sayı int , default ondalıklı sayı double dir.

Not : char bir değişkene değer atamak için tek tırnaklar kullanılır. Aslında değişkene atanan değer
      karakterin tam sayı karşılığıdır. Kullanımda ise karakter karşılığı gösterilir.

unicode : Her karaktere karşılık benzersiz bir numeric değer belirlenmiş uluslararası standarttır. char veri tipinin
          2 byte da tutulma sebebi unicode karakterlerinin 2^15 anca sığmasıdır.



*/
