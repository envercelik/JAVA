package B01Introduction.P3DataTypes;

public class Main {
    public static void main(String[] args) {

        //TANIMLAMA

        //datatype  variable name     value(literal)(defaullt tam sayı değeri int olduğundan 5 intdir.)
        int         number1 =          5;              //declaration statement




        //TAMSAYI VERİ TİPLERİ

        //byte
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue  = Byte.MAX_VALUE;

        System.out.println("Byte Minumum Value : " + myMinByteValue);
        System.out.println("Byte Maximum Value : " + myMaxByteValue);


        //short
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue  = Short.MAX_VALUE;

        System.out.println("Short Minumum Value : " + myMinShortValue);
        System.out.println("Short Maximum Value : " + myMaxShortValue);


        //int


        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue  = Integer.MAX_VALUE;

        System.out.println("Integer Minumum Value : " + myMinIntValue);
        System.out.println("Integer Maximum Value : " + myMaxIntValue);
        System.out.println("Busted Max value : "  + (myMaxIntValue+1)); //en küçük değere dönüyor
        System.out.println("Busted Min value : "  + (myMinIntValue-1)); //en büyük değere dönüyor.


        //int myMaxIntTest = 2147483648; //hata int max değer  aşıldı
        int myVariable = 2_147_483_647;  //daha okunabilir




        //long

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue  = Long.MAX_VALUE;

        System.out.println("Long Minumum Value : " + myMinLongValue);
        System.out.println("Long Maximum Value : " + myMaxLongValue);

        //long bigLongLiteralValue = 2_147_483_647_256; hata : sayı int değer aralığının üzerinde
        long bigLongLiteralValue = 2_147_483_647_256L;





        //ONDALIKLI SAYI VERİ TİPLERİ

        //float

        //float myFloatValue1 = 5.25; //hata : 5.25 default olarak doubledır.
        float myFloatValue1 = 5.25f;
        float myFloatValue2 = 5; //int otomatik olarak float a dönüştürülür.
        float myFloatValue3 = 5f;


        //double
        double myDoubleValue1 = 2.25;
        double myDoubleValue2 = 2; //int otomatik olarak double a dönüştürülür.
        double myDoubleValue3 = 2.25f;
        double myDoubleValue4 = 2f;







        //KARAKTER VERİ TİPİ

        //char
        char myChar1 = 'D';
        char myChar2 = '\u0044';
        char myChar3 = 68;

        System.out.println(myChar1);
        System.out.println(myChar2);
        System.out.println(myChar3);




        //MANTIKSAL VERİ TİPİ

        //boolean
        boolean myTrueBooleanValue = true;
        boolean isCustomerOverTwentyOne = false;





        //STRING VERİ TİPİ


        String myString = "This is a string";
        System.out.println("My string is equal to " + myString);
        myString = myString + " , and this is more.";
        myString = myString + " \u00A9 2020";
        System.out.println(myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString+myInt;
        System.out.println("last string is equal to " + lastString);


        String m = "Java\tProgramming\tlanguage";
        System.out.println(m);


        String n = "Java\nProgramming\nlanguage";
        System.out.println(n);


        System.out.println( n.length());
        System.out.println(n.charAt(5));
        System.out.println(n.concat(" is a my favaurite programing language"));
        System.out.println(n.startsWith("J"));
        System.out.println(n.endsWith("e"));
        System.out.println(n.indexOf("o"));
        System.out.println(n.lastIndexOf("e"));
        System.out.println(m.replace('a','-'));
        System.out.println(m.substring(2,10));

        String myString2 =  "Java Programming language";

        for (String vocabulary : myString2.split(" ")) {
            System.out.println(vocabulary);
        }

        System.out.println(myString2.toLowerCase());
        System.out.println(myString2.toUpperCase());



    }

}


/*

VARIABLE (DEĞİŞKEN) :

-Java da bir değişken tanımladığımızda onun veri tipini belirtmek zorundayız ve bu değişkene sadece
 veri tipine uygun değerler atanabilir.

-Değişkenlere atadığımız değerlere literal denir . Literaller tanımladığımız sabit değerlerdir.(125, 12.5 , 'c' , "hello"...)

-Javada tamsayı literali default olarak int , ondalıklı sayı ise double olarak kabul edilir.

*Java de değişken isimleri kucuk harfle başlar sonraki kelimelerin baş harfleri buyuk olarak devam eder.
 (camel case) (topluluk kuralı)







PRIMITIVE DATA TYPES (İLKEL VERİ TİPLERİ) :

-Memory'de  tutacağı alan belli olan basit, değer bazlı veri tipleridir.


Tamsayılar (integer) :

-byte      : 1 byte   -128 ile 127  arasında değer alır.
-short     : 2 byte   -32768 ile 32767
-int       : 4 byte    -2.147.483.648 ile 2.147.483.647
-long      : 8 byte


Ondalıklı sayılar (floating point number):

-float    : 4 byte
-double   : 8 byte


Karakter ve mantıksal :

boolean  : 1 byte   (true veya false) veya ( 0 veya 1) değerini alır
char     : 2 byte   (tüm unicode karakterler) sadece 1 tane tutabilir. (tek tırnaklar arasında olmak zorundadır)




-Primitive veri tipleri memory'de stack alanında tutulur.


-Her primitive data type ın bir Wrapper class i vardır. Wrapper class primitive veri tipi ile ilgili bilgileri tutan
ve bazı methodlara sahip sarmalayıcı bir sınıftır.

int   -   Integer
char  -   Character
...


-Bir ondalıklı sayının double olduğunu belirtmek için sonuna d harfi float olduğunu belirtmek için f harfi konur.



*Programlama dünyasında %99 int - double ikilisi kullanılır.
*tc noyu metinsel olarak tut
*char veri tipi örneğin bir oyunda basılan karakteri tutmak için veya son basılan karakteri tutmak için kullanışlıdır.
*Aslında char da numerik bir veri türüdür. Karakteri değil karakterin karşılık geldiği sayısal değeri tutar.
*unicode : her karakterin bir numeric karşılığı belirlenmiştir. (uluslar arası standart)






String DATA TYPE :

-Primitive bir veri tipi değil, veri tipi olarak özelleştirilmiş ve kullanımı kolaylaştırılmış
 bir sınıftır. Karakter dizilerini tutar.

-String immutable bir classtır. Eğer stringin değerini değiştirirsen değeri değişmez yeni bir string oluşur.

* string + string  = string
  string + numeric = string

*/
