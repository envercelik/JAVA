package B04ArraysAndLists.P02Examples;


public class E01 {

    public static void main(String[] args) {

        //selection sort
        int[] numbers = {8,2,1,7,5,9,3,6,4};
        selectionSort(numbers);

        for (int number: numbers){
            System.out.print(number + " ");
        }


    }


    public static void selectionSort(int[] numbers) {

        int temp;

        for (int i=0; i<numbers.length; i++) {

            for (int j=i+1; j<numbers.length; j++) {

                if (numbers[i] > numbers[j]) {
                    temp = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = temp;
                }

            }
        }



    }


}
