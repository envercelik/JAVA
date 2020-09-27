package B04ArraysAndLists.P02Examples;



public class E02 {

    public static void main(String[] args) {

        //Binary search

        int[] numbers = {8,2,1,7,9,3,6,4};
        E01.selectionSort(numbers);
        binarySearch(numbers , 7);
        binarySearch(numbers , 10);
        binarySearch(numbers , 5);
        binarySearch(numbers , -10);





    }


    public static void binarySearch (int[] numbers , int number) {

        if (number < numbers[0] || number > numbers[numbers.length-1]) {
            System.out.println("number not found : " + number );
            return;
        }

        int first = 0;
        int last = numbers.length-1;



        while (first != last) {

            int mid = (first + last) / 2;

            if (numbers[mid] == number) {
                System.out.println("number found : " + number);
                return;
            }


            if (number > numbers[mid]) {
                first = mid+1;
            } else {
                last = mid-1;
            }

        }

        System.out.println("number not found : " + number );

    }
}
