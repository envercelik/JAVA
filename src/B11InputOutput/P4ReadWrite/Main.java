package B11InputOutput.P4ReadWrite;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String path = "C:\\Users\\devce\\Desktop\\JAVA\\src\\B11InputOutput\\P4ReadWrite\\Files\\students.txt";

        createFile(path);
        fileInfo(path);
        readFile(path);
        writeFile(path);
        readFile(path);


    }



    private static void writeFile(String path) {


        try {

            BufferedWriter writer = new BufferedWriter(new FileWriter(path,true));
            writer.newLine();
            writer.write("Enver Çelik");
            System.out.println("written to file");
            writer.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    private static void readFile(String path) {

        File file = new File(path);

        try {
            Scanner reader = new Scanner(file);
            System.out.println("file is reading...");
            System.out.println("Content : ");

            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);

            }
            reader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

    private static void fileInfo(String path) {

        File file = new File(path);

        if (file.exists()) {
            System.out.println("File name : " + file.getName());
            System.out.println("File path :" + file.getAbsolutePath());
            System.out.println("Is file readable : " + file.canRead());
            System.out.println("Is file writeable : " + file.canWrite());
            System.out.println("File size(byte) :" + file.length() );
        }

    }


    public static void createFile(String path) {

        File file = new File(path);

        try {
            if (file.createNewFile()) {
                System.out.println("File created");
            } else {
                System.out.println("file already exists");
            }
        } catch (IOException exception) {
            System.out.println("Error");
        }

    }

}


/*

Java da dosyaya yazma-okuma işlemleri için bir çok hazır sınıf bulunur.File sınıfı o sınıflardan biridir.

File nesnesi, belleğe almadan doğrudan dosya üzerinden okuma yapar.


 */