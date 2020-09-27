package B04ArraysAndLists.P01Arrays;


public class Main {

    public static void main(String[] args) {


        int[] numbers   = {10,20,30,40,50};  //intialize 1
        int[] numbers2  = new int[] {10,20,30,40,50}; //initialize 2
        int[] numbers3  = new int[5]; //initialize 3
        numbers3[0] = 10;
        numbers3[1] = 20;
        numbers3[2] = 30;
        numbers3[3] = 40;
        numbers3[4] = 50;


        //dizi üzerinde dolaşma
        for (int i=0; i<numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        //alternative
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();



        //diziler genişletilemez
        numbers = new int[2]; //numbers3 e 2 elamanlı yeni dizi atandı. önceki paket oldu.
        numbers[0] = 60;
        numbers[1] =70;

        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();



        //dizilerin kopyalanması
        // 1. yöntem  : dizi elemanlarının tek tek kopyalanması
        // 2. yöntem  : System.arraycopy() methodunun kullanılması
        // 3. yöntem  : Arrays.copyOf()  methodunun kullanılması
        int[] array1 = {1,2,3,4,5};
        int[] array2 = new int[array1.length];

        System.arraycopy(array1,0,array2 ,0 ,array1.length);

        for (int i: array2) {
            System.out.print(i + " ");
        }
        System.out.println();




        //multiple dimension array
                             //row-column
        int[][] matris = new int[3][3];

        matris[0][2] = 10;
        System.out.println(matris[0][2]);



        //diğer veri tiplerinde diziler
        String[] studens = {"Enver Çelik" , "Fırat çelik" , "Engin Çelik" , "Muhammet Çelik"};
        double[] myDoubleArray = {1.1,2.5,3.7};



    }



}


/*

array : aynı tipte verileri tek bir değişkende tutmak için kullanılır.

-diziler referans veri tipidir.Yani dizinin değişkeni stackte , dizinin kendisi ise heap alanında oluşur.

-diziler bir kere tanımlandıktan sonra boyutu değiştirilemez!!!


*/
