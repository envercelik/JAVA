package B11InputOutput.P2InputAndOutput.P6BufferedReaderAndWriter;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        String filePath = "C:\\Users\\devce\\Desktop\\JAVA\\src\\B11InputOutput\\P2InputAndOutput\\P6BufferedReaderAndWriter\\file.txt";

        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath))) {
            System.out.println("writing...");
            for (int i=0; i<10000; i++) {
                bufferedWriter.write("Enver Çelik\n");
            }


        } catch (IOException exception) {
            exception.printStackTrace();
        }






        try(Scanner scanner = new Scanner(new BufferedReader(new FileReader(filePath)))){

            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }







}


/*

BufferedReader-BufferedWriter  FileReader ile FileWriter ın daha performanslı versiyonlarıdır.

FileReader-FileWriter verileri karakter karakter okuduğundan her seferinde hard diske git gel yapar.Bu da performans
kaybına neden olur.

BufferedReader-BufferedWriter ise verileri \n görene kadar okur. Bu sayede hard-diske daha az erişim olur.
Uzun lafın kısası performans artar.

*BufferedReader parametre olarak FileReader alır.
*BufferedWriter parametre olarak FileWriter alır.









*/