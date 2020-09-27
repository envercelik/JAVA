package B04ArraysAndLists.P04ArrayListClass;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        ArrayList<String> groceryList = new ArrayList<>();

        groceryList.add("Cheese");
        groceryList.add("Milk");
        groceryList.add(1,"bread");
        groceryList.set(0,"cream cheese");
        groceryList.add("coke");
        groceryList.add("coke");
        groceryList.remove("coke");



        for (String listItem : groceryList) {
            System.out.println(listItem + " ");
        }

        System.out.println(groceryList.contains("coke"));
        groceryList.remove("coke");
        System.out.println(groceryList.contains("coke"));

        System.out.println(groceryList.indexOf("bread"));





    }

}


/*

Arraylist class:

-Arka planda liste veri yapılarını kullanan ve istenen veri tipinde liste oluşturma imkanı veren hazır sınıftır.

-Arraylere göre en büyük avantajı eleman ekledikçe genişleyen veya eleman sildikçe daralan yapıda olmasıdır.

-Arraylere göre dezavantajı ise daha yavaş olması.Örneğin 500 elemenalı bir arraylist de 5. elemanı silersek
 495 elaman bir sola kaydırılır.

-Sona , başa veya araya  eleman eklenebilir.

*arrayList bir soyutlama örneğidir. Bir liste oluşturabilir elaman ekleyebilir çıkarabilir veya buna benzer bir çok
 işlem yapabiliriz. Ama bu işlemlerin arka planda nasıl yapıldığını bilmek zorunda değiliz.


 */