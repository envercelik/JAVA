package B06Generics.P2Examples.E01;

public class GenericPrintClass <T> {


    public void print(T[] array) {
        for (T item : array) {
            System.out.println(item);
        }
    }

}
