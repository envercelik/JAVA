package B06Generics.P2Examples.E01;

public class Main {

    public static void main(String[] args) {

        Character[] characters = {'E','n','v','e','r'};
        Integer[]   numbers    =  {0,1,2,3,4,5,6,7,8,9};

        GenericPrintClass<Character> genericPrintClass = new GenericPrintClass<>();
        genericPrintClass.print(characters);

        GenericPrintClass<Integer> genericPrintClass1 = new GenericPrintClass<>();
        genericPrintClass1.print(numbers);


        genericPrintMethod(characters);
        genericPrintMethod(numbers);


    }

    public static <T> void genericPrintMethod(T[] array) {

        for (T item : array) {
            System.out.println(item);
        }
    }




}

/*

Generic class olmasaydı karakter basmak için ayrı bir sınıf integer basmak için ayrı bir sınıf yazmamız gerekirdi.

*/