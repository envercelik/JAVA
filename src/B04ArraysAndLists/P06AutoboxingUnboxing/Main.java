package B04ArraysAndLists.P06AutoboxingUnboxing;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        int number1= 5; //primitive data type
        Integer number2 = Integer.valueOf(number1); //boxing
        int number3 = number2.intValue(); //unboxing

        Integer number = 7; //compiler time     //runtime : 7 --> Integer.valueOf(7)   (autoboxing)





        ArrayList<Integer> numbers = new ArrayList<>();
        /*
        for (int i=0; i<5; i++) {
            numbers.add(Integer.valueOf(i)); //boxing
        }

        for (int i=0; i<numbers.size(); i++) {
            System.out.println(numbers.get(i).intValue());  //unboxing
        }
        */
        //java bu işlemleri otomatik yaptığından bu şekilde yazmamıza gerek yok


        for (int i=0; i<5; i++) {
            numbers.add(i);
        }

        for (int i=0; i<numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

    }







}

/*

primitive veri tipleri ile arraylist oluşturulamaz. primitive veri tiplerinin wrapper classları ile
oluşuturulabilir.


Boxing   : Primitive veri tiplerinin Wrapper class tipine dönüştürülmesidir.
Unboxing : Wrapper class tipindeki verinin tekrar primitive veri tipine dönüştürülmesidir
*java bunu otomatik yaptığından outoboxing olarak adlandırılır.






*/