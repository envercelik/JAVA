package B06Generics.P1Generics.Generic01;

public class Main {
    public static void main(String[] args) {
        MyList<String> cities = new MyList<>();
        cities.add("Ankara");
        cities.add("İstanbul");
    }


}

/*
Generic sınıflar veri tpini parametre olarak alan sınıflardır. Örneğin ArrayList generic bir sınıftır.

-Kullanılacak sınıf aynı ama nesnelerimiz değişiyorsa generic sınıf kullanmak mantıklıdır.

-interfaceler de generic olarak tanımlanabilir.


*/